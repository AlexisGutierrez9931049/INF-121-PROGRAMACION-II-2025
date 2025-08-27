package Practica_1.Ejercicio3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        for (int i = 0; i < 10; i++) v[i] = sc.nextDouble();

        Estadistica estadistica = new Estadistica(v);
        System.out.printf("El promedio es %.2f%n", estadistica.promedio());
        System.out.printf("La desviación estandard es %.5f%n", estadistica.desviacion());
    }
}
