import java.util.Scanner;
class Sum{
    public static void main (String[]args){
        int i = 0; 
        int j = 0;
        int sum = 0;
        System.out.print("임의의 수 두 수를 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        i =sc.nextInt();
        System.out.println("i의 숫자는 :" +i);
        j =sc.nextInt();
        System.out.println("j의 숫자는"+j);
        sum = i + j;
        System.out.print(String.format("%d + %d  = %d" , i , j , sum));


        


    }
}