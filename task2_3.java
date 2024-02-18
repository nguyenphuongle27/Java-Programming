/*Cho 3 cạnh a,b,c là độ dài 3 cạnh của tam giác, kiểm tra xem a,,b,c có thể tạo thành một tam giác hợp lệ hay không?
Gợi ý; Tam giác hợp lệ là tam giác có 3 cạnh đều dương và tổng hai cạnh luôn lớn hơn cạnh còn lại => 6 điều điện và kết hợp toán tử &&
 Input Format: 1 dòng chứa 3 số a,b,c
 Constraints: -10^6<=a,b,c<=10^6
 Output Format: In ra YES nếu a,b,c là 3 cạnh của 1 tam giác hợp lệ, ngược lại in ra NO
 Sample Input 0: 3 4 5
 Sample Output 0: YES
 */

import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b,c;
        a = sc.nextLong(); 
        b = sc.nextLong();
        c = sc.nextLong();
        /*if((-10000000<= a && a <= 10000000) && (-10000000<= b && b <= 10000000) && (-10000000<= c && c <= 10000000)){
            System.out.println("Yes");
        }*/

        if(a>0 && b >0 && c >0 && a+b >c && a+c> b && b+c>a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //Check tam giac ko hop le
        if(a<=0 || b<= 0 || c<=0 || a+b <= c || a+c <= b || b+c > a){
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
}
