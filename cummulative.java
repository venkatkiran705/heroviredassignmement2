import java.util.Scanner;

public class cummulative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
            a[i] = sum;
            System.out.println(a[i]);
        }

    }

}
