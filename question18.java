package Practice.Assignment3;

public class question18 {
    public static void main(String[] arg){
        Ascii('1');

    }
    public static void Ascii(char c){
        if(c >= 65 && c <= 90){
            System.out.println("U");
        } else if(c >= 97 && c <= 122){
            System.out.println("L");
        } else{
            System.out.println("I");
        }
    }
    
}
