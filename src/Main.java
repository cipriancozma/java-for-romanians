
public class Main {
    public static void main(String[] args) {
        System.out.println("Salutare prieteni!");

        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.age = 2;
        c1.name = "Leo";
        c1.weight = 2.5;

        c1.sayMeow();
    }
}