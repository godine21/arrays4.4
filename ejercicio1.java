public class ejercicio1 {
    public static void main(String[] args) {
        double[] array = new double[100];

        // Llenar el array con números aleatorios entre 0.0 y 1.0
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        // Valor real R (puedes modificar este valor)
        double valorR = 0.5; // Por ejemplo, se puede asignar un valor directamente

        int contador = 0;

        // Contar cuántos valores en el array son iguales o superiores a R
        for (double numero : array) {
            if (numero >= valorR) {
                contador++;
            }
        }

        System.out.println("Cantidad de valores iguales o superiores a R en el array: " + contador);
    }
}
