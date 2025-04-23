public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {
            {1, 6, 2},
            {4, 2, 6}
        };
        int[][] b = {
            {4, 2, 2},
            {3, 2, 5}
        };

        int[][] sum = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
