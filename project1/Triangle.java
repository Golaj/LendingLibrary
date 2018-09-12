package project1;

public class Triangle {
    
    private double a;
    private double b;
    private double c;
    private double height;
    private double base;
   
    
    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Triangle (double height, double base){
        this.height = height;
        this.base = base;
    }

    public double getSideA() {
        return a;
    }

    public void setSideA(double a) {
        this.a = a;
    }

    public double getSideB() {
        return b;
    }

    public void setSideB(double b) {
        this.b = b;
    }

    public double getSideC() {
        return c;
    }

    public void setSideC(double c) {
        this.c = c;
    }
    
    
     
    public double getArea() {
        double area = 0;
        if (a>0){
            double s = (0.5) * (a+b+c);
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            
        } else if (base > 0){
            area = (base*height) / 2;
        }
        return area;
    }
    
   public double getCircumference(){
       if (base > 0){
           System.out.println("Can't calculate circumference with only a base and height.");
       }
       return a+b+c;
   }
    
}
