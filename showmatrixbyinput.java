import java.util.Scanner;

public class showmatrixbyinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user untuk memasukkan jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris: ");
        int numRows = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int numCols = input.nextInt();

        // Membuat matriks berdasarkan input user
        int[][] matrix = new int[numRows][numCols];

        // Memasukkan elemen-elemen matriks
        System.out.println("Masukkan elemen-elemen matriks:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Menampilkan matriks
        System.out.println("Matriks yang Anda masukkan:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}


