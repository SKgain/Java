import java.util.Scanner;
public class GoodKid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test case
        for(int i = 0; i < t; i++){
          int n = sc.nextInt(); // array size
          int [] arr = new int[n];
          for (int j = 0; j < n; j++){
              arr[j] = sc.nextInt(); // taking input
          }
          int smallest = arr[0];
          int index = 0;
          for(int k = 0; k < n; k++){

              if(arr[k] < smallest){
                  smallest = arr[k];
                  index = k;
              }
          }
            arr[index] = smallest+1;

          int mul = 1;
          for(int l=0; l < n; l++){
              mul *= arr[l];
          }
          System.out.println(mul);

      }

    }
}
