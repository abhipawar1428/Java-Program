interface Core2Web{
	void start(int numOfCourses);
}
class Year2022{
	public static void main(String[] args){
		
		/*
		Core2Web c2w=(numOfCourses)->{
			System.out.println("BootCamp/Java/OS/Flutter : "+numOfCourses);
		};
		*/
		/*
		Core2Web c2w=(int numOfCourses)->{
			System.out.println("BootCamp/Java/OS/Flutter : "+numOfCourses);
		};
		*/
		Core2Web c2w=numOfCourses->{
			System.out.println("BootCamp/Java/OS/Flutter : "+numOfCourses);
		};

		c2w.start(8);
	}
}
