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