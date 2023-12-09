class Employee{
	String name,address,phone_no;
	int age;
	double salary;
	Employee(String n,int a,String ph,String add,double sal){
		name=n;
		age=a;
		phone_no=ph;
		address=add;
		salary=sal;
	}
	void printSalary(){
		System.out.println("salary: "+salary);
	}
}
class Officer extends Employee{
	String specialization;
	Officer(String n,int a,String ph,String add,double sal){
		super(n,a,ph,add,sal);
	}
	void officerInfo(){
		System.out.println("OFFICER\nName : "+name+"\nAge :"+age+"\nphone number : "+phone_no+"\nAddress : "+address);
	}
}
class Manager extends Employee{
	String department;
	Manager(String n,int a,String ph,String add,double sal){
		super(n,a,ph,add,sal);
	}
	void managerInfo(){
		System.out.println("\nMANAGER\nName : "+name+"\nAge :"+age+"\nphone number : "+phone_no+"\nAddress : "+address);
	}
}
class inheritanceDemo{
	public static void main(String args[]){
	
		Officer o=new Officer("Raj",45,"9786542232","house_name\n\t  post_office\n\t  district\n\t  State",50000);
		Manager m=new Manager("Ann",50,"8262672465","house_name\n\t  post_office\n\t  district\n\t  State",80000);
		o.officerInfo();
		o.printSalary();
		m.managerInfo();
		m.printSalary();
}}
