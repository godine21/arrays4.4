/**
 * 11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 *primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 *primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int[] primerArray = new int[100];
        int[] segundoArray = new int[100];

        for (int i = 0; i < primerArray.length; i++) {
            primerArray[i] = i + 1;
        }

        for (int i = 0; i < primerArray.length; i++) {
            segundoArray[i] = primerArray[primerArray.length - 1 - i];
        }

        System.out.println("Primer Array:");
        mostrarArray(primerArray);
        
        System.out.println("\nSegundo Array (en orden inverso del primer array):");
        mostrarArray(segundoArray);
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
