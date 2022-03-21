public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        int age = 18;
        double height = 1.81;
        boolean manGender = true;
        String name = "Timofei";
        if(age > 17) {
            System.out.println("Вы уже можете купить пиво в магазине, поздравляю!");
        } else {
            System.out.println("К сожалению, пиво вам не продадут.");
        }
        if(!manGender) {
            System.out.println("Вы женщина!");
        } else {
            System.out.println("Вы мужчина!");
        }
        if(height < 1.80) {
            System.out.println("Возьмите стремянку, чтобы достать банку с верхней полки");
        } else {
            System.out.println("Вы достаточно высокий, чтобы достать банку с верхней полки!");
        }
        char firstLetterOfTheName = name.charAt(0);
        if(firstLetterOfTheName == 'T') {
            System.out.println("Ваше имя начинается на букву Т.");
        } else if(firstLetterOfTheName == 'M') {
            System.out.println("Ваше имя начинается с буквы М.");
        } else {
            System.out.println("Ваше имя не начинается с букв Т и М.");
        }

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");
        int a = 5;
        int b = 6;
        if(a > b) {
            System.out.println("Максимальное число: " + a + ", а минимальное: " + b);
        } else if(b > a) {
            System.out.println("Максимальное число: " + b + ", а минимальное: " + a);
        } else {
            System.out.println("Данные числа равны");
        }

        //Работа с числом
        System.out.println("Работа с числом");
        int number = 78;
        if(number % 2 == 0) {
            System.out.println("Ваше число чётное");
        } else {
            System.out.println("Ваше число нечётное");
        }
        if(number < 0) {
            System.out.println("Ваше число отрицательное");
        } else if(number == 0) {
            System.out.println("Ваше число равно 0");
        } else {
            System.out.println("Ваше число положительное");
        }

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");
        int c = 476;
        int d = 378;
        int cHundreds = c / 100;
        int dHundreds = d / 100;
        int cDecades = c % 100 / 10;
        int dDecades = d % 100 / 10;
        int cUnits = cDecades % 10;
        int dUnits = dDecades % 10;
        if(cHundreds == dHundreds) {
            System.out.println("Числа в разряде сотен равны " + cHundreds);
        } else {
            System.out.println("Числа в разряде сотен не равны");
        }
        if(cDecades == dDecades) {
            System.out.println("Числа в разряде десятков равны " + cDecades);
        } else {
            System.out.println("Числа в разряде десятков не равны");
        }
        if(cUnits == dUnits) {
            System.out.println("Числа в разряде единиц равны " + cUnits);
        } else {
            System.out.println("Числа в разряде единиц не равны");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("Определение буквы, числа или символа по их коду");
        char symbol = '\u005A';
        if(symbol < 58 & symbol > 47) {
            System.out.println("Ваш символ является цифрой " + symbol);
        } else if(symbol > 64 & symbol < 91) {
            System.out.println("Ваш символ заглавная буква " + symbol);
        } else if(symbol > 96 & symbol < 123) {
            System.out.println("Ваш символ строчная буква " + symbol);
        } else {
            System.out.println("Ваш символ не буква и не число, а" + symbol);
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("Определение суммы вклада и начисленных банком %");
        double sumDeposit = 300_000;
        double percent, sumWithPercent;
        if(sumDeposit < 100_00) {
            percent = 5;
            sumWithPercent = sumDeposit * 1.05;
        } else if(sumDeposit >= 100_000 & sumDeposit <= 300_000) {
            percent = 7;
            sumWithPercent = sumDeposit * 1.07;
        } else {
            percent = 10;
            sumWithPercent = sumDeposit * 1.1;
        }
        System.out.println("Размер вашего вклада равен " + sumDeposit + ", процент, начисленный на ваш вклад, равен " + percent + "%, общая сумма с начисленными процентами равна " + sumWithPercent);

        //Определение оценки по предметам
        System.out.println("Определение оценки по предметам");
        double history = 59;
        double it = 91;
        double pointsHistory, pointsIt;
        if(history > 60) {
            pointsHistory = 3;
            System.out.println("Ваша оценка по истории " + pointsHistory);
        } else if(history > 73) {
            pointsHistory = 4;
            System.out.println("Ваша оценка по истории " + pointsHistory);
        } else if(history > 91) {
            pointsHistory = 5;
            System.out.println("Ваша оценка по истории " + pointsHistory);
        } else {
            pointsHistory = 2;
            System.out.println("Ваша оценка по истории " + pointsHistory);
        }
        if(it > 60) {
            pointsIt = 3;
            System.out.println("Ваша оценка по программированнию " + pointsIt);
        } else if(it > 73) {
            pointsIt = 4;
            System.out.println("Ваша оценка по программированнию " + pointsIt);
        } else if(it > 91) {
            pointsIt = 5;
            System.out.println("Ваша оценка по программированнию " + pointsIt);
        } else {
            pointsIt = 2;
            System.out.println("Ваша оценка по программированнию " + pointsIt);
        }
        System.out.println("Ваш средний балл равен " + (pointsHistory + pointsIt) / 2 + ", ваш средний % по предметам равен " + (history + it) / 2 + "%");

        //Расчет прибыли (убытка)
        System.out.println("Расчет прибыли (убытка)");
        int profit = 15_000;
        int rent = 5_000;
        int selfCost = 9_000;
        int netProfit = profit - selfCost - rent;
        if(netProfit >= 0) {
            System.out.println("Ваша прибыль за год составила +" + netProfit * 12);
        } else {
            System.out.println("Ваш убыток за год составил " + netProfit * 12);
        }

        //Определение существования треугольника
        System.out.println("Определение существования треугольника");
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        if((side1 + side2) > side3) {
            if((side1 + side3) > side2) {
                if((side2 + side3) > side1) {
                    System.out.println("Треугольник с такими сторонами может существовать");
                }
            }
        }
        if(side3 > side2) {
            if(side3 > side1) {
                System.out.println("Гипотенуза равна " + side3 + ", а катеты " + side1 + ", " + side2);
                System.out.println("Площадь треугольника равна " + (side1 * side2 / 2));
            }
        } else if(side1 > side2) {
            if(side1 > side3) {
                System.out.println("Гипотенуза равна " + side1 + ", а катеты " + side3 + ", " + side2);
                System.out.println("Площадь треугольника равна " + (side3 * side2 / 2));
            }
        } else if(side2 > side1) {
            if(side2 > side3) {
                System.out.println("Гипотенуза равна " + side2 + ", а катеты " + side1 + ", " + side3);
                System.out.println("Площадь треугольника равна " + (side1 * side3 / 2));
            }
        }
        char diag = 92;
        System.out.println("  |" + diag + "      ");
        System.out.println("  | " + diag + "    ");
        System.out.println("  |  " + diag + "  ");
        System.out.println("  |___" + diag);

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");
        int money = 567;
        int moneyNom1, moneyNom2, moneyNom3;
        int nom1 = 50;
        int nom2 = 10;
        int nom3 = 1;
        if(money / nom1 > 0) {
            moneyNom1 = money / nom1;
            if(money / nom2 > 0) {
                moneyNom2 = money % nom1 / nom2;
                moneyNom3 = moneyNom1 % nom2;
            } else {
                moneyNom2 = 0;
                moneyNom3 = money % nom1;
            }
        } else if(money / nom2 > 0) {
            moneyNom1 = 0;
            moneyNom2 = money / nom2;
            moneyNom3 = money % nom2;
        } else {
            moneyNom1= 0;
            moneyNom2 = 0;
            moneyNom3 = money;
        }
        System.out.println("Имеющиеся номиналы банкнот: " + nom1 + ", " + nom2 + ", " + nom3 + ". Чтобы посчитать число " + money + " нам требуется " + moneyNom1 + " " + nom1 + "-рублевых банкнот, " + moneyNom2 + " " + nom2 + "-рублевых банкнот и " + moneyNom3 + " " + nom3 + "-рублевых банкнот. Сумма банкнот составляет " + (moneyNom1 * nom1 + moneyNom2 * nom2 + moneyNom3 * nom3));
    }
}