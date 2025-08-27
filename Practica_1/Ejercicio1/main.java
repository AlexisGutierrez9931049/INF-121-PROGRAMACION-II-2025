package Practica_1.Ejercicio1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double d = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble();

        EcuacionLineal ecuacionLineal = new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacionLineal.tieneSolucion()) {
            System.out.println("x = " + ecuacionLineal.getX() + ", y = " + ecuacionLineal.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
    }
}
