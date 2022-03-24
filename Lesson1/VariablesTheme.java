public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль 
        System.out.println("\nСоздание переменных и вывод их значений на консоль");
        byte windowsVersion = 10;
        short installYear = 2021;
        int processorInHerts = 2_000_000_000;
        long ramInKb = 8_388_608;
        float biosVersion = 1.22f;
        double biosDownloadDate = 26.02_2019;
        char systemLocalization = 'R';
        boolean windows = true;
        System.out.println("Версия Windows:"  + windowsVersion);
        System.out.println("Год установки Windows: " + installYear);
        System.out.println("Частота процессора в герцах: " + processorInHerts);
        System.out.println("Операвтивная память в килобайтах: " + ramInKb);
        System.out.println("Версия BIOS: " + biosVersion);
        System.out.println("Дата загрузки BIOS: " + biosDownloadDate);
        System.out.println("На какой язык локализована система(E-english, R-русский): " + systemLocalization);
        System.out.println("На моём компьютере стоит система Windows? True-да, false-нет: " + windows);

        //Расчет стоимости товара со скидкой
        System.out.println("\nРасчет стоимости товара со скидкой");
        double priceX = 100;
        double priceY = 200;
        double discount = 11;
        double totalPrice = (priceX + priceY) * 0.11;
        double discountPrice = (priceX + priceY) - totalPrice;
        System.out.println("Итоговая сумма товаров со скидкой: " + totalPrice);
        System.out.println("Сумма скидки: " + discountPrice);

        // Вывод на консоль слова JAVA
        System.out.println("\nВывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        //Отображение min и max значений числовых типов данных
        System.out.println("\nОтображение min и max значений числовых типов данных");
        byte byteMaxMinValue = 127;
        short shortMaxMinValue = 32_767;
        int intMaxMinValue = 2_147_483_647;
        long longMaxMinValue = 9_223_372_036_854_775_807l;
        float floatMaxMinValue = 3.4028235e38f;
        double doubleMaxMinValue = 1.7976931348623157e308;
        char charMaxMinValue = 65_535;
        System.out.println("Максимальное число типа byte : " + byteMaxMinValue);
        System.out.println("Максимальное число типа short : " + shortMaxMinValue);
        System.out.println("Максимальное число типа int : " + intMaxMinValue);
        System.out.println("Максимальное число типа long : " + longMaxMinValue);
        System.out.println("Максимальное число типа float : " + floatMaxMinValue);
        System.out.println("Максимальное число типа double : " + doubleMaxMinValue);
        System.out.println("Максимальное число типа char : " + charMaxMinValue);
        System.out.println("Минимальное число типа byte: " + ++byteMaxMinValue);
        System.out.println("Минимальное число типа short: " + ++shortMaxMinValue);
        System.out.println("Минимальное число типа int: " + ++intMaxMinValue);
        System.out.println("Минимальное число типа long: " + ++longMaxMinValue);
        System.out.println("Минимальное число типа float: " + ++floatMaxMinValue);
        System.out.println("Минимальное число типа double: " + ++doubleMaxMinValue);
        System.out.println("Минимальное число типа char: " + ++charMaxMinValue);
        System.out.println("Максимальное число типа byte : " + --byteMaxMinValue);
        System.out.println("Максимальное число типа short : " + --shortMaxMinValue);
        System.out.println("Максимальное число типа int : " + --intMaxMinValue);
        System.out.println("Максимальное число типа long : " + --longMaxMinValue);
        System.out.println("Максимальное число типа float : " + --floatMaxMinValue);
        System.out.println("Максимальное число типа double : " + --doubleMaxMinValue);
        System.out.println("Максимальное число типа char : " + --charMaxMinValue);

        //Перестановка значений переменных
        System.out.println("\nПерестановка значений переменных");
        double a = 1.2;
        double b = 2.4;
        System.out.println("Значение переменной a равно " + a + ", а значение переменной b равно " + b);
        double buffer = a;
        a = b;
        b = buffer;
        System.out.println("Теперь переменная a равна " + a + ", а переменная b равна " + b);

        //Вывод символов и их кодов
        System.out.println("\nВывод символов и их кодов");
        int charNum1 = 35;
        int charNum2 = 38;
        int charNum3 = 64;
        int charNum4 = 94;
        int charNum5 = 95;
        System.out.println("" + (char) charNum1 + charNum1);
        System.out.println("" + (char) charNum2 + charNum2);
        System.out.println("" + (char) charNum3 + charNum3);
        System.out.println("" + (char) charNum4 + charNum4);
        System.out.println("" + (char) charNum5 + charNum5);

        //Произведение и сумма цифр числа
        System.out.println("\nПроизведение и сумма цифр числа");
        int quantity = 345;
        int hundreds = quantity / 100;
        int decades = quantity % 100 / 10;
        int units = hundreds % 10;
        int multiplication = hundreds * decades * units;
        int totalPricemary = hundreds + decades + units;
        System.out.println("Произведение цифр числа " + quantity + " равно " + multiplication + ", а сумма их равна " + totalPricemary);

        // Вывод на консоль ASCII-арт Дюка
        System.out.println("\nВывод на консоль ASCII-арт Дюка");
        char space = 00;
        char slash = 47;
        char backSlash = 92;
        char underScore = 95;
        char bracketL = 40;
        char bracketR = 41;
        System.out.println("" + space + space + space + space + slash + backSlash + space + space + space + space + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space + space + space + space);
        System.out.println("" + space + space + slash + underScore + bracketL + space + bracketR + backSlash + space + space + space + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash + space + space + space + space);
        System.out.println("" + slash + underScore + underScore + underScore + underScore + slash + backSlash + underScore + underScore + backSlash + space + space + space);

        // Отображение сотен, десятков, единиц числа
        System.out.println("\nОтображение сотен, десятков, единиц числа");
        int srcNum = 123;
        int hundreds1 = srcNum / 100;
        int decades1 = srcNum % 100 / 10;
        int units1 = hundreds1 % 10;
        System.out.println("Сотни: " + hundreds1 * 100 + ", десятки: " + decades1 * 10 + ", единицы: " + units1);

        // Преобразование секунд
        System.out.println("\nПреобразование секунд");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = seconds % 3600 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
