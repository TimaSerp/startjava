public class WolfTest {
    
    public static void main(String[] args) {
        
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Вася";
        wolfOne.age = 10;
        wolfOne.weight = 25.00;
        System.out.println("Волка зовут " + wolfOne.name);
        System.out.println("Ему " + wolfOne.age + " лет");
        System.out.println("Он весит " + wolfOne.weight + " кг");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}