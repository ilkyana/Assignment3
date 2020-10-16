package Practice.Assignment3;

public class question9 {
    public static void main(String[] arg){
        System.out.println(armstrong(371));

    }
    public static boolean armstrong(int number){
        int count = 0 ;
        int number1 = number ;
        int number2 = number ;
        int result = 0 ;
        while(number != 0){
            count++ ;
            number = number / 10 ;
        }
        while(number1 != 0){
            int rem = number1 % 10 ;
            result = result + (int) Math.pow(rem, count);
            number1 = number1 / 10 ;
        }
        if(result == number2){
            return true ;
        } else{
            return false ;
        }

    }
    
}
