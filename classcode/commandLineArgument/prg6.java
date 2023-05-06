class demo{
	public static void main(String [] args){


		String var1=args[0]+args[1]+args[2];
		System.out.println(System.identityHashCode(args[0]));
		System.out.println(System.identityHashCode(args[1]));
		System.out.println(System.identityHashCode(args[2]));
		System.out.println(System.identityHashCode(var1));
		System.out.println(var1);
	}
}
