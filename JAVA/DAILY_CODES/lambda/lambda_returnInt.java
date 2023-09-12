interface Add{
	int add(int x,int y);
}
class Demo{
	public static void main(String[] args){
		Add obj=(x,y)->(x+y);
		Add obj2=(x,y)->{
			return x+y;
		};
		System.out.println(obj.add(50,60));
		System.out.println(obj2.add(50,50));
	}
}
