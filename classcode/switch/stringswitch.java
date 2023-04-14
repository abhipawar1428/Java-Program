class switchdemo{
	public static void main(String[] args){
		System.out.println("Oh!! Pune");
		String str="Non veg";

		switch(str){
			case "veg":{
					   String str1="main menu";
					   switch(str1){
					   	case "starter":{
							System.out.println("Starter Veg");
							break;
						}
						case "main menu":{
							System.out.println("main menu Veg");
							break;
						}
					   }
					
				}
				break;
			case "Non veg":{
					   String str1="starter";
					   switch(str1){
					   	case "starter":{
							System.out.println("Starter non Veg");
							break;
						}
						case "main menu":{
							System.out.println("main menu non Veg");
							break;
						}
					   }
					
				}
				break;
		}
		System.out.println("Thank you!");

	}
}
