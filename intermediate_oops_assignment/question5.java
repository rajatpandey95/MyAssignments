package intermediate_oops_assignment;

abstract class Shape5 {
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

class Line5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Cube";
    }
}

public class question5 {
    public static void main(String[] args) {

        Rectangle5 rectangleObj = new Rectangle5();
        String drawRectangle = rectangleObj.draw();
        System.out.println(drawRectangle);

        Line5 lineObj = new Line5();
        String drawLine = lineObj.draw();
        System.out.println(drawLine);

        Cube5 cubeObj = new Cube5();
        String drawCube = cubeObj.draw();
        System.out.println(drawCube);

    }
}
