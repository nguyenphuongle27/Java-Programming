package Java;

import java.util.Scanner;

  public class task1 {
   
    public static void main(String[] args) {
        int a = 100;
        long b = 1234521323232L;
        float PI = 3.14F;
        double d = 1.4582285212416D;
        boolean check = true;
        System.out.println("Value of a is: " + a); //gia tri cho so nguyen
        System.out.println("Value of b is: " + b);   
        System.out.println("Value of a and b is: " + a +" , " + b); 

        System.out.printf("Value of PI is %.2f\n", PI);// %.2f-> in float voi 2 dau dang sau dau phay -> do chinh xac cao
        System.out.printf("Value of d is %.10f\n", d);
        System.out.printf("Value of PI is %.2f and d is %.10f\n", PI,d);


    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        char kiTu; 
        a = sc.nextInt();
        b = sc.nextFloat();
        kiTu = sc.next().charAt(0);
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        System.out.println("Ki tu = " + kiTu);
    }  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 100;
        int b = 200;

        //chú ý 1
        int c = 5;
        int d = 2;
        float res = (float)c/d; //phep chia nguyen -> để sửa lỗi thì phải làm 2 bước ( lỗi là 5/2 = 2.5 nhưng vì nó mặc định là số nguyên nên nó chỉ lấy kq là 2)
        //bước 1 là đổi int res sang float res -> tới đây thì chỉ mới sửa được lỗi cho kết quả là số thực nhưng vẫn còn sai kq bỏi vì nó vẫn mặc định c,d là số nguyên nên nó cho kq là 2.00
        //bước 2 là ép kiểu -> là lấy 1 trong 2 c và d, lấy 1 cái đổi thành số thực để java nó hiểu là mình cần kết quả là số thực -> khi này thì ta thêm float trước c -> 5.0 / 2 = 2.5 còn nếu vẫn giữ 5/2 thì nó vẫn sẽ cho ra 2
        //=> Lấy 2 số nguyên chia cho nhau mà muốn lấy phần thập phân thì ta phải xử lý cả 2 vế, thứ nhất là lưu kết quả ở số thực, thứ 2 là can thiệp vào phép chia đó


        // chú ý 2: nhân 2 số nguyên mà bị tràn -> kết quả sẽ ra linh tinh ko đúng do bị tràn số
        int e = 10000000;
        int h = 10000000;
        long tich = (long)e * h; // 10^6 * 10^6 = 10^12 (int chỉ lưu được từ -2.10^9 đến 2.10^9) -> ko thể lưu đc ở int mà phải sd long
        // int * int -> kq sẽ lưu tạm ở int sau đó mới gán cho tich -> 10^12 lưu vào int thì sẽ bị tràn sau đó nó lấy kq đã bị tràn gán cho tích thì kq là sai
        //-> phải can thiệp vào phép nhân -> ep 1 trong 2 thành long (ép kiểu)
        System.out.println(tich);


        int add = a + b;
        int subtrac = a - b;
        int multiplication = a * b;        
        int  division = a / b;
        int percent = a % b;
        System.out.println("total about addition " + add);
        System.out.println("Total about subtraction " + subtrac);
        System.out.println("Total about multiplication " + multiplication);
        System.out.println("Total about division " + division);
        System.out.println("Total about percent " + percent);
        System.out.printf("%.2f\n", res);   
        System.out.println(a>=b); // true, flase
    }




    //abs: Tri tuyet doi
    //sqrt: Can bac 2 : Tra ve double
    // pow: Luy Thua : tra ve double
    //min, max
    //PI
    //ceil(lam tron len) floor (lam tron xuong) round(lam tron theo so thap phan): làm tròn số
    // ex of round: 6.67-> làm tròn lên, 6.64-> làm tròn xuống
    // 3 != 3.0
    public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int a = -100, b = 10;
                float c = 2.67F;
                System.out.println(Math.abs(a));
                System.out.println(Math.min(a,b));
                int luyThua = (int)Math.pow(a,b);

               
                System.out.println((int)Math.ceil(c));
                System.out.println((int)Math.floor(c));
                System.out.println((int)Math.round(c));
                
        }

} 

