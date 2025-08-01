public class shapesproblemclass3 {
    /*
     * Polygon
     * Name of n-sided polygon (pentagon, quadrilateral, triangle, etc)
     * Shape name
     */
}
class Polygon extends shapesproblemclass3 {

}
class Hexagon extends Polygon {

}
class Pentagon extends Polygon {

}
class Quadrilateral extends Polygon {

}
class Triangle extends Polygon {
    public double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public double area(double base, double height) {
        return (base*height)/2;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
    public double missingAngleDegrees(double angleA, double angleB) {
        return 180 - angleA - angleB;
    }
    public double missingAngleRadians(double angleA, double angleB) {
        return Math.PI - Math.toRadians(angleA) - Math.toRadians(angleB);
    }
}
class Square extends Quadrilateral {
    public double perimeter(double sideA, double sideB) {
        return 2*(sideA + sideB);
    }
    public double area(double sideA, double sideB) {
        return sideA*sideB;
    }
    public double thirdDimensionShape(double area) {
        return area*(Math.sqrt(area));
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
}
class Rectangle extends Quadrilateral {
    public double perimeter(double sideA, double sideB) {
        return 2*(sideA + sideB);
    }
    public double area(double sideA, double sideB) {
        return sideA*sideB;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
}
class Rhombus extends Quadrilateral {

}
class Trapezoid extends Quadrilateral {
    public double perimeter(double sideA, double sideB, double sideC, double sideD) {
        return sideA + sideB + sideC + sideD;
    }
    public double area(double baseA, double baseB, double height) {
        return ((baseA + baseB)*height)/2;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
}
class Parallelogram extends Quadrilateral {

}
class Kite extends Quadrilateral {

}
class RightTriangle extends Triangle {
    public double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public double area(double base, double height) {
        return (base*height)/2;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
    public double missingAngleDegrees(double angleA, double angleB) {
        return 180 - angleA - angleB;
    }
    public double missingAngleRadians(double angleA, double angleB) {
        return Math.PI - Math.toRadians(angleA) - Math.toRadians(angleB);
    }
}
class AcuteTriangle extends Triangle {
    public double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public double area(double base, double height) {
        return (base*height)/2;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
    public double missingAngleDegrees(double angleA, double angleB) {
        return 180 - angleA - angleB;
    }
    public double missingAngleRadians(double angleA, double angleB) {
        return Math.PI - Math.toRadians(angleA) - Math.toRadians(angleB);
    }
}
class ObtuseTriangle extends Triangle {
    public double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public double area(double base, double height) {
        return (base*height)/2;
    }
    public double thirdDimensionShapePrism(double area, double depth) {
        return area*depth;
    }
    public double thirdDimensionShapePyramid(double area, double depth) {
        return (1/3)*area*depth;
    }
    public double missingAngleDegrees(double angleA, double angleB) {
        return 180 - angleA - angleB;
    }
    public double missingAngleRadians(double angleA, double angleB) {
        return Math.PI - Math.toRadians(angleA) - Math.toRadians(angleB);
    }
}
