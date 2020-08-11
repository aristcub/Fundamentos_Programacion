public class Star{
    public static void main(String [] Args){
        String star = "*";
        for(int i= 0; i<5; i++){
            System.out.println(star);
            star = star + star;
        }
    }
}