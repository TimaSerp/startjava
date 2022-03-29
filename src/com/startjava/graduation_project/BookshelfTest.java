package com.startjava.graduation_project;

import java.util.Scanner;

public class BookshelfTest {

    private static void getMenu() {
        System.out.println("\n\nЧто вы хотите сделать?");
        System.out.println("___________________________________________________________");
        System.out.println("|                     1. Добавить книгу                   |");
        System.out.println("|_________________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("|                     2. Удалить книгу                    |");
        System.out.println("|_________________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("|                    3. Переместить книгу                 |");
        System.out.println("|_________________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("|                      4. Найти книгу                     |");
        System.out.println("|_________________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("| 5. Узнать число всех книг и количество свободного места |");
        System.out.println("|_________________________________________________________|");
        System.out.println("___________________________________________________________");
        System.out.println("|                         6. Выйти                        |");
        System.out.println("|_________________________________________________________|");
        System.out.print("\n>  ");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Bookshelf game = new Bookshelf();
        game.startProgramm();
        while (true) {
            game.showBookshelf();
            getMenu();
            int command = console.nextInt();
            if (command == 1) {
                game.addBook();
            } else if (command == 2) {
                game.deleteBook();
            } else if (command == 3) {
                game.moveBook();
            } else if (command == 4) {
                game.findBook();
            } else if (command == 5) {
                game.checkBookNum();
            } else if (command == 6) {
                break;
            }
        }
    }
}