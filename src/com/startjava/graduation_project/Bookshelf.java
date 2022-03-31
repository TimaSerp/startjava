package com.startjava.graduation_project;

import java.util.Scanner;
import java.util.Arrays;

public class Bookshelf {
    private Book[] bookshelf = new Book[10];
    private Scanner console = new Scanner(System.in);
    private String name;
    private int placeNum;


    public void startProgramm() {
        System.out.println("\nВАС ПРИВЕТСТВУЕТ ИНТЕРАКТИВНАЯ КНИЖНАЯ ПОЛКА!");
        Arrays.fill(bookshelf, new Book(null, null, 0));
    }

    private boolean checkBookExist() {
        for (Book book : bookshelf) {
            if (book.getName() != null) {
                return true;
            }
        }
        return false;
    }

    public void showBookshelf() {
        System.out.println("\nСостояние книжной полки: ");
        for (int i = 0; i < bookshelf.length; i++) {
            String bookshelfCondition = bookshelf[i].getName() == null ? "_" : "|" + (i + 1) + "|";
            System.out.print(bookshelfCondition);
            System.out.print(" ");
        }
        System.out.println();
        for (Book book : bookshelf) {
            String bookshelfCondition = book.getName() == null ? "<                                           >" :
                    "< " + book.getName() + ", " + book.getAuthor() + ", " + book.getYear() + " >";
            System.out.println(bookshelfCondition);
        }
    }

    public void showBookshelfShort() {
        for (int i = 0; i < bookshelf.length; i++) {
            String bookshelfCondition = bookshelf[i].getName() == null ? "_" + (i + 1) + "_" : "|" + (i + 1) + "|";
            System.out.print(bookshelfCondition);
        }
    }

    public void addBook() {
        String author;
        int year;
        while (true) {
            System.out.println("На место под каким номером вы хотите добавить книгу? [0 - выход]");
            showBookshelfShort();
            System.out.println();
            placeNum = console.nextInt() - 1;
            if (placeNum > 9 || placeNum < -1) {
                System.out.println("Введите существующий номер места!");
            } else if (placeNum == -1) {
                return;
            } else if (bookshelf[placeNum].getName() != null) {
                System.out.println("На этом месте уже стоит книга. Выберете другое место или удалите книгу через меню.");
            } else {
                System.out.println("Введите название книги, автора и год через запятую без пробела:");
                console.nextLine();
                String[] books = console.nextLine().split(",");
                name = books[0];
                author = books[1];
                year = Integer.parseInt(books[2]);
                bookshelf[placeNum] = new Book(name, author, year);
                System.out.println("Книга добавлена!");
                return;
            }
        }
    }

    public void deleteBook() {
        if (checkBookExist()) {
            while (true) {
                System.out.println("Книгу под каким номером вы хотите удалить? [0 - выход]");
                showBookshelfShort();
                System.out.println();
                placeNum = console.nextInt() - 1;
                if (placeNum > 9 || placeNum < -1) {
                    System.out.println("Введите существующий номер места!");
                } else if (placeNum == -1) {
                    return;
                } else if (bookshelf[placeNum].getName() == null) {
                    System.out.println("Книги на данном месте нет.");
                } else {
                    bookshelf[placeNum] = new Book(null, null, 0);
                    System.out.println("Книга под номером " + (placeNum + 1) + " удалена.");
                    return;
                }
            }
        } else {
            System.out.println("\nК сожалению, на вашей книжной полке книг нет.");
        }
    }

    public void moveBook() {
        if (checkBookExist()) {
            while (true) {
                System.out.println("\nКнигу под каким номером вы хотите переместить? [0 - выход]");
                showBookshelfShort();
                System.out.println();
                placeNum = console.nextInt() - 1;
                if (placeNum > 9 || placeNum < -1) {
                    System.out.println("Введите существующий номер места!");
                } else if (placeNum == -1) {
                    return;
                } else if (bookshelf[placeNum].getName() == null) {
                    System.out.println("Книги на данном месте нет.");
                } else {
                    Book buffer;
                    buffer = bookshelf[placeNum];
                    bookshelf[placeNum] = new Book(null, null, 0);
                    while (true) {
                        System.out.println("На какое место хотите переместить книгу?");
                        showBookshelfShort();
                        System.out.println();
                        int placeNum2 = console.nextInt() - 1;
                        if (placeNum2 > 9 || placeNum2 < 0) {
                            System.out.println("Введите существующий номер места!");
                        } else {
                            bookshelf[placeNum] = bookshelf[placeNum2];
                            bookshelf[placeNum2] = buffer;
                            System.out.println("Книга с места " + (placeNum + 1) + " переместилась на место " + (placeNum2 + 1));
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("К сожалению, на вашей книжной полке нет книг.");
        }
    }

    public void findBook() {
        if (checkBookExist()) {
            System.out.println("Какую книгу вы хотите найти? [Введите название]");
            console.nextLine();
            name = console.nextLine();
            for (int i = 0; i < bookshelf.length; i++) {
                if (name.equals(bookshelf[i].getName())) {
                    System.out.println("Книга, которую вы ищете, находится на месте номер " + (i + 1));
                    return;
                }
            }
            System.out.println("Книги с таким названием на полке нет!");
        } else {
            System.out.println("К сожалению, на вашей книжной полке нет книг.");
        }
    }

    public void checkBookNum() {
        int bookSum = 0;
        for (Book book : bookshelf) {
            int checkBookNum = book.getName() != null ? bookSum++: bookSum;
        }
        System.out.println("На полке " + bookSum + " книг (-и) и " + (10 - bookSum) + " свободных мест.");
    }
}