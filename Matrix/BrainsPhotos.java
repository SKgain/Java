import java.util.*;
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next();
            }
        }

        int flag = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("C") || matrix[i][j].equals("M") || matrix[i][j].equals("Y")) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("#Black&White");
        }
        else
            System.out.println("#Color");

    }
}
