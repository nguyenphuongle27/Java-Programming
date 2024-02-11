/*Quảng trường Nhà hát ở thủ đô Berland có hình chữ nhật với kích thước n x m mét. Nhân dịp kỷ niệm thành phố, một quyết định đã được đưa ra để lát Quảnh trường bằng những viên đá granit vuông. Mỗi viên đá hình vuông có kích thước a x a. Số lượng viên đá ít nhất cần thiết để lát Quảng trường là bao nhiêu? Nó được phép che phủ bề mặt lớn hơn Quảng trường Nhà hát. Nó không được phép phá vỡ các viên đá. Các cạnh của viên đá phải song song với các cạnh của Quảng trường.
 Input Format: 3 số nguyên dương n,m,a.
 Constraints: 1<=n,m,a<=10^9
 Ouput Format: Viết số lượng viên đá cần thiết đẻ lát kín quảng trường
 Sample Input 0: 6 6 4
 Sample Output: 4
*/

import java.util.Scanner;

public class task2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a;
        n=sc.nextInt(); 
        m=sc.nextInt(); 
        a=sc.nextInt();
        if((1<=n && n <=10000000000L) && (1<=m && m <=10000000000L) && (1<=a && a <=10000000000L)){
            int d = n/a;
            int g = m/a;
            float soLuong = (float)d*g;
            System.out.println("n là "+ n);
            System.out.println("m là "+ m);
            System.out.println("a là "+ a);
            System.out.println(soLuong);
        }
        else{
            System.out.println("Khong hop le !");
        }
    }
    
}
