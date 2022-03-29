package com.startjava.graduation_project;

import java.util.Scanner;

public class Bookshelf {
    private String name = "0";
    private String author = "0";
    private int year = 0;
    private Book[] bookshelf = new Book[10];
    private Scanner console = new Scanner(System.in);
    private int placeNum;
    private boolean isAbleDo = false;
    private int bookSum = 0;
    private int freeSpaceSum = 10;

    public Book makeBook(String name, String author, int year) {
        return new Book(name, author, year);
    }

    public void startProgramm() {
        System.out.println("\nВАС ПРИВЕТСТВУЕТ ИНТЕРАКТИВНАЯ КНИЖНАЯ ПОЛКА!");
        for (int i = 0; i < bookshelf.length; i++) {
            bookshelf[i] = makeBook(name, author, year);
        }
    }

    private void checkBookExist() {
        for (int i = 0; i < bookshelf.length; i++) {
            if (!bookshelf[i].getName().equals("0")) {
                isAbleDo = true;
            }
        }
    }

    public void showBookshelf() {
        System.out.println("\nСостояние книжной полки: ");
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].getName().equals("0")) {
                System.out.print("_");
            } else {
                System.out.print("|" + (i + 1) + "|");
            }
        System.out.print(" ");
        }
        System.out.println();
        for (int j = 0; j < bookshelf.length; j++) {
            if (bookshelf[j].getName().equals("0")) {
                System.out.println("<                                           >");
            } else {
                System.out.println("< " + bookshelf[j].getName() + ", " + bookshelf[j].getAuthor() + ", " + bookshelf[j].getYear() + " >");
            }
        }
    }

    public void showBookshelfShort() {
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.print("_");
            if (bookshelf[i].getName().equals("0")) {
                System.out.print(i + 1);

            } else {
                System.out.print("|" + (i + 1) + "|");
            }
            System.out.print("_");
        }
    }

    public void addBook() {
        System.out.println("На место под каким номером вы хотите добавить книгу?");
        showBookshelfShort();
        System.out.println();
        placeNum = console.nextInt() - 1;
        if (placeNum > 9 || placeNum < 0) {
            System.out.println("Введите существующий номер места!");
        } else if (!bookshelf[placeNum].getName().equals("0")) {
            System.out.println("На этом месте уже стоит книга. Выберете другое место или удалите книгу через меню.");
        } else {
            System.out.println("Введите название книги:");
            console.nextLine();
            name = console.nextLine();
            System.out.println("Введите автора книги:");
            author = console.nextLine();
            System.out.println("Введите год написания книги:");
            year = console.nextInt();
            bookshelf[placeNum] = makeBook(name, author, year);
            System.out.println("Книга добавлена!");
        }
    }

    public void deleteBook() {
        checkBookExist();
        if (isAbleDo) {
            System.out.println("Книгу под каким номером вы хотите удалить?");
            showBookshelfShort();
            System.out.println();
                placeNum = console.nextInt() - 1;
                if (placeNum > 9 || placeNum < 0) {
                    System.out.println("Введите существующий номер места!");
                } else {
                    if (bookshelf[placeNum].getName().equals("0")) {
                        System.out.println("Книги на данном месте нет.");
                    } else {
                        bookshelf[placeNum] = makeBook("0", "0", 0);
                        System.out.println("Книга под номером " + (placeNum + 1) + " удалена.");
                    }
                }
        } else {
            System.out.println("\nК сожалению, на вашей книжной полке книг нет.");
        }
    }

    public void moveBook() {
        checkBookExist();
        if (isAbleDo) {
            System.out.println("Книгу под каким номером вы хотите переместить?");
            showBookshelfShort();
            System.out.println();
            placeNum = console.nextInt() - 1;
            if (placeNum > 9 || placeNum < 0) {
                System.out.println("Введите существующий номер места!");
            } else {
                if (bookshelf[placeNum].getName().equals("0")) {
                    System.out.println("Книги на данном месте нет.");
                } else {
                    Book buffer = new Book(name, author, year);
                    buffer = bookshelf[placeNum];
                    bookshelf[placeNum] = makeBook("0", "0", 0);
                    System.out.println("На какое место хотите переместить книгу?");
                    showBookshelfShort();
                    System.out.println();
                    int placeNum2;
                    placeNum2 = console.nextInt() - 1;
                    if (placeNum2 > 9 || placeNum2 < 0) {
                        System.out.println("Введите существующий номер места!");
                    } else {
                        bookshelf[placeNum] = bookshelf[placeNum2];
                        bookshelf[placeNum2] = buffer;
                        System.out.println("Книга с места " + (placeNum + 1) + " переместилась на место " + (placeNum2 + 1));
                        showBookshelfShort();
                    }
                }
            }
        } else {
            System.out.println("К сожалению, на вашей книжной полке нет книг.");
        }
    }

    public void findBook() {
        checkBookExist();
        System.out.println("Какую книгу вы хотите найти? [введите название]");
        name = console.nextLine();
        for (int i = 0; i < bookshelf.length; i++) {
            if (name.equals(bookshelf[i].getName())) {
                System.out.println("Книга, которую вы ищете, находится на месте номер " + (i + 1));
                return;
            }
        }
        System.out.println("Книги с таким названием на полке нет!");
    }

    public void checkBookNum() {
        bookSum = 0;
        for (int i = 0; i < bookshelf.length; i++) {
            if (!bookshelf[i].getName().equals("0")) {
                bookSum++;
            }
        }
        System.out.println("На полке " + bookSum + " книг (-и) и " + (10 - bookSum) + " свободных мест.");
    }
}
