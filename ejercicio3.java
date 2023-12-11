public class ejercicio3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, introduce la cantidad de alturas como argumento al ejecutar el programa.");
            return;
        }

        int N = Integer.parseInt(args[0]); // Obtener N desde los argumentos

        double[] alturas = new double[N];

        // Llenar el array con alturas introducidas por argumentos
        for (int i = 0; i < N; i++) {
            alturas[i] = Double.parseDouble(args[i + 1]);
        }

        double sumaAlturas = 0;
        double alturaMaxima = Double.MIN_VALUE;
        double alturaMinima = Double.MAX_VALUE;

        // Calcular la suma total de alturas y encontrar la altura máxima y mínima
        for (double altura : alturas) {
            sumaAlturas += altura;

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
            }

            if (altura < alturaMinima) {
                alturaMinima = altura;
            }
        }

        double alturaMedia = sumaAlturas / N;

        int personasPorEncima = 0;
        int personasPorDebajo = 0;

        // Contar cuántas personas miden por encima y por debajo de la media
        for (double altura : alturas) {
            if (altura > alturaMedia) {
                personasPorEncima++;
            } else if (altura < alturaMedia) {
                personasPorDebajo++;
            }
        }

        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Altura máxima: " + alturaMaxima);
        System.out.println("Altura mínima: " + alturaMinima);
        System.out.println("Personas por encima de la media: " + personasPorEncima);
        System.out.println("Personas por debajo de la media: " + personasPorDebajo);
    }
}

