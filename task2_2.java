/*Cho một số nguyên không âm N. Bạn hãy thực hiện viết câu lệnh để kiểu tra các điều kiện sau:
 1. N có phải là số chẵn? (Kiểm tra số dư của N với 2 và so sánh 0)
 2. N có phải là số vừa chia hết cho 3 vừa chia hết cho 5? ( Kết hợp 2 điện kiện sử dụng &&)
 3. N có phải là số chia hết cho 3 nhưng không chia hết cho 7? ( Kết hợp 2 điện kiện sử dụng &&)
 4. N có phải là số chia hết cho 3 hoặc 7? ( Kết hợp 2 điện kiện sử dụng ||)
 5. N là số lớn hơn 30 và nhỏ hơn 50? ( Kết hợp 2 điện kiện sử dụng &&)
 6. N có phải là số không nhỏ hơn 30 và chia hết cho ít nhất một trong 3 số 2,3,5? ( Lớn hơn hoặc bằng 30 && ( chia hết ...))
 7. N có phải là số có 2 chữ số có chữ tận cùng là số nguyên tố? (>=10, <=99, kiểm tra chữ số tận cùng là 2,3,5,7)
 (muốn lấy số hàng đơn vị của chữ số thì lấy số đó chia dư cho 10, VD: 1234 -> 1234 % 10 = 4; 1234%100=34)
 8. N có phải là số không vượt quá 100 và chia hết cho 23?
 9. N không thuộc đoạn [10,20]?
 10. N có chữ số tận cùng là bội số của 3?

 Input Format: Số nguyên dương N
 Constraints: 1<=N<=10^6
 Outout Format:
 In ra 10 dòng mỗi dùng là "Yes" hoặc "No" tương ứng với 10 điệu kiện. Nếu N thỏa mãn điều kiện thứ i thì dòng i in ra Yes ngược lại ra No.
 Sample Input 0: 263
 Sample Output 0: No
 */
import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        //1
        if(N % 2 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //2
        if((N % 3 ==0 ) && (N % 5 ==0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //3
        if((N%3==0)&&(N%7 != 0))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //4
        if((N%3 == 0) || (N%7 ==0)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


        //5
        if((N>30 && N<50)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //6
        if((N >= 30) && ((N%2 == 0)||(N%3==0)||(N%5==0))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //7
        int donVi = N%10; //lấy số tận cùng của số N ->Kiểm tra chữ số tận cùng là số nguyên số
        if(N>=10 && N <=99){
            //So nguyen to
            if ((donVi==2)||(donVi==3)||(donVi==5)||(donVi==7)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }


        //8
        if(N<=100 && N%23==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //9
        if(N<10 || N>20){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //10
        if(donVi % 3 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
