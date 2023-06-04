// using refernce variable (here objects=e1 and e2)
class Employee{
	int eid;
	String ename;

	public static void main(String[] args){
		Employee e1=new Employee();
		e1.eid=101;
		e1.ename="Rahul";
		System.out.println(e1.eid+" "+e1.ename);
		
		Employee e2=new Employee();
		e2.eid=102;
		e2.ename="Rohit";
		System.out.println(e2.eid+" "+e2.ename);

	}
}
