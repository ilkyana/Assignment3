package Practice.Assignment3;

public class question16 {
    public static void main(String[] arg){
        System.out.println(square(81));

    }
    public static int square(int number){
        int result ;
        int max = 1 ;
        if(number == 0){
            return 0 ;
        }
        if(number == 1){
            return 1 ;
        }
        for(int i = 2 ; i<= number/2 ; i++ ){
            result = i * i ;
            if(result < number || result == number){
                max = Math.max(max , i);
            }
        }
        return max ;
    }
    
}
