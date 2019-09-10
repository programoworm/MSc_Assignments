/*1. Design a “Student” class having fields like “name”, ”rollno” and “address”. Write a derived class called
“MSc_Student” having fields like dept and semester. Write proper constructors for both the classes and
proper display() method in the derived class to display the details of MSc_Student. Use a Demo class to
demonstrate the above.*/
class Student{
	String name,address;
	int rollno;
//	Student(){
}
class MSc_Student extends Student{
	String dept;
	int semester;
	MSc_Student(String nam,String add,int roll, String deptt, int sem){
		this.name=nam;
		this.address=add;
		this.rollno=roll;
		this.dept=deptt;
		this.semester=sem;
	}
	public void display(){
		System.out.println("Name: "+name+"\nAddress: "+address+"\nRoll No: "+rollno+"\nDepartment: "+dept+"\nSemester: "+semester);
	}
}
class Assign1{
	public static void main(String[] args){
		MSc_Student obj=new MSc_Student("Raj","Kolkata",20,"CSE",1);
		obj.display();
	}
}