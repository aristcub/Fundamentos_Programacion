public class Circle{
    private double radius;
    public static int numberOfObjects = 0;
    
    public Circle(){
        radius = 1;
        numberOfObjects ++;
    }
    
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects ++;
    }
    
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
}