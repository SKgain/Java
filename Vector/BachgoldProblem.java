import java.util.*;
import java.util.Vector;
import java.util.Collections;
public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>(n);
        int count = 0;

        if( n%2==0 ){
            n = n-2;
            count++;
            v.add(2);
        }
        else{
            n = n-3;
            count++;
            v.add(3);
        }
        while (n>0)
        {
            n = n-2;
            count++;
            v.add(2);
        }
        System.out.println(count);
        Collections.sort(v);
        for (int num : v) {
            System.out.print(num + " ");
        }

    }
}
