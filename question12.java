package Practice.Assignment3;

public class question12 {
    public static void main(String[]arg){
        System.out.println(lcm(10, 20));

    }
    public static int lcm(int number1 , int number2){
        int result= 0 ;
        int min = Integer.MAX_VALUE;
        int small = 0 ;
        if(number1 < number2){
            small = number1 ;
        } else{
            small = number2 ;
        }
        for(int i = 2 ; i <= small ; i++){
            if((number1 % i == 0) && (number2 % i == 0)){
                result = i ;
                min = Math.min(result , min);
            }
        }
        return min ;
    }
}
