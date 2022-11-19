package carrera_de_algoritmos;

import static carrera_de_algoritmos.Interfaz_Grafica.txtBurbuja;
import static carrera_de_algoritmos.Interfaz_Grafica.txtInsercion;
import static carrera_de_algoritmos.Interfaz_Grafica.txtQuickSort;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeBurb;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeInser;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeQuick;

public class Algoritmos {

    /**
     * ********************Arreglo Generado*******
     */
    public static int[] arreglo = new int[10000];

    /**
     * *********Algoritmo de Ordenamiento por Insercion******
     */
    public static class Alg_Insercion extends Thread {

        @Override
        public void run() {

            int[] arregloI = new int[arreglo.length];

            double tiemp_ini, tiemp_fin, total_time;

            System.arraycopy(arreglo, 0, arregloI, 0, arreglo.length);
            int aux = 0, cont1 = 0, cont2 = 0;

            tiemp_ini = System.currentTimeMillis();
            for (cont1 = 1; cont1 < arregloI.length; cont1++) {

                aux = arregloI[cont1];

                for (cont2 = cont1 - 1; cont2 >= 0 && arregloI[cont2] > aux; cont2--) {
                    arregloI[cont2 + 1] = arregloI[cont2];
                    arregloI[cont2] = aux;
                }
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
            tiemp_fin = System.currentTimeMillis();

            total_time = tiemp_fin - tiemp_ini;
            txtTimeInser.setText(total_time + " milisegundos");

            String valores = "";
            for (int i = 0; i < arregloI.length; i++) {
                valores += arregloI[i] + "\n";

            }

            txtInsercion.setText(valores);

        }

    }

    public static class Alg_Secuencial extends Thread {

        @Override
        public void run() {

        }
    }

    /**
     * *********Algoritmo de Ordenamiento de Burbuja******
     */
    public static class Alg_Burbuja extends Thread {

        @Override
        public void run() {

            int[] arregloB = new int[arreglo.length];
            double tiemp_ini, tiemp_fin, total_time;
            System.arraycopy(arreglo, 0, arregloB, 0, arreglo.length);
            int aux;
            boolean bandera = false;

            tiemp_ini = System.currentTimeMillis();
            while (true) {
                bandera = false;
                for (int i = 1; i < arregloB.length; i++) {

                    if (arregloB[i] < arregloB[i - 1]) {

                        aux = arregloB[i];
                        arregloB[i] = arregloB[i - 1];
                        arregloB[i - 1] = aux;
                        bandera = true;

                    }
                }

                if (bandera == false) {
                    break;
                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
            tiemp_fin = System.currentTimeMillis();

            total_time = tiemp_fin - tiemp_ini;
            txtTimeBurb.setText(total_time + " milisegundos");

            String valores = "";
            for (int i = 0; i < arregloB.length; i++) {
                valores += arregloB[i] + "\n";
            }
            txtBurbuja.setText(valores);

        }
    }

    /**
     * *********Algoritmo de Ordenamiento QuickSort******
     */
    public static class Alg_QuickSort extends Thread {

        @Override
        public void run() {
            int[] arregloQ = new int[arreglo.length];
            double tiemp_ini, tiemp_fin, total_time;

            System.arraycopy(arreglo, 0, arregloQ, 0, arreglo.length);

            tiemp_ini = System.currentTimeMillis();

            quicksort(arregloQ, 0, arregloQ.length - 1);

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
            tiemp_fin = System.currentTimeMillis();

            total_time = tiemp_fin - tiemp_ini;
            txtTimeQuick.setText(total_time + " milisegundos");

            String valores = "";
            for (int i = 0; i < arregloQ.length; i++) {
                valores += arregloQ[i] + "\n";
            }
            txtQuickSort.setText(valores);

        }

        public static void quicksort(int A[], int izq, int der) {

            int pivote = A[izq];
            int i = izq;
            int j = der;
            int aux;

            while (i < j) {
                while (A[i] <= pivote && i < j) {
                    i++;
                }
                while (A[j] > pivote) {
                    j--;
                }
                if (i < j) {
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }

            A[izq] = A[j];
            A[j] = pivote;

            if (izq < j - 1) {
                quicksort(A, izq, j - 1);
            }
            if (j + 1 < der) {
                quicksort(A, j + 1, der);
            }
        }

    }

}
