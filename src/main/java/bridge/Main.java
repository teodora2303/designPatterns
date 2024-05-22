package bridge;

public class Main {
    public static void main(String[] args) {
        Shape shapeTriangle = new Triangle(new Red());
        shapeTriangle.applyShapeColor();


        Shape shapePentagon = new Pentagon(new Green());
        shapePentagon.applyShapeColor();

        Shape shapeTriangle2 = new Triangle(new Color() {
            @Override
            public void applyColor() {
                System.out.println("yellow");
            }
        });

        System.out.println();
        shapeTriangle2.applyShapeColor();
    }
}
