import java.util.Scanner;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        double suma = 0;
        double promedio;

        // Primer arreglo
        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        // Segundo arreglo
        System.out.println("\nIngrese 7 números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        // Calcular diferencia, suma y promedio
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            suma = suma + arreglo3[i];
        }

        promedio = suma / 7;

        // Mostrar resultados
        System.out.println("\nDatos del tercer arreglo (diferencia):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición " + i + ": " + arreglo3[i]);
        }

        System.out.println("\nPromedio de los datos: " + promedio);

        scanner.close();
    }
}
