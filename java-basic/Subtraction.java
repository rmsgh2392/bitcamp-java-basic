import java.util.Scanner;
class Subtraction{
    public static void main(String[]args){
        int a , b = 0;
        int subtraction;
        Scanner scan = new Scanner(System.in);
        System.out.println("두 수를 입력 :");
        a = scan.nextInt();
        System.out.println("a의 값은 :" +a);
        b = scan.nextInt();
        System.out.println("b의 값은 :"+b);
        
        subtraction = a - b;
        System.out.print(subtraction);


        
    }
}