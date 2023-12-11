/**
 * 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 *Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 *mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 *por debajo de la media.
 *@author José Antonio Pérez Godínez
 */
public class ejercicio3 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingrese la cantidad de alturas como argumento.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        if (args.length != N + 1) {
            System.out.println("La cantidad de alturas ingresadas no coincide con el valor N proporcionado.");
            return;
        }

        int[] alturas = new int[N];

        for (int i = 0; i < N; i++) {
            alturas[i] = Integer.parseInt(args[i + 1]);
        }

        double sumaAlturas = 0;
        for (int altura : alturas) {
            sumaAlturas += altura;
        }
        double alturaMedia = sumaAlturas / N;

        int alturaMaxima = alturas[0];
        int alturaMinima = alturas[0];
        for (int i = 1; i < N; i++) {
            if (alturas[i] > alturaMaxima) {
                alturaMaxima = alturas[i];
            }
            if (alturas[i] < alturaMinima) {
                alturaMinima = alturas[i];
            }
        }

        int personasPorEncima = 0;
        int personasPorDebajo = 0;
        for (int altura : alturas) {
            if (altura > alturaMedia) {
                personasPorEncima++;
            } else if (altura < alturaMedia) {
                personasPorDebajo++;
            }
        }

        System.out.println("Altura media: " + alturaMedia + " metros");
        System.out.println("Altura máxima: " + alturaMaxima + " metros");
        System.out.println("Altura mínima: " + alturaMinima + " metros");
        System.out.println("Personas por encima de la media: " + personasPorEncima);
        System.out.println("Personas por debajo de la media: " + personasPorDebajo);
    }
}


