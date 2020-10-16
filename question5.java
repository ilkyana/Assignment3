package Practice.Assignment3;

public class question5 {
    public static void main(String[] arg){
        int min = 0 ;
        int max = 100;
        int step = 20 ;
       convert(min, max, step);
        
    }
    public static void convert(int min , int max , int step){
        for(int i = min ; i <= max ;  ){
            int c = (5 * (i - 32))/9;
            System.out.println(i + " --> " + c );
           i = i+step ;
          
                }
    }
    
    
}
