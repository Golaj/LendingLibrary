
package project1;

public class Rectangle {
    private double height;
    private double base;
    
    public Rectangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public double getArea(){
        return base*height;
    }
    public double getCircumference(){
        return (base*2)+(height*2);
    }
}
