import java.util.Scanner;
class RockPaperScissors{
    public static void main(String[]args){
        int result = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임을 시작합니다 ");
        number = sc.nextInt();
        System.out.println("컴퓨터는"+number+"을 선택");
        //컴퓨터가 바위를 냈어요
        result = sc.nextInt();
        System.out.println("1.가위 2.바위 3.보");
        if(result ==1){
            System.out.println("당신이 졌습니다");
        }else if(result ==2 ){
            System.out.println("비겼군요");
        }else if(result == 3){
            System.out.println("당신이 이겼군요");
        }
        else{
            System.out.println("다시 고르세요");
        }
        

        }
    
        
    }
