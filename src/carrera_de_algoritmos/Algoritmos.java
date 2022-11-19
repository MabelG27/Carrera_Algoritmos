package carrera_de_algoritmos;

import static carrera_de_algoritmos.Interfaz_Grafica.txtBurbuja;
import static carrera_de_algoritmos.Interfaz_Grafica.txtInsercion;
import static carrera_de_algoritmos.Interfaz_Grafica.txtMemoBurb;
import static carrera_de_algoritmos.Interfaz_Grafica.txtMemoInser;
import static carrera_de_algoritmos.Interfaz_Grafica.txtMemoQuick;
import static carrera_de_algoritmos.Interfaz_Grafica.txtMemoSec;
import static carrera_de_algoritmos.Interfaz_Grafica.txtQuickSort;
import static carrera_de_algoritmos.Interfaz_Grafica.txtSecuencial;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeBurb;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeInser;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeQuick;
import static carrera_de_algoritmos.Interfaz_Grafica.txtTimeSec;
import java.text.DecimalFormat;

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

            //Declaración de variables
            int[] arregloI = new int[arreglo.length];
            double tiemp_ini, tiemp_fin;
            Runtime runtime = Runtime.getRuntime();
            double total_memo = 0.0, free_memo = 0.0;
            int aux = 0, cont1 = 0, cont2 = 0;

            //Copiando vector generado
            System.arraycopy(arreglo, 0, arregloI, 0, arreglo.length);

            total_memo = runtime.totalMemory();
            tiemp_ini = System.currentTimeMillis();

            //Ciclo de ordenamiento
            for (cont1 = 1; cont1 < arregloI.length; cont1++) {

                aux = arregloI[cont1];

                for (cont2 = cont1 - 1; cont2 >= 0 && arregloI[cont2] > aux; cont2--) {
                    arregloI[cont2 + 1] = arregloI[cont2];
                    arregloI[cont2] = aux;
                }

                free_memo = runtime.freeMemory();
            }
            tiemp_fin = System.currentTimeMillis();

            //Calculando memoria consumida
            txtMemoInser.setText("Memoria consumida: "
                    + Memoria_Consumida(total_memo, free_memo) + " MB");

            //Calculando tiempo
            txtTimeInser.setText("Tiempo: " + Medir_Tiempo(tiemp_fin, tiemp_ini)
                    + " Milisegundos");

            //Imprimiendo valores ordenados
            String valores = "";
            for (int i = 0; i < arregloI.length; i++) {
                valores += arregloI[i] + "\n";

            }

            txtInsercion.setText(valores);

        }

    }

    public static class Alg_Burb_Bid extends Thread {

        @Override
        public void run() {

            int[] arregloBB = new int[arreglo.length];

            //Copiando vector generado
            System.arraycopy(arreglo, 0, arregloBB, 0, arreglo.length);

            //Declaracion de variables
            double tiemp_ini, tiemp_fin;
            Runtime runtime = Runtime.getRuntime();
            double total_memo = 0.0, free_memo = 0.0;
            int izq = 0;
            int der = arregloBB.length - 1;
            int aux;
            int ult = arregloBB.length - 1;

            total_memo = runtime.totalMemory();
            tiemp_ini = System.currentTimeMillis();
            //Ciclo de ordenamiento

            do {

                //Recorreindo a la derecha
                for (int i = izq; i < der; i++) {

                    if (arregloBB[i] > arregloBB[i + 1]) {
                        aux = arregloBB[i];
                        arregloBB[i] = arregloBB[i + 1];
                        arregloBB[i + 1] = aux;
                        ult = i;
                    }
                }

                der = ult;

                //Recorrido a la izquierda
                for (int j = der; j > izq; j--) {

                    if (arregloBB[j - 1] > arregloBB[j]) {

                        aux = arregloBB[j];
                        arregloBB[j] = arregloBB[j - 1];
                        arregloBB[j - 1] = aux;
                        ult = j;
                    }
                }

                izq = ult;
                free_memo = runtime.freeMemory();
            } while (izq < der);
            tiemp_fin = System.currentTimeMillis();

            //Calculando memoria consumida
            txtMemoSec.setText("Memoria consumida: "
                    + Memoria_Consumida(total_memo, free_memo) + " MB");

            //Calculando tiempo
            txtTimeSec.setText("Tiempo: " + Medir_Tiempo(tiemp_fin, tiemp_ini)
                    + " Milisegundos");

            //Imprimiendo valores ordenados
            String valores = "";
            for (int i = 0; i < arregloBB.length; i++) {
                valores += arregloBB[i] + "\n";
            }
            txtSecuencial.setText(valores);
        }
    }

    /**
     * *********Algoritmo de Ordenamiento de Burbuja******
     */
    public static class Alg_Burbuja extends Thread {

        @Override
        public void run() {

            //Declaración de variables
            int[] arregloB = new int[arreglo.length];
            double tiemp_ini, tiemp_fin;
            Runtime runtime = Runtime.getRuntime();
            double total_memo = 0.0, free_memo = 0.0;
            int aux;
            boolean bandera = false;

            //Copiando vector generado
            System.arraycopy(arreglo, 0, arregloB, 0, arreglo.length);

            total_memo = runtime.totalMemory();
            tiemp_ini = System.currentTimeMillis();

            //Ciclo de ordenamiento
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
                free_memo = runtime.freeMemory();
                if (bandera == false) {
                  
                    break;
                }
            } tiemp_fin = System.currentTimeMillis();

            //Calculando memoria consumida
            txtMemoBurb.setText("Memoria consumida: "
                    + Memoria_Consumida(total_memo, free_memo) + " MB");

            //Calculando tiempo
            txtTimeBurb.setText("Tiempo: " + Medir_Tiempo(tiemp_fin, tiemp_ini)
                    + " Milisegundos");

            //Imprimiendo valores ordenados
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

            /**
             * Declaraciones de variables*
             */
            int[] arregloQ = new int[arreglo.length];
            double tiemp_ini, tiemp_fin;
            Runtime runtime = Runtime.getRuntime();
            double total_memo = 0.0, free_memo = 0.0;

            /**
             * Copiando vector generado*
             */
            System.arraycopy(arreglo, 0, arregloQ, 0, arreglo.length);

            total_memo = runtime.totalMemory();
            tiemp_ini = System.currentTimeMillis();

            ////Función que manda a ciclo de ordenamiento
            quicksort(arregloQ, 0, arregloQ.length - 1);

            //Calculando memoria consumida
            free_memo = runtime.freeMemory();
            txtMemoQuick.setText("Memoria consumida: "
                    + Memoria_Consumida(total_memo, free_memo) + " MB");

            //Calculando tiempo
            tiemp_fin = System.currentTimeMillis();
            txtTimeQuick.setText("Tiempo: " + Medir_Tiempo(tiemp_fin, tiemp_ini)
                    + " Milisegundos");

            //Imprimiendo valores ordenados
            String valores = "";
            for (int i = 0; i < arregloQ.length; i++) {
                valores += arregloQ[i] + "\n";
            }
            txtQuickSort.setText(valores);

        }

        //Función de ordenamiento Quicksort
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

    //Función para calcular consumo de memoria
    public static double Memoria_Consumida(double total_memory, double free_memory) {
        int dataSize = 1024 * 1024;
        double consumo;

        consumo = ((total_memory / dataSize) - (free_memory / dataSize)) / dataSize;

        DecimalFormat df = new DecimalFormat("####.0000000");

        double cons = Double.parseDouble(df.format(consumo));

        return cons;

    }

    //Función para calcular el Tiempo
    public static double Medir_Tiempo(double time_fin, double time_inic) {
        double total_time = 0.0;

        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
        }
        total_time = time_fin - time_inic;

        return total_time;
    }

}
