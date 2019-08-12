import java.util.Scanner;
class Sum{
    public static void main (String[]args){
        int i, j, sum =0;
        
        System.out.print("임의의 수 두 수를 산출하세요 :\n");
        Scanner sc = new Scanner(System.in);
        // i =sc.nextInt();
        i = (int)(Math.random()*10);
        System.out.println("i의 숫자는 :" +i);
        // j =sc.nextInt();
        j = (int)(Math.random()*10);
        System.out.println("j의 숫자는"+j);
        String op = "";
        System.out.println("연산종류를 선택하세요 +, - , * , / ");
        op = sc.next();
        

        if(op.equals("+") ){
            sum = i + j;
               System.out.println(String.format("두수 의 합 : %d + %d =%d" , i , j ,sum));
        }else if(op.equals("-")){
            sum = i - j;
            System.out.println(String.format("두수 의 뺼셈 : %d - %d = %d",i,j,sum ));
        }else if(op.equals("*")){
            sum = i * j;
            System.out.printf("두수의 곱은: %d * %d = %d" ,i,j,sum);
        }else if(op.equals("/")){
            sum = i / j ;
            System.out.printf("두수의 나눗셈 : %d / %d = %d" ,i,j,sum);
        }else{
            
            System.out.println("잘못입력하셨습니다 다시 입력하세요 !!");
        }
            
        }

    

        }
        
          
        
        


        


    