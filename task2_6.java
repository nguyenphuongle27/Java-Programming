/*Cho biểu thức A(x) = x^3 + 3x^2 + x + 1 Với giá trị của x được nhập từ bàn phím, tính và in ra giá trị của biểu thức trên
 Input Format: Số nguyên x
 Constraints: -10^5 <= x <= 10^5
 Output Format: In ra kết quả của biểu thức
 Sample Input 0: 2
 Sample Output 0: 23
 */

import java.util.Scanner;

public class task2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1l * n * n * n + 3l * n * n + n + 1;
        System.out.println(res);
    }
}
