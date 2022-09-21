public class Parameters {
    public static void main (String[] args) {
        measureRectangle(2,4.3);
    }

    public static void measureRectangle(double length, double width){
        double area = length* width;
        System.out.println("The area of the rectangle with length " + length+ " and width "+ width + " is equal to " + area + "\n");
    }

}
