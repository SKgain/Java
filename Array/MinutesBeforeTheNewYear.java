import java.util.*;
public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int count = 0;
            int[] numbers = new int[2];
            numbers[0] = sc.nextInt();
            numbers[1] = sc.nextInt();
            if(numbers[0] != 23)
            {
                count =(23 - numbers[0])*60 + (60-numbers[1]);
            }
            else {
                count = 60 - numbers[1];
            }
            System.out.println(count);
        }
    }
}
