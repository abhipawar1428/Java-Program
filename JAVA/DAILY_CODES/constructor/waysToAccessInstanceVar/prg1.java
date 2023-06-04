//directly within class 
class Employee{
	int eid=101;
	String name="Rahul";

	public static void main(String[] args){
		Employee obj1=new Employee();
		Employee obj2=new Employee();

		System.out.println(obj1.eid+" "+obj1.name);
		System.out.println(obj2.eid+" "+obj2.name);
	}
}
//101 Rahul
//101 Rahul
