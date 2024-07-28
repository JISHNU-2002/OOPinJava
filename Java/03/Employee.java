package mypack;

class Employee{
    int eid;
    String ename;

    Employee(){
        System.out.println("Empolyee class constructor without any argument");
    }

    Employee(int eid){
        this.eid = eid;
        this.ename = "jishnu js";
        System.out.println("Empolyee class constructor with 1 argument");

    }

    Employee(int eid,String ename){
        this.eid = eid;
        this.ename = ename;
        System.out.println("Empolyee class constructor with 2 argument");

    }

    void display(){
        System.out.println("Eid = "+eid+"\nEname = "+ename);
    }
}