/*Nhập vào 2 số nguyên, in ra tổng, hiệu, tích, thương(lấy độ chính xác với 4 chữ số) của 2 số đó. Bài này có thể bị sai do 2 nguyên nhân: 1. Khi tính tích bị tràn số, 2. Độ chính xác của thương.
 Input Format: 2 số nguyên a, b trên 1 dòng
 Constraints: -10^8 <= a,b <= 10^8
 Output Format: In ra tổng, hiệu , tích, thương trên từng dòng. Nếu trường hợp không thể tìm được thương của 2 số thì sẽ   in ra "INVALID" cho dòng kết quả của thương.
 Sample Input 0: 7769 0
 Smaple Output 0: 7769
                  7769
                  0
                  INVALID
 Sample Input 1: 9794  1282
 Sample Output 1: 11076
                  8512
                  112555908
                  7.6396
  */

import java.util.Scanner;

public class task2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Tong:" + (a + b));
        System.out.println("Hieu:" + (a - b));
        System.out.println("Tich:" + 1l *a *b );
        if( b == 0){
            System.out.println("Thuong: INVALID");
        }
        else{
            System.out.printf("Thuong: %.4f", (double) a /b);
        }
    }
}
