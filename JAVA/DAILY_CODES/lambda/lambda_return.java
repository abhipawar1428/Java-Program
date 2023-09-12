interface Core2Web{
	String owns(String name);
}
class Demo{
	public static void main(String[] args){
		Core2Web c2w=(name)->{
		//	return "Name : "+name;
		//	return "Shashi";
			return name;

	
		};

		Core2Web c2w1=(name)->("Name : "+name);

		System.out.println(c2w1.owns("Shashi"));
		System.out.println(c2w.owns("Shashi"));
	}
}
