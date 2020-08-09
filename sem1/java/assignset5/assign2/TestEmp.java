import com.person.Person;
//import com.address.Address;
class Employee extends Person{
	int eid;
	String name;
	public void setData(int eid,String name,int salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public void getData(){
		System.out.println("Eid="+this.eid+" Name="+this.name+" salary="+this.salary);
	}
}
class TestEmp{
	public static void main(String[] args){
		Person p=new Person();
		Employee e=new Employee();
		p.setData(101,"Max(Person)");
		e.setData(105,"Max(Employee)",10000);
		p.getData();
		e.getData();
	}
}
