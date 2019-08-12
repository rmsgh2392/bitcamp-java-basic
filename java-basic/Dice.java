import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은3입니다
     * 사용자는 입력을 홀수 인거 같으면 홀 을 선택 , 짝 선택
     * 한다고 할 때 결과를 출력하세요.
     * @param args
     */
    public static void main(String[]args){

       
        System.out.println("홀 , 짝를 선택하세요");
        Scanner sc = new Scanner(System.in);
        Random ran  =new Random();

        int number = 0;
        number = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d ",number));

        int dap = 0;
        dap = sc.nextInt();
        System.out.println("dap 값은 :"+dap);

        if(number%dap==0){
            System.out.println("짝수 입니다");
        }else if (number % dap !=0){
            System.out.println("홀수 입니다");
        }else{
            System.out.println("다시 입력하세요");
        }
    }
    
         
        // String dice = "";
        // dice = sc.next();
      
        // if(dice.equals(dap)){
        //     System.out.println("홀 입니다");
        // }else if (!dice.equals(dap)){
        //     System.out.println("짝 입니다");
        // }else{
        //     System.out.println("홀 , 짝을 선택하세요");
        // }
         
        // }
    }
        
        

        



