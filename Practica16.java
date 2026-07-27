import java.util.Scanner;


public class Practica16 {

    // Scanner para leer los datos del usuario
    static Scanner entrada = new Scanner(System.in);

    // Función principal
    public static void main(String[] args) {

        // Declaración de las matrices A y B de tamaño 2x3
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        // Ingreso de los datos de la matriz A
        System.out.println("\nMATRIZ A");
        completarMatrices(A);

        // Ingreso de los datos de la matriz B
        System.out.println("\nMATRIZ B");
        completarMatrices(B);

        // Mostrar la suma de las matrices
        System.out.println("\nSUMA");
        sumaMatriz(A, B);

        // Mostrar la resta de las matrices
        System.out.println("\nRESTA");
        restaMatriz(A, B);

        // Mostrar la multiplicación de las matrices
        System.out.println("\nMULTIPLICACION");
        multiplicacionMatriz(A, B);
    }

    // Función para ingresar los valores de una matriz
    public static void completarMatrices(int[][] matriz) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor de matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    // Función para mostrar una matriz resultado
    public static void mostrarResultado(int[][] R) {

        System.out.println("\nResultado:");

        // Imprime cada elemento de la matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", R[i][j]);
            }
            System.out.println();
        }
    }

    // Función que realiza la suma de dos matrices
    public static void sumaMatriz(int[][] A, int[][] B) {

        int[][] R = new int[2][3];

        // Suma cada elemento de las matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                R[i][j] = A[i][j] + B[i][j];
            }
        }

        // Muestra el resultado de la suma
        mostrarResultado(R);
    }

    // Función que realiza la resta de dos matrices
    public static void restaMatriz(int[][] A, int[][] B) {

        int[][] R = new int[2][3];

        // Resta cada elemento de las matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                R[i][j] = A[i][j] - B[i][j];
            }
        }

        // Muestra el resultado de la resta
        mostrarResultado(R);
    }

    // Función que realiza la multiplicación de las matrices
    public static void multiplicacionMatriz(int[][] A, int[][] B) {

        int[][] R = new int[2][3];

        // Multiplica cada elemento de las matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                R[i][j] = A[i][j] * B[i][j];
            }
        }

        // Muestra el resultado de la multiplicación
        mostrarResultado(R);
    }
}