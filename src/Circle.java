public class Circle {
    //data members to hold the properties
    private double radius, area, circumference;
    private final double PI=3.14;
    //methods to perform the operation
    public void setRadius(double r){
        radius=r;
    }
    public void showArea(){
        area=PI*radius*radius;
        System.out.println("Area of Circle : "+area);
    }
}
