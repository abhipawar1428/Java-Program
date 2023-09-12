interface Core2Web{
	void compInfo(String owner,String domain);
}

class Year2022{
	public static void main(String[] args){
		/*
		Core2Web c2w=(String Owner,String Domain)->{
			System.out.println("Owner : "+Owner);
			System.out.println("Teaching Domain : "+Domain);
		};

		c2w.compInfo("Shashi Sir","Technology");
		
		*/
		Core2Web c2w=(Owns,Domain)->{
			System.out.println("Owner : "+Owns);
			System.out.println("Teaching Domain : "+Domain);
		};

		c2w.compInfo("Shashi Sir","Technology");
	}
}
