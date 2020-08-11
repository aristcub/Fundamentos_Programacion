public class PrincipalPoint{
    public static void main(String [] Args){
        point p1 = new point();
        p1.setX(4);
        p1.setY(4);
        point p2 = new point();
        p2.setX(4);
        p2.setY(5);
        point p3 = new point();
        p3.setX(4);
        p3.setY(3);
        //double dist = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)
                 //+Math.pow(p1.getY()-p2.getY(),2));
        //double dist1 = Math.sqrt(Math.pow(p2.getX()-p3.getX(),2)
                 //+Math.pow(p2.getY()-p3.getY(),2));
        
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p3));
        //System.out.println(p2.puntoMedio(p1));
        point pm = point.puntoMedio(p1,p2);
        System.out.println(pm.getX());
        System.out.println(pm.getY());
        
        point p01 = new point();
    }
}