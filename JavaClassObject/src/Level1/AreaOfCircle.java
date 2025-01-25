public class AreaOfCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(7);
        c1.computeAreaAndCircumference();
        c1.getArea();
        c1.getCircumference();
    }
}
class Circle{
    private int radius;
    private double circumference;
    private double area;
    public Circle(int radius){
        this.radius = radius;
    }
    public void computeAreaAndCircumference(){
        area = (double) (3.14 * radius*radius);
        circumference = (double) (3.14 * 2.0 * radius);
    }
    public void getArea(){
        System.out.println("The area of circle having radius "+radius+" = "+area);
    }
    public void getCircumference(){
        System.out.println("The circumference of circle having radius "+radius+" = "+circumference);
    }
}
