/**
 * 14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 *valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 *muestre por pantalla.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio7 {

    public static void main(String[] args) {
        int[] secuencia = generarSecuenciaRepetida();

        System.out.println("Secuencia generada:");
        mostrarSecuencia(secuencia);
    }

    public static int[] generarSecuenciaRepetida() {
        int[] secuencia = new int[100]; 
        
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[index] = i;
                index++;
            }
        }

        return secuencia;
    }

    public static void mostrarSecuencia(int[] secuencia) {
        for (int valor : secuencia) {
            if (valor == 0) {
                break; 
            }
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
