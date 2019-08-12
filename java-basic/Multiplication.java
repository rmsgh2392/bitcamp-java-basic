
class Multiplication{
    public static void main(String[]args){
        int i = 0 ;
        int j = 0;
        int multiple = i * j;
        
        System.out.println("0 ~ 9 까지의 임의의 수 : ");
        i = (int)(Math.random()*10);
        System.out.println("i는 :"+i);
        j = (int)(Math.random()*10);
        System.out.println("j는"+j);
        multiple = i * j ;

        System.out.println(multiple);
        
    }
}