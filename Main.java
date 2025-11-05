public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Bonjour");
        System.out.println(a + " * " + b + " = " + Operation.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a, b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a, b));
    }
}
