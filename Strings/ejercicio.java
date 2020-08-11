class ejercicio{
    public static void main(String [] Args){
         int num1 = 2;
         int num2 = 3;
         String str1 = new String("num1 + num 2 = ");
         String str2 = new String(" = num1 + num2");
         System.out.println(str1 + num1 + num2);
         System.out.println(num1 + num2 + str2);
         System.out.println(str1 + (num1 + num2));
    }
}