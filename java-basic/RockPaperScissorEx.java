import java.util.Scanner;
import java.util.Random;
class RockPaperScissorEx{
    public static void main(String[]args){
        System.out.println("즐거운 가위바위보 게임^^");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        
        int number = 0;
        number = ran.nextInt(3)+1;
          
        if(number==1){
            System.out.println("상대방은 가위를 내셨습니다.");
        }else if(number==2){
            System.out.println("상대방은 바위를 내셨습니다.");
        }else if(number==3){
            System.out.println("상대방은 보를 내셨습니다");
        }

        int game = 0;
        System.out.println("무엇을 내시겠습니까? 1.가위 2.바위 3.보");
        game = scan.nextInt();
        if(number==1){
            if(game ==1){
                System.out.println("비겼습니다 다시 도전하세요");
            }else if (game == 2){
                System.out.println("이겼습니다 다시 하시겠습니까?");
            }else if(game ==3){
                System.out.println("당신이 패하였습니다 다시 도전하시겠습니까?");
            }if(number ==2){
                if(game ==1){
                    System.out.println("당신이 패하였습니다");
                }else if(game ==2){
                    System.out.println("비겼습니다");
                }else if(game ==3){
                    System.out.println("당신이 이겼습니다");
                }if(number==3){
                    if(game ==1){
                        System.out.println("당신이 승리");
                    }else if(game ==2){
                        System.out.println("패배자");
                    }else if(game ==3){
                        System.out.println("비겼습니다.");
                    }
                }
                
            }
            
                
        }
        }


        

    }
