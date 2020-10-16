package Practice.Assignment3;

public class question6 {
    public static void main(String[] arg){
        int number = 32145 ;
        inverse(number);

    }
    // public static void times(int number , int digit){
    //     for(int i = 1 ; i <= number ; i++){
    //         System.out.println(digit);
    //     }
    // }
    public static void inverse(int n){
        int inv=0;
        int place=1;

        while(n!=0){

            int value= n%10;
            n=n/10;
            inv= (int) (inv+place*Math.pow(10,value-1));
            place=place+1;
        }
       System.out.println(inv);
        if(n == inv){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

}
