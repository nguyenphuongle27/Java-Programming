import java.util.Scanner;

public class task2 {
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = 100;
        //tăng sau -> int m = a++; // m = a= 100, a++ => a=101
        //int m = ++a; // tăng trước
        // a = a + 1; // 101
        // a++; // tăng a lên 1 đơn vị
         //hoặc là ++a;
        // a--; // giảm a xuống 1 đơn vị
         // hoặc là --a;

         int m = a+1; // nếu ko muốn tăng a lên 1 đơn vị
        
        System.out.println(a);
        System.out.println(m);

    }  


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // kiem tr a n>=10 va nho hon hoac bang 20
        int n =21;
        int m =25;
        int k = 40; //Kiểm tra k chia hết cho 5
        if( (n >= 10)&&(n<=20)){ // 10 < 20 = true
            System.out.println("Yes !");
        }


        if((m%2) == 0){ // chia dư với 2, chia 2 dư 0 thì là chẵn, còn chia 2 có số dư != thì là lẻ
            System.out.println("Chan");
        }
        else{
            System.out.println("Le");
        }

        if ((k%5) == 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }


        //&& va || => điều kiện ( codition), 1 là && hết, 2 là || hết, ko có kết hợp cả 2
        int l = 40;
        if ( A && B && (C || D)){ // trừ khi 1 cái thực hiện trước,1 cái thực hiện sau, khi nay ( C || D) là 1 mệnh đề

        } 
    }

    //if else long nhau
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // kiem tra n >= 10 va n <=20 neu dung in Yes, sai in No
        if(n >= 10 && n <=20){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        //or
        if (n >= 10){
            // n>=10
            if(n < 20)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else{
            System.out.println("NO");
        }
        //if có thể ko cần else nhưng else luôn cần if đi trước
    } */


    //Câu lệnh if và else if
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Kiểm tra ngày của tháng
        int t = sc.nextInt(); //biến tháng
        //cái này viết quá dài dòng và có nhiều câu lệnh giống nhau như là nhiều tháng có 31 ngày giống nhau
        if(t==1){
            System.out.println("31");
        }
        else if(t==2)
        {
            System.out.println("28");
        }
        else if(t==3){
            System.out.println("31");
        }
        else if(t==4){
            System.out.println("30");
        }
        else if(t==5){
            System.out.println("31");
        }
        else if (t==6){
            System.out.println("30");
        }
        else if(t==7){
            System.out.println("31");
        }
        else{
            System.out.println("Khong hop le !");
        }



        //Cách 2 viết ngắn gọn hơn
        int k = sc.nextInt();
        if (k==1 || k==3 || k==5 ||k==7 || k==8 || k==10 || k==12 ){
            System.out.println("31 days");
        }
        else if (k==4 || k==6 || k==9 || k==1){
            System.out.println("30 days");
        }
        else if (k==2){
            System.out.println("28 days");
        }
        else{
            System.out.println("Wrong!");
        }
    }
}
