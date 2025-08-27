package Practica_1.Ejercicio2;

class EcuacionCuadratica {
    private double a, b, c;
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }
    public double getRaiz1() {
        double disc = getDiscriminante();
        if (disc < 0)
            return 0;
        return (-b + Math.sqrt(disc)) / (2 * a);
    }
    public double getRaiz2() {
        double disc = getDiscriminante();
        if (disc < 0)
            return 0;
        return (-b - Math.sqrt(disc)) / (2 * a);
    }
}
