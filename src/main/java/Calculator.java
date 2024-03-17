public class Calculator {
    public int additionEntiers (int a, int b){
        return a + b;
    }

    public double additionDoubles (double a, double b){
        return a + b;
    }

    public int soustractionEntiers (int a, int b){
        return a - b;
    }

    public double soustractionDoubles (double a, double b){
        return a - b;
    }

    public int multiplicationEntiers (int a, int b){
        return a * b;
    }

    public double multiplicationDoubles (double a, double b){
        return a * b;
    }

    public int divisionEntiers (int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }

    public double divisionDoubles(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }
    public double puissance(double a, double b) {
        return Math.pow(a, b);
    }

    public double racineCarree(double a) {
        if (a < 0) {
            throw new ArithmeticException("Racine carrée d'un nombre négatif");
        }
        return Math.sqrt(a);
    }

    public double sinus(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cosinus(double a) {
        return Math.cos(Math.toRadians(a));
    }
}
