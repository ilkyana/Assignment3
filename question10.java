package Practice.Assignment3;

public class question10 {
    public static void main(String [] arg){
        armstrong(100, 400);

    }
    public static void armstrong(int number1 , int number2){
        for(int i = number1 ; i <= number2 ; i++){
            int count = 0 ;
            int num1 = i ;
            int num2 = i ;
            int num3 = i ;
            int result = 0 ;
            while(num1 != 0){
                count++ ;
                num1 = num1/10 ;
            }
            while(num2 != 0){
                int rem = num2 % 10 ;
                result = result + (int) Math.pow(rem, count);
                num2 = num2 / 10 ;
            }
            if(result == num3){
               System.out.print(num3 + " --> ");
            } 
    
        }
    }
    
}
