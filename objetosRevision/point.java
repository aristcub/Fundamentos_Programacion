public class point{
    private double x;
    private double y;
    
    public point(){
        this(0,0);
    }
    
    public point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public point(point p2){
        this(p2.getX(), p2.getY());
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public double getX(){
        return this.x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double distance(point p2){
        double dist = Math.sqrt(Math.pow(this.x-p2.getX(),2)
                 +Math.pow(this.y-p2.getY(),2));
        return dist;
    }
    
    //distamce(cuatro dobles), (dos puntos)
    
    public static point puntoMedio(point p1, point p2){
        double xm = (p1.getX()+p2.getX())/2;
        double ym = (p1.getY()+p2.getY())/2;
        point pm = new point();
        pm.setX(xm);
        pm.setY(ym);
        return pm;
    }
}