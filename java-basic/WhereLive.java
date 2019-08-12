import java.util.Scanner;
class WhereLive{
    public static void main(String[]args){
       String location  = "";
       String gu = "";
       String dong = "";
       Scanner sc = new Scanner(System.in);
       System.out.println("어디 사세요 ??");
       location = sc.next();
       System.out.println("구는 어디시죠 :");
       gu = sc.next();
       System.out.println("동은 어디시죠");
       dong = sc.next();
       System.out.println("저는" + location + gu + dong + "에 살고 있습니다" );
       
       

    }
}