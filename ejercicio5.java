/**
 * 12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 *distintas opciones:
 *a. Mostrar valores.
 *b. Introducir valor.
 *c. Salir.
 *La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 *posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 *hasta que el usuario elija la opción ‘c’ que terminará el programa.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio5 {

    public static void main(String[] args) {
        int[] array = new int[10];

        while (true) {
            mostrarMenu();
            String opcion = System.console().readLine();
            
            switch (opcion.toLowerCase()) {
                case "a":
                    mostrarValores(array);
                    break;
                case "b":
                    introducirValor(array);
                    break;
                case "c":
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elija 'a', 'b' o 'c'.");
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("a. Mostrar valores.");
        System.out.println("b. Introducir valor.");
        System.out.println("c. Salir.");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarValores(int[] arr) {
        System.out.println("\nValores del array:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void introducirValor(int[] arr) {
        String valorStr = System.console().readLine("Ingrese el valor a introducir: ");
        int valor = Integer.parseInt(valorStr);

        String posicionStr = System.console().readLine("Ingrese la posición donde insertar el valor: ");
        int posicion = Integer.parseInt(posicionStr);

        if (posicion >= 0 && posicion < arr.length) {
            arr[posicion] = valor;
            System.out.println("Valor " + valor + " insertado en la posición " + posicion + " del array.");
        } else {
            System.out.println("La posición especificada está fuera del rango del array.");
        }
    }
}
