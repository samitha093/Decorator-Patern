interface Shape {
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("SHAPE: Rectangle");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("SHAPE: Circle");
    }
}

class ShapeDecorator implements Shape {
    private Shape myShape;
    public ShapeDecorator(Shape obj){
        this.myShape = obj;
    }
    @Override
    public void draw() {
        myShape.draw();
    }
}
class redShape extends  ShapeDecorator{

    public redShape(Shape obj) {
        super(obj);
    }
    public void draw(){
        super.draw();
        System.out.println("COLOUR : RED");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new redShape(new Circle());
        redCircle.draw();
    }
}