public class Person {
    //если false, то женщина, если true, то мужчина
    boolean isMale = true;
    String name = "Timofei";
    int height = 185;
    double weight = 85.00;
    int age = 20;

    boolean talk() {
        return true;
    }

    void walk() {
        System.out.println("Я иду");
    }

    boolean run() {
        return true;
    }

    String studyJava() {
        return "Я учу Java";
    }

    void sit() {
        System.out.println("Я сижу");
    }


}