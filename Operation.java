public class Operation {

    public static int multiplication(int x, int y) {
        return x * y;
    }
    public static int soustraction(int x, int y) { return x - y; }
    public static int addition(int x, int y) { return x + y; }
    public static double division(double x, double y) {
        if (y != 0)
            return x / y;
        else {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
    }

}
