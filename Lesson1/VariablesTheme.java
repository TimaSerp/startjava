public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль 
        System.out.println("Создание переменных и вывод их значений на консоль");
        byte windowsVersion = 10;
        short installYear = 2021;
        int processorInHerts = 2_000_000_000;
        long ramInkb = 8_388_608;
        float biosVersion = 1.22f;
        double biosDownloadDate = 26.02_2019;
        char systemLocalization = 'R';
        boolean windows = true;
        System.out.println("Версия Windows:"  + windowsVersion);
        System.out.println("Год установки Windows: " + installYear);
        System.out.println("Частота процессора в герцах: " + processorInHerts);
        System.out.println("Операвтивная память в килобайтах: " + ramInkb);
        System.out.println("Версия BIOS: " + biosVersion);
        System.out.println("Дата загрузки BIOS: " + biosDownloadDate);
        System.out.println("На какой язык локализована система(E-english, R-русский): " + systemLocalization);
        System.out.println("На моём компьютере стоит система Windows? True-да, false-нет: " + windows);

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");
        double priceX = 100;
        double priceY = 200;
        double discount = 11;
        double totalPrice = (priceX + priceY) * 0.11;
        double discountPrice = (priceX + priceY) - totalPrice;
        System.out.println("Итоговая сумма товаров со скидкой: " + totalPrice);
        System.out.println("Сумма скидки: " + discountPrice);

        // Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        //Отображение min и mapriceX значений числовых типов данных
        System.out.println("Отображение min и mapriceX значений числовых типов данных");
        byte byteMapriceX = 127;
        short shortMapriceX = 32_767;
        int intMapriceX = 2_147_483_647;
        long longMapriceX = 9_223_372_036_854_775_807l;
        float floatMapriceX = 3.4028235e38f;
        double doubleMapriceX = 1.7976931348623157e308;
        char charMapriceX = 65_535;
        System.out.println("Максимальное число типа byte : " + byteMapriceX);
        System.out.println("Максимальное число типа short : " + shortMapriceX);
        System.out.println("Максимальное число типа int : " + intMapriceX);
        System.out.println("Максимальное число типа long : " + longMapriceX);
        System.out.println("Максимальное число типа float : " + floatMapriceX);
        System.out.println("Максимальное число типа double : " + doubleMapriceX);
        System.out.println("Максимальное число типа char : " + charMapriceX);
        System.out.println("Максимальное число типа byte + 1 : " + ++byteMapriceX);
        System.out.println("Максимальное число типа short + 1 : " + ++shortMapriceX);
        System.out.println("Максимальное число типа int + 1: " + ++intMapriceX);
        System.out.println("Максимальное число типа long + 1: " + ++longMapriceX);
        System.out.println("Максимальное число типа float + 1: " + ++floatMapriceX);
        System.out.println("Максимальное число типа double + 1: " + ++doubleMapriceX);
        System.out.println("Максимальное число типа char + 1: " + ++charMapriceX);
        System.out.println("Максимальное число типа byte : " + --byteMapriceX);
        System.out.println("Максимальное число типа short : " + --shortMapriceX);
        System.out.println("Максимальное число типа int : " + --intMapriceX);
        System.out.println("Максимальное число типа long : " + --longMapriceX);
        System.out.println("Максимальное число типа float : " + --floatMapriceX);
        System.out.println("Максимальное число типа double : " + --doubleMapriceX);
        System.out.println("Максимальное число типа char : " + --charMapriceX);

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");
        double a = 1.2;
        double b = 2.4;
        System.out.println("Значение переменной a равно " + a + ", а значение переменной b равно " + b);
        double change = a;
        a = b;
        b = change;
        System.out.println("Теперь переменная a равна " + a + ", а переменная b равна " + b);

        //Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");
        int charNum1 = 35;
        int charNum2 = 38;
        int charNum3 = 64;
        int charNum4 = 94;
        int charNum5 = 95;
        System.out.println((char) charNum1);
        System.out.println((char) charNum2);
        System.out.println((char) charNum2);
        System.out.println((char) charNum2);
        System.out.println((char) charNum2);

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");
        int quantity = 345;
        int hundreds = quantity / 100;
        int decades = (quantity - hundreds * 100) / 10;
        int units = (quantity - hundreds * 100 - decades * 10);
        int multiplication = hundreds * decades * units;
        int totalPricemary = hundreds + decades + units;
        System.out.println("Произведение цифр числа " + quantity + " равно " + multiplication + ", а сумма их равна " + totalPricemary);

        // Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");
        char space = 00;
        char diagR = 47;
        char diagL = 92;
        char downLine = 95;
        char bracketL = 40;
        char bracketR = 41;
        String spaceS = Character.toString(space);
        String diagRS = Character.toString(diagR);
        String diagLS = Character.toString(diagL);
        String downLineS = Character.toString(downLine);
        String bracketLS = Character.toString(bracketL);
        String bracketRS = Character.toString(bracketR);
        System.out.println(spaceS + spaceS + spaceS + spaceS + diagRS + diagLS + spaceS + spaceS +spaceS + spaceS + spaceS + spaceS + spaceS);
        System.out.println(spaceS + spaceS + spaceS + diagRS + spaceS + spaceS + diagLS + spaceS + spaceS + spaceS + spaceS + spaceS + spaceS);
        System.out.println(spaceS + spaceS + diagRS + downLineS + bracketLS + spaceS + bracketRS + diagLS + spaceS + spaceS + spaceS + spaceS + spaceS);
        System.out.println(spaceS + diagRS + spaceS + spaceS + spaceS + spaceS + spaceS + spaceS + diagLS + spaceS + spaceS + spaceS + spaceS);
        System.out.println(diagRS + downLineS + downLineS + downLineS + downLineS + diagRS + diagLS + downLineS + downLineS + diagLS + spaceS + spaceS + spaceS);

        // Отображение сотен, десятков, единиц числа
        System.out.println("Отображение сотен, десятков, единиц числа");
        int count = 123;
        int hundreds1 = count / 100;
        int decades1 = count % 100 / 10;
        int units1 = hundreds1 % 10;
        System.out.println("Сотни: " + hundreds1 * 100 + ", десятки: " + decades1 * 10 + ", единицы: " + units1);

        // Преобразование секунд
        System.out.println("Преобразование секунд");
        int seconds = 86399;
        int hours = 86399 / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = hours % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
