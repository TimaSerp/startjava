package com.startjava.lesson_1.cycles;

public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("\nПодсчет суммы четных и нечетных чисел");
        int count = -10;
        int countEnd = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(count % 2 == 0) {
                sumEven = sumEven + count;
            } else {
                sumOdd = sumOdd + count;
            }
        count++;
        } while(count <= countEnd);
        System.out.println("Сумма чётных чисел равна " + sumEven);
        System.out.println("Сумма нечётных чисел равна " + sumOdd);

        //Вывод чисел между max и min
        System.out.println("\nВывод чисел между max и min");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = 0;
        int min = 0;
        if(a > b && a > c) {
                max = a;
        } else if(b > c && b > a) {
                max = b;
        } else if(c > a && c > b) {
                max = c;
        } else {
            System.out.println("Какие-то числа равны.");
        }
        if(a < b && a < c) {
                min = a;
        } else if(b < c && b < a) {
                min = b;
        } else if(c < a && c < b) {
                min = c;
        } else {
            System.out.println("Какие-то числа равны.");
        }
        for(int i = min; i <= max; i++) {
            System.out.println(i);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("\nВывод реверсивного числа и суммы его цифр");
        int srcNum1 = 1234;
        int numberClass = 1000;
        int reverseNumberClass = 1;
        int sum = 0;
        int numberOfNumberClass;
        int reverseNumber = 0;
        System.out.println("Вы ввели число " + srcNum1);
        while(srcNum1 != 0) {
            numberOfNumberClass = srcNum1 / numberClass;
            sum = sum + numberOfNumberClass;
            reverseNumber = reverseNumber + numberOfNumberClass * reverseNumberClass;
            srcNum1 = srcNum1 % numberClass;
            numberClass = numberClass / 10;
            reverseNumberClass = reverseNumberClass * 10;
        }
        System.out.println("Сумма цифр числа равна " + sum);
        System.out.println("Реверсивное число равно " + reverseNumber);

        //Вывод чисел на консоль в несколько строк
        System.out.println("\nВывод чисел на консоль в несколько строк");
        int total = 24;
        int symbolsInLine = 5;
        int iterrationStep = 2;
        int buffer = 1;
        for(int i = 1; i <= (total / iterrationStep / symbolsInLine) + 1; i++) {
            for(int j = buffer; j < (buffer + symbolsInLine * iterrationStep); j = j + iterrationStep) {
                if(j <= total) {
                    System.out.format("%02d", j);
                    System.out.print(" ");
                } else {
                    System.out.format("%02d", 0);
                    System.out.print(" ");
                }
            }
            System.out.println();
            buffer = buffer + symbolsInLine * iterrationStep;
        }

        //Проверка количества единиц на четность
        System.out.println("\nПроверка количества единиц на четность");
        int quantity = 3_141_591;
        int numberClass1 = 1_000_000;
        int sum1 = 0;
        int quantityOfNumberClass;
        System.out.println("Ваше число " + quantity);
        while(quantity > 0) {
            quantityOfNumberClass = quantity / numberClass1;
            if(quantityOfNumberClass == 1) {
                sum1 = sum1 + 1;
            }
            quantity = quantity % numberClass1;
            numberClass1 = numberClass1 / 10;
        }
        System.out.println("В данном числе " + sum1 + " единиц(ы)");
        if(sum1 % 2 == 0) {
            System.out.println("Их сумма чётная.");
        } else {
            System.out.println("Их сумма нечётная.");
        }

        //Отображение фигур в консоли
        System.out.println("\nОтображение фигур в консоли");
        char squareSymbol = 42;
        char triangleSymbol = 35;
        char rhombSymbol = 36;
        int symbolsInTriangleLine = 5;
        int symbolsInRhombLine = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(squareSymbol);
            }
        System.out.println();
        }
        while(symbolsInTriangleLine > 0) {
            for(int i = symbolsInTriangleLine; i > 0; i--) {
                System.out.print(triangleSymbol);
            }
        System.out.println();
        symbolsInTriangleLine--;
        }
        do {
            for(int i = symbolsInRhombLine; i > 0; i--) {
                System.out.print(rhombSymbol);
            }
        System.out.println();
        symbolsInRhombLine++;
        } while(symbolsInRhombLine <= 3);
        do {
            for(int i = symbolsInRhombLine; i > 2; i--) {
                System.out.print(rhombSymbol);
            }
        System.out.println();
        symbolsInRhombLine--;
        } while(symbolsInRhombLine > 2);

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом");
        int srcNum = 12321;
        int numberAmount = 5;
        int checkUnit = 10000;
        boolean isSame = true;
        System.out.println("Ваше число " + srcNum);
        for(int i = 1; i <= numberAmount / 2; i++) {
            if(srcNum / checkUnit != srcNum % 10) {
                isSame = false;
            }
            srcNum = srcNum % checkUnit / 10;
            checkUnit = checkUnit / 100;
        }
        if(isSame) {
            System.out.println("Данное число является палиндромом.");
        } else {
            System.out.println("Данное число не является палиндромом.");
        }

        //Определение, является ли число счастливым
        System.out.println("\nОпределение, является ли число счастливым");
        int srcHappyNum = 345264;
        int numberAmount1 = 6;
        int checkDigit = 100000;
        int leftNumber, rightNumber; 
        int sumLeftNumbers = 0;
        int sumRightNumbers = 0;
        System.out.println("Вы ввели число " + srcHappyNum);
        if(numberAmount1 % 2 == 0) {
            for(int i = 1; i <= numberAmount1 / 2; i++) {
                leftNumber = srcHappyNum / checkDigit;
                rightNumber = srcHappyNum % 10;
                sumLeftNumbers = sumLeftNumbers + leftNumber;
                sumRightNumbers = sumRightNumbers + rightNumber;
                srcHappyNum = srcHappyNum % checkDigit / 10;
                checkDigit = checkDigit / 100;
            }
            if(sumLeftNumbers == sumRightNumbers) {
                System.out.println("Ваше число счастливое!");
            } else {
                System.out.println("Ваше число несчастливое.");
            }
        } else {
            System.out.println("Количество цифр вашего числа должно быть чётное.");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("\nВывод таблицы умножения Пифагора");
        for(int i = 2; i <= 9; i++) {
            System.out.format("%02d", i);
            System.out.print(" ");
        }
        System.out.println();
        for(int i = 2; i <= 9; i++) {
            System.out.format("%02d", i * i);
            System.out.print(" ");
        }
    }
}