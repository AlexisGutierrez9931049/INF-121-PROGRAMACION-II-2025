package Practica_1.Ejercicio3;

public class Estadistica {
        private double[] datos;
        public Estadistica(double[] datos) {
            this.datos = datos.clone();
        }
        public double promedio() {
            double s = 0;
            for (double x : datos) s += x;
            return s / datos.length;
        }
        public double desviacion() {
            double prom = promedio();
            double s2 = 0;
            for (double x : datos) s2 += (x - prom) * (x - prom);
            return Math.sqrt(s2 / (datos.length - 1));
        }
}

