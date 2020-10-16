package Practice.Assignment3;

public class question13 {
    public static void main(String[] arg){
        System.out.println(power(3, 2));

    }
    public static int power(int x , int n){
        int result = 1 ;
        for(int i = 1 ; i <= n ; i++){
            result = result * x ;
        }
        return result ;
    }
    
}
