public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Bonjour");
        System.out.println(a + " * " + b + " = " + Operation.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a, b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a, b));

        
         // ✅ Test de la division normale
        System.out.println(a + " / " + b + " = " + Operation.division(a, b));

        // ⚠️ Test de la division par zéro
        int c = 0;
        System.out.println(a + " / " + c + " = " + Operation.division(a, c));
        System.out.println("Au revoir");
	System.out.println("Bonsoir");

    }
}
