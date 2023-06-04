class Employee{
	int eid;
	String ename;

	void Emp(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}

	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();

		e1.Emp(101,"Amruta");
		e2.Emp(102,"Abhi");

		System.out.println(e1.eid+" "+e1.ename);
		System.out.println(e2.eid+" "+e2.ename);
	}
}
