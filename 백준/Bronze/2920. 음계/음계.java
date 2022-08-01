import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = str.replaceAll(" ", "");
        int num = Integer.parseInt(result);

        if (num == 12345678) System.out.println("ascending");
        else if (num == 87654321) System.out.println("descending");
        else System.out.println("mixed");
    }
}