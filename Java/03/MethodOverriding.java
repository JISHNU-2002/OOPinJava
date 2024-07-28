class Figure{
    int a,b;
    Figure(int x,int y){
        a = x;
        b = y;
    }

    int area(){
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(int x,int y){
        super(x,y);
    }

    int area(){
        return (a*b);
    }
}

class Triangle extends Figure{
    Triangle(int x,int y){
        super(x,y);
    }

    int area(){
        return (a*b)/2;
    }
}

class MethodOverriding{
    public static void main(String args[]){
        Figure f = new Figure(1,2);
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(5,6);
        Figure fig;
        fig = f;
        System.out.println("area of figure = "+fig.area());
        fig = r;
        System.out.println("area of rectangle = "+fig.area());
        fig = t;
        System.out.println("area of triangle = "+fig.area());
    }
}