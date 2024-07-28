class Employee{
    public static void main(String args[]){
        Company obj = new Company();
        obj.setId(1);
        obj.setName("Jishnu");
        obj.setSalary(100000);
        obj.getDetails();
    }
}

class Company{
    int id;
    String name;
    double salary;

    void setId(int i){
        id = i;
    }

    void setName(String n){
        name = n;
    }

    void setSalary(int s){
        salary = s;
    }

    void getDetails(){
        System.out.println(id+" "+name+" "+salary);
    }
}