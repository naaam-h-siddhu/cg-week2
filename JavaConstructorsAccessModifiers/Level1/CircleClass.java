public class CircleClass {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        c1.getter();
        Circle2 c2 = new Circle2(12.32);
        c2.getter();
    }
}

class Circle2{
    private double radius;
    public Circle2(){
        System.out.println("Default constructor called!!");
        radius = 13.4;
    }
    public Circle2(double radius){
        this.radius = radius;
        System.out.println("Parameterised constructor called!!1");
    }
    public void getter(){
        System.out.println("radius of circle = "+radius);
    }
}