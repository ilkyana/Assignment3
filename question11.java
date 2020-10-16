package Practice.Assignment3;

public class question11 {
    public static void main(String[] arg){
        System.out.println(gcd(10, 20));

    }
    public static int  gcd(int number1 , int number2){
        int result = 0;
        int max = 1 ;
        int min = 0 ;
        if(number1 < number2){
            min = number1 ;
        } else{
            min = number2 ;
        }
        for(int i = 2 ; i <= min; i++){
            if((number1 % i == 0) && (number2 % i == 0) ){
                result = i ;
                max = Math.max(result, max);
            }
        }
        return max ;
    }
    
}

