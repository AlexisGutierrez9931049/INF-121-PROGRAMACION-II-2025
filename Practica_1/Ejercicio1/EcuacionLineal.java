package Practica_1.Ejercicio1;

class EcuacionLineal {
    private double a, b, c, d, e, f;
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    private double resultado() {
        return a * d - b * c;
    }
    public boolean tieneSolucion() {
        return Math.abs(resultado()) > 1e-12;
    }
    public double getX() {
        return (e * d - b * f) / resultado();
    }
    public double getY() {
        return (a * f - e * c) / resultado();
    }
}


