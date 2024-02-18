/*Yêu cầu: cho ba số nguyên a,b và c, hãy tính S = a*(b+c)+b*(a+c).
 Input Format: 3 số a,b,c trên 1 dòng
 Constraints: -10^8 <= a,b,c <= 10^8
 Output Format: In ra giá trị của biểu thức
 Sample Input 0: 1 2 3
 Sample Output 0: 13
 */

import java.util.Scanner;

public class task2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        long res = 1l * a * (b + c) + 1l * b * (a+c);
        System.out.println(res);
    }
}
