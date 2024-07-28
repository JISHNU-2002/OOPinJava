class Point{
    public static void main(String args[]){
        XY obj = new XY();
        obj.setX(87);
        obj.getX();
        obj.setY(23);
        int y = obj.getY();
        System.out.println(y);
    }
}

class XY{
    private int x,y;
    public void setX(int x){
        this.x = (x>79 ? 79 : (x<0 ? 0 : x));
    }

    public void setY(int y){
        this.y = (y>24 ? 24 : (y<0 ? 0 : y));
    }

    public int getX(){
        System.out.println(x);
        return 0;
    }

    public int getY(){
        return y;
    }
}