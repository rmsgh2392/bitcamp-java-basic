import java.util.Scanner;
class GenderChecker{
    public static void main(String[]args){
       System.out.println("주민등록번호를 입력하세요");
       Scanner scan = new Scanner(System.in);
       String ssn = "";
       
       ssn = scan.next();
       System.out.println("입력하신 주민번호는 :"+ssn);
       int a = 0;
       int b =0;
       a= scan.nextInt();
       b= scan.nextInt();
       System.out.println(String.format("a는%d , b는%d ",a , b));
       String num = ssn.substring(a,b);
       
       if(num.equals ("1")){
           System.out.println("1900 ~ 1999년에 태어난 남성");
       }else if(num.equals("2")){

           System.out.println("1900 ~ 1999년에 태어난 여성");
        }else if(num.equals("3") ){
            System.out.println("2000 ~ 2099년에 태어난 남성");
        }else if(num.equals("4")){
            System.out.println("2000 ~ 2099년에 태어난 여성");
        }else if(num.equals("5")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
        }else if(num.equals("6")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
        }else if(num.equals("7")){
            System.out.println("2000  ~ 2099년에 태어난 외국인 남성");
        }else if(num.equals("8")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
       }else if (num.equals("9") ){
           System.out.println("1800 ~ 1899년에 태어난 남성");
       }else if (num.equals("0")){
           System.out.println("1800 ~ 1899년에 태어난 여성");
        }
        else{
           System.out.println("잘못입력하셨습니다"); 
        }
        }
       
             
         }
        
       
       




