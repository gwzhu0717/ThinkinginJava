package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */


class  Shape{
    public Shape(int i) {
        System.out.println("Shape constructor");
    }
    void dispose(){
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape{
    public Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose(){
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    public Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
    void dispose(){
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape{
    private int start,end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line");
    }

    void dispose(){
        System.out.println("Erasing Line");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] line=new Line[3];

    public CADSystem(int i) {
        super(i);
        for (int j = 0; j <line.length ; j++) {
            line[j]=new Line(j,j*j);
        }
        c=new Circle(i);
        t=new Triangle(i);
        System.out.println("Combined construtor");
    }

    public void dispose(){
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int j = line.length-1; j >=0 ; j--) {
            line[j].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x=new CADSystem(11);
        try{

        }finally {
            x.dispose();
        }
    }
}
