import java.util.Scanner;
import java.util.Arrays;

class Main {
  static char[] arr;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    arr = sc.nextLine().toCharArray();

    Arrays.sort(arr);

     for(int i=arr.length-1;i>=0;i--){
      System.out.print(arr[i]);
    }

  }
}