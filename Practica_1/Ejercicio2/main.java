package Practica_1.Ejercicio2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(a, b, c);
        double disc = ecuacionCuadratica.getDiscriminante();

        if (disc > 0) {
            System.out.println("La ecuación tiene dos raíces " + ecuacionCuadratica.getRaiz1() + " y " + ecuacionCuadratica.getRaiz2());
        } else if (Math.abs(disc) < 1e-12) {
            System.out.println("La ecuación tiene una raíz " + ecuacionCuadratica.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
