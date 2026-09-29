package Module01;

import java.util.Scanner;

public class PRAK102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int limit = num + 10;
        while (num <= limit) {
            if (num % 5 == 0) {
                if (num == limit) System.out.print(num / 5 - 1);
                else System.out.print(num / 5 - 1 + ", ");
            }
            else {
                if (num == limit) System.out.print(num);
                else System.out.print(num + ", ");
            }
            num++;
        }
    }
}