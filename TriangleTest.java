public class TriangleTest {
    public static void main(String[] args) {
        Triangle eq = new EquilateralTriangle(5.0);
        System.out.println("--- Equilateral Triangle ---");
        System.out.println("Perimeter: " + eq.getPerimeter());
        System.out.println("Longest Side: " + eq.getLongestSideLength());
        System.out.println("Largest Angle: " + eq.getLargestAngle());

        Triangle rt = new RightTriangle(3.0, 4.0, 5.0);
        System.out.println("\n--- Right Triangle ---");
        System.out.println("Perimeter: " + rt.getPerimeter());
        System.out.println("Longest Side: " + rt.getLongestSideLength());
        System.out.println("Largest Angle: " + rt.getLargestAngle());
    }
}