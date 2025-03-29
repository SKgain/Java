import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int totalCubes = 0;

        while (true) {
            i++;  // Move to the next level
            int requiredCubes = (i * (i + 1)) / 2;
            totalCubes += requiredCubes;

            if (totalCubes  > N) {
                i--;
                break;
            }
        }

        System.out.println(i);
    }
}
