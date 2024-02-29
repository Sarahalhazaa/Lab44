public class Main {
    public static void main(String[] args) {

Circle C = new Circle(1);
        System.out.println();
        System.out.println("Circle: ");
        System.out.println(C.calculateArea());
        System.out.println(C.calculateCircumference());

Rectangle R =new Rectangle(2,3);
        System.out.println();
        System.out.println("Rectangle: ");
        System.out.println(R.calculateArea());
        System.out.println(R.calculateCircumference());

        Triangle T =new Triangle(3,3);
        System.out.println();
        System.out.println("Triangle: ");
        System.out.println(T.calculateArea());
        System.out.println(T.calculateCircumference());
    }
}