/*Kiểm tra Tam giác
Cho 3 cạnh a,b,c của một tam giác, nếu tam giác đã cho là tam giác đều thì in ra 1, tam giác cân thì in ra 2, tam giác vuông thì in ra 3, tam giác thường thì in ra 4, trường hợp tam giác nhập vào không hợp lệ thì in ra "INVALID".
 Input Format: 1 dòng chứa 3 số a,b,c 
 Constraints: 0<= a,b,c <= 10^3
 Output Format: In ra kết quả tương ứng.
 Sample Input 0: 8 8 8 
 Sample Output 0: 1
 Sample Input 1: 8 8 6
 Sample Output 1: 
 */

import java.util.Scanner;

public class task2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        //đầu tiên kiểu ra đúng là tam giác
        if(a>0 && b > 0 && c>0 %% a+ b>c && a+c>b && b+c>a){
            // phan ra cac loai tam giac
        }
    }
}
