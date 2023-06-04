class Employee{
	int eid;
	String ename;

	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}

	public static void main(String[] args){
		Employee e1=new Employee(101,"Abhi");
		Employee e2=new Employee(102,"Amruta");

		System.out.println(e1.eid+" "+e1.ename);
		System.out.println(e2.eid+" "+e2.ename);
	}
}
