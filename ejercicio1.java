/**
 * 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 *utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 *cuántos valores del array son igual o superiores a R.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio1 {
    public static void main(String[] args) {
        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double valorR = Double.parseDouble(System.console().readLine()); 

        int contador = 0;

        for (double numero : array) {
            if (numero >= valorR) {
                contador++;
            }
        }

        System.out.println("Cantidad de valores iguales o superiores a R en el array: " + contador);
    }
}
