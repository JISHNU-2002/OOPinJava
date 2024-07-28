class DynamicDispatch{
    public static void main(String args[]){
        Employee obj;
        obj = new Employee();
        obj.role();
        obj = new Manager();
        obj.role();
        obj = new Director();
        obj.role();
    }
}

class Employee{
    Employee(){
        System.out.println("Employee object obj acts as reference variable");
    }
    void role(){
        System.out.println("Employee");
    }
}

class Manager extends Employee{
    void role(){
        System.out.println("Manager");
    }
}

class Director extends Employee{
    void role(){
        System.out.println("Director");
    }
}
