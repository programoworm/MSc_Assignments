import com.person.Person;
import com.address.Address;
class Employee{
	public static void main(String[] args){
		//private String name;
		//private int eid;
		//private int salary;
		//private String adress;
		Person p=new Person(101,"Max",10000);
		Address a=new Address("Max","USA");
		p.display();
		a.display();
	}
}
