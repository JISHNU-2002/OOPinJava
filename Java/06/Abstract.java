abstract class Figure{
    double a,b;
    Figure(double num1,double num2){
        a = num1;
        b = num2; 
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(int num1,int num2){
        super(num1,num2);
    }

    double area(){
        return a*b;
    }
}

class Triangle extends Figure{
    Triangle(int num1,int num2){
        super(num1,num2);
    }

    double area(){
        return a*b/2;
    }
}

class Abstract{
    public static void main(String args[]){
        Figure obj;
        Rectangle r = new Rectangle(23,54); 
        Triangle t = new Triangle(23,54);

        obj = r;
        System.out.println(obj.area());
        obj = t;
        System.out.println(obj.area());
    }
}