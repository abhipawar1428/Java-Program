class Employee{
	int eid=10;
	String ename="Kanha";
	static int companyId=110;

	void empInfo(){
		System.out.println("eid= "+eid);
		System.out.println("ename= "+ename);
		System.out.println("compantId= "+companyId);
	}
}
class Client{
	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();

		System.out.println("emp 1 details");
		e1.empInfo();
		
		System.out.println("emp 2 details");
		e2.empInfo();

		e2.eid=20;
		e2.ename="Irshad";
		e2.companyId=100;
		
		System.out.println("emp 1 details");
		e1.empInfo();
		
		System.out.println("emp 2 details");
		e2.empInfo();


	}
}
//emp 1 details
//eid=10
//ename=Kanha
//companyId=110
//
//emp 2 details
//eid=10
//ename=Kanha
//companyId=110
//
//emp 1 details
//eid=10
//ename=Kanha
//companyId=100
//
//emp 2 details
//eid=20
//ename=Irshad
//companyId=100
//
