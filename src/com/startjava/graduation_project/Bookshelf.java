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
            if (checkInput(placeNum)) {
                if (placeNum == -1) {
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
    }

    public void deleteBook() {
        if (!checkBookExist()) {
            System.out.println("\nК сожалению, на вашей книжной полке книг нет.");
        } else {
            while (true) {
                System.out.println("Книгу под каким номером вы хотите удалить? [0 - выход]");
                if (checkInput(placeNum)) {
                    if (placeNum == -1) {
                        return;
                    } else if (bookshelf[placeNum].getName() == null) {
                        System.out.println("Книги на данном месте нет.");
                    } else {
                        bookshelf[placeNum] = new Book(null, null, 0);
                        System.out.println("Книга под номером " + (placeNum + 1) + " удалена.");
                        return;
                    }
                }
            }
        }
    }

    public void moveBook() {
        if (!checkBookExist()) {
            System.out.println("К сожалению, на вашей книжной полке нет книг.");
        } else {
            while (true) {
                System.out.println("\nКнигу под каким номером вы хотите переместить? [0 - выход]");
                if (checkInput(placeNum)) {
                    if (placeNum == -1) {
                        return;
                    } else if (bookshelf[placeNum].getName() == null) {
                        System.out.println("Книги на данном месте нет.");
                    } else {
                        Book buffer;
                        int temp = placeNum;
                        buffer = bookshelf[placeNum];
                        bookshelf[placeNum] = new Book(null, null, 0);
                        while (true) {
                            System.out.println("На какое место хотите переместить книгу?");
                            if (checkInput(placeNum)) {
                                bookshelf[temp] = bookshelf[placeNum];
                                bookshelf[placeNum] = buffer;
                                System.out.println("Книга с места " + (temp + 1) + " переместилась на место " + (placeNum + 1));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public void findBook() {
        if (!checkBookExist()) {
            System.out.println("К сожалению, на вашей книжной полке нет книг.");
        } else {
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
        }
    }

    public void checkBookNum() {
        int bookSum = 0;
        for (Book book : bookshelf) {
            int checkBookNum = book.getName() != null ? bookSum++ : bookSum;
        }
        System.out.println("На полке " + bookSum + " книг (-и) и " + (10 - bookSum) + " свободных мест");
    }

    private boolean checkBookExist() {
        for (Book book : bookshelf) {
            if (book.getName() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean checkInput(int placeNum) {
        showBookshelfShort();
        System.out.println();
        this.placeNum = console.nextInt() - 1;
        if (this.placeNum > 9 || this.placeNum < -1) {
            System.out.println("Введите существующий номер места!");
            return false;
        }
        return true;
    }
}