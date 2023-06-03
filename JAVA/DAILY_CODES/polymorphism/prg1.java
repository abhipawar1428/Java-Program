class PolyDemo{
	int add(int x,int y){
		return x+y;
	}
	float add(int x,float y){
		return x+y;
	}
	float add(float x,float y){
		return x+y;
	}
	public static void main(String[] args){
		PolyDemo obj=new PolyDemo();
		System.out.println(obj.add(10,10));
		System.out.println(obj.add(10.5f,10.5f));
		System.out.println(obj.add(10,1.5f));
	}
}
