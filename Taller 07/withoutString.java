public class withoutString{
    public static String withoutString(String b, String e){
        if(b.indexOf(e)!= -1){
            String n = "";
            int j = 0;
            while(j != -1){
                int i = e.length();
                String n1 = b.substring(0 , b.indexOf(e));
                String n2 = b.substring((b.indexOf(e) + i),b.length());
                b = n1 + n2;
                j = b.indexOf(e);
            }
            return b;
        }else{
            return b;
        } 
    }
    
    public static void main(String [] Args){
        System.out.println(withoutString("Hello there","llo"));
        System.out.println(withoutString("Hello there","e"));
        System.out.println(withoutString("Hello","x"));
        System.out.println(withoutString("asdasd","as"));
    }
}