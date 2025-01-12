/*Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices

Write a Method to find the transpose of a matrix
           
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
 
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix*/
import java.util.Random;

public class MatrixOperation {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
        
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A's columns must match Matrix B's rows.");
        }
        
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / determinant;
        inverse[0][1] = (double) -matrix[0][1] / determinant;
        inverse[1][0] = (double) -matrix[1][0] / determinant;
        inverse[1][1] = (double) matrix[0][0] / determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;

        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;

        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    // Main method to demonstrate the operations
    public static void main(String[] args) {
        int rowsA = 3, colsA = 3; // Define size for matrices
        int rowsB = 3, colsB = 3;

        // Create Random Matrices A and B
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        // Display the matrices
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Matrix Operations
        System.out.println("\nAddition of A and B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction of A and B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nMultiplication of A and B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        // Determinant and Inverse
        if (rowsA == 2) {
            System.out.printf("\nDeterminant of Matrix A: %d%n", determinant2x2(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse2x2(matrixA));
        } else if (rowsA == 3) {
            System.out.printf("\nDeterminant of Matrix A: %d%n", determinant3x3(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse3x3(matrixA));
        } else {
            System.out.println("The determinant and inverse can only be calculated for 2x2 or 3x3 matrices.");
        }
    }
}
