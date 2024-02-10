/*Yêu cầu: Cho biết điểm kiểm tra Tin học của 1 em học sinh (2 con điểm hệ số 1, 1 con điểm hệ số 2, 1 con điểm hệ số 3). In ra Kết quả học tập môn Tin học của em đó. Nếu điểm tổng kết >=8 đạt kết quả Giỏi, <8 và >=6,5 đạt kết quả Khá, <6,5 và >=5 đạt kết quả Trung Bình, <5 đạt kết quả Yếu.

Input Format: Một dòng chứa 4 số điểm của học sinh
Constraints: Điểm là số thực tuqf 0 tới 10
Output Format: Kết quả học tập môn Tin học của em học sinh ở dạng in hoa không dấu
Sample Input 0: 9 8 7 8.5
Sample Output 0: GIOI
Sample Input 1: 5 7 6.5 5
Sample Output 1:


**tính điểm trung bình: ( nhân các con điểm với hệ số của nó) -> EX: 9(1) 8(1) 7(2) 8.5(3)=> (9*1+8*1+7*2+8.5*3)/7 = điểm trung bình
 */

import java.util.Scanner;

public class task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble(), d=sc.nextDouble();
        double diemTB = (a + b + 2*c + 3*d)/7;
        if( diemTB >=8){
            System.out.println("Gioi");
        }
        else if(diemTB >= 6.5 && diemTB < 8){ //có thể ghi là (diemTB >= 6.5), bởi vì nếu có ghi số lớn hơn 8 thì nó sẽ bắt thì dòng trên
            System.out.println("Kha");
        }
        else if(diemTB < 6 && diemTB >=5.5){
            System.out.println("Trung binh");
        }
        else {
            System.out.println("Yeu");
        }
    }
}
