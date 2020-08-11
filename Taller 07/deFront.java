
public class deFront{
    //prefijo ab
    //char at 0 == a
    //char at 1 == b
    //default
    public static String deFront(String c){
        String r = c.substring(2,c.length());
        if(c.startsWith("ab")){
            r = c;
        }else if(c.charAt(0)== 'a'){
           String r1 = "a";
           String r2 = c.substring(2,c.length());
           r = r1 + r2; 
        }else if(c.charAt(1)== 'b'){
            String r1 = "b";
            String r2 = c.substring(2,c.length());
            r = r1 + r2;
        }
        return r;
    }
    
    public static void main(String [] Args){
        System.out.println(deFront("Hola"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("aber"));
        System.out.println(deFront("hablalo"));
    }
}