import java.util.Scanner;//JDK에 안에 있다.
class  WhatName{
    public static void main(String[]args){
        System.out.println("이름 뭐니?");
        String name = "";//변수를 선언한다.
        
        //변수라는 것은 사용자가  채워준다 사용자를 위해 비워준다
        //값을 입력받는 지점 
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        
        System.out.println(String.format("이름은  %s 입니다",name));
        System.out.println("몇살이에여? ");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(String.format("나이는 %d 입니다.",age));

    }
}
   



 
    

