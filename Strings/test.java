import java.net.*;
import java.io.*;

public class test {
    public static void main(String [] Args) throws IOException {
        String rutaJumbo = "https://www.tiendasjumbo.co/tecnologia/televisores-y-video/proyectores";
        URL url = new URL (rutaJumbo);
        BufferedReader reader = new BufferedReader (new InputStreamReader(url.openStream()));
        String codigoFuente = "";
        String linea;
        while((linea = reader.readLine()) != null){
            codigoFuente = codigoFuente + linea;
        }
        reader.close();

        /** int sen0 = 1;
        //String keyName0 = "<span itemprop=\"name\">";
        String keyName0 = "class=\"product-item__name\" title=\"";
        //String keyName1 = "</span>";
        String keyName1 = "\">";
        System.out.println(keyName0.length());
        while(sen0 != keyName0.length() -1){
        int i = codigoFuente.indexOf(keyName0 , sen0) + keyName0.length();
        sen0 = i;
        int j = codigoFuente.indexOf(keyName1 , i );
        String nombre = codigoFuente.substring(i, j);
        Producto p = new Producto(nombre);
        System.out.println(nombre);
        System.out.println(sen0);
        System.out.println(p.getNombre());
        }

        int sen1 = 1;

        String keyPrecio0 = "<span class=\"product-prices__value product-prices__value--best-price\">";
        String keyPrecio1 = "</span>";

        System.out.println(keyName0.length());
        while(sen1 != keyPrecio0.length() -1){
        int i = codigoFuente.indexOf(keyPrecio0 , sen1) + keyPrecio0.length();
        sen1 = i;
        int j = codigoFuente.indexOf(keyPrecio1 , i );
        String precio = codigoFuente.substring(i, j);
        Producto p = new Producto();
        p.setPrecio(precio);        
        System.out.println(sen1);
        System.out.println(p.getPrecio());
        }

        int sen2 = 1;

        String keyMarca0 = "<div class=\"product-item__brand\" itemprop=\"brand\">";
        String keyMarca1 = "</div>";

        System.out.println(keyName0.length());
        while(sen2 != keyMarca0.length() -1){
        int i = codigoFuente.indexOf(keyMarca0 , sen2) + keyMarca0.length();
        sen1 = i;
        int j = codigoFuente.indexOf(keyMarca1 , i );
        String marca = codigoFuente.substring(i, j);
        Producto p = new Producto();
        p.setMarca(marca);        
        System.out.println(sen2);
        System.out.println(p.getMarca());
        }**/


        String keyName0 = "<span itemprop=\"name\">";
        //String keyName0 = "class=\"product-item__name\" title=\"";
        String keyName1 = "</span>";
        //String keyName1 = "\">";
        //System.out.println(keyName0.length());
        
        String keyPrecio0 = "<span class=\"product-prices__value product-prices__value--best-price\">";
        String keyPrecio1 = "</span>";
        
        //String keyMarca0 = "<div class=\"product-item__brand\" itemprop=\"brand\">";
        //String keyMarca0 = "<div class=\"product-item__brand\" itemprop=\"brand\"><p class=\"texto brand generico\">";
        String keyMarca0 = "<div class=\"product-item__brand\" itemprop=\"brand\"><p class=\"texto brand ";
        //String keyMarca1 = "</div>";
        //String keyMarca1 = "</p></div>";
        String keyMarca1 = "\">";
        
        int i = 1;
        String backup = codigoFuente;
        while(codigoFuente.length()>0 || i == 0) {
            i = codigoFuente.indexOf(keyName0);
            if(i>0) {
                i = i +keyName0.length();
                int j = codigoFuente.indexOf(keyName1, i);
                String nombre = codigoFuente.substring(i, j);
                System.out.println(nombre);
                codigoFuente = codigoFuente.substring(j + keyName1.length());
            }else{
                break;
            }
        }
        
        codigoFuente = backup;
        
        while(codigoFuente.length()>0 || i == 0) {
            i = codigoFuente.indexOf(keyPrecio0);
            if(i>0) {
                i = i +keyPrecio0.length();
                int j = codigoFuente.indexOf(keyPrecio1, i);
                String precio = codigoFuente.substring(i, j);
                System.out.println(precio);
                codigoFuente = codigoFuente.substring(j + keyPrecio1.length());
            }else{
                break;
            }
        }
        
        codigoFuente = backup;
        
        while(codigoFuente.length()>0 || i == 0) {
            i = codigoFuente.indexOf(keyMarca0);
            if(i>0) {
                i = i +keyMarca0.length();
                int j = codigoFuente.indexOf(keyMarca1, i);
                String marca = codigoFuente.substring(i, j);
                System.out.println(marca);
                codigoFuente = codigoFuente.substring(j + keyMarca1.length());
            }else{
                break;
            }
        }
        
        /**int i = 1;
        int m = 1 ;
        int n = 1;
        String cf0 = codigoFuente; 
        String cf1 = codigoFuente; 
        String cf2 = codigoFuente; 
        while(codigoFuente.length()>0 || i == 0) {
            i = cf0.indexOf(keyName0);
            m = cf1.indexOf(keyPrecio0);
            n = cf2.indexOf(keyMarca0);
            if(i>0) {
                i = i +keyName0.length();
                int j = cf0.indexOf(keyName1, i);
                String nombre = cf0.substring(i, j);
                System.out.println(nombre);
                codigoFuente = cf0.substring(j + keyName1.length());
            }else{
                break;
            }
            
            if(m>0) {
                m = m + keyPrecio0.length();
                int j = cf1.indexOf(keyPrecio1, m);
                String precio = cf1.substring(m, j);
                System.out.println(precio);
                codigoFuente = cf1.substring(j + keyPrecio1.length());
            }else{
                break;
            }
            
            if(n>0) {
                n = n + keyMarca0.length();
                int j = cf2.indexOf(keyMarca1, i);
                String marca = cf2.substring(n, j);
                System.out.println(marca);
                codigoFuente = cf2.substring(j + keyMarca1.length());
            }else{
                break;
            }
            
        }**/
        
    }
}
  