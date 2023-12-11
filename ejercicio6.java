/**
 * 13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
 *luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 *valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 *1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
 *usuario V, I además de N (nº de valores a crear).
 *@author José Antonio Pérez Godínez
 */
public class ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Generador de secuencia aritmética");

        String valorInicialStr = System.console().readLine("Ingrese el valor inicial (V): ");
        int V = Integer.parseInt(valorInicialStr);

        String incrementoStr = System.console().readLine("Ingrese el incremento (I): ");
        int I = Integer.parseInt(incrementoStr);

        String numeroValoresStr = System.console().readLine("Ingrese el número de valores (N): ");
        int N = Integer.parseInt(numeroValoresStr);

        int[] secuencia = generarSecuenciaAritmetica(V, I, N);

        System.out.println("Secuencia aritmética generada:");
        mostrarSecuencia(secuencia);
    }

    public static int[] generarSecuenciaAritmetica(int V, int I, int N) {
        int[] secuencia = new int[N];

        secuencia[0] = V;
        for (int i = 1; i < N; i++) {
            secuencia[i] = secuencia[i - 1] + I;
        }

        return secuencia;
    }

    public static void mostrarSecuencia(int[] secuencia) {
        for (int valor : secuencia) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
