class Outer{
	void marry(){
		System.out.println("Kriti sanon ");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer(){
			void marry(){
				System.out.println("Shreya");
			}
		};
		obj.marry();

		//anaymous class is one time used class
		//if we try to create another object of Outer class then new class created
	}
}
