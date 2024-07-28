package mypack_2;
import mypack.Employee;

class Manager extends Employee{
    String dept;
    
    Manager(int eid,Stringn ename,String dept){
        super(eid,ename);
        this.dept = dept;
    }

    void display(){
        super.display();
        System.out.println("dept = "+dept);
    }

    public static void main(String args[]){
        Manager obj = new Manager(1,"jishnukkuttan","cse");
        obj.display();
    }
}