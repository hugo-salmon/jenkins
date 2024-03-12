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
}
