//Kiểm tra năm nhuận
/*Năm nhuận là năm chia hết cho 400 hoặc (chia hết cho 4 và không chia hết cho 100). Nhập N là một năm và kiểm tra xem N có phải là năm nhuận hay không?
 Input Format: Số nguyên dương N
 Constraints: 1<=N<=5000
 Output Format: In ra YES nếu N là năm nhuận, ngược lại in ra NO
 Sample Input 0: 2020
 Sample Output 0: YES
 */
import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Year: " + N);
        if((N % 400 == 0)||((N%4 ==0)&&(N%100 != 0))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
