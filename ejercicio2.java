public class ejercicio2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        // Rellenar el array con valores enteros aleatorios entre 1 y 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }

        // Valor entero N (puedes modificar este valor)
        int valorN = 5; // Por ejemplo, se puede asignar un valor directamente

        System.out.println("Posiciones del array donde aparece el valor " + valorN + ":");

        // Mostrar las posiciones donde aparece el valor N
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorN) {
                System.out.print(i + " ");
            }
        }
    }
}

