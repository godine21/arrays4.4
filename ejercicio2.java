/**
 *9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 *enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 *mostrará en qué posiciones del array aparece N.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }

        int valorN = Integer.parseInt(System.console().readLine());

        System.out.println("Posiciones del array donde aparece el valor " + valorN + ":");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorN) {
                System.out.print(i + " ");
            }
        }
    }
}

