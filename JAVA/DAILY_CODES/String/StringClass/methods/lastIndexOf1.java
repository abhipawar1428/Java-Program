class Demo{
	public static void main(String[] args){
		String str1="Abhi Pawar";
		System.out.println(str1.lastIndexOf("aw",9)) ;   //6
		System.out.println(str1.lastIndexOf('w',9));    //7
		System.out.println(str1.lastIndexOf('a',6));   //6
		System.out.println(str1.lastIndexOf('x',55));   //-1

		//first parameter is character that we want to search and second is toIndex(upto that index)
		//returns last index of character
		//if not found then returns -1
	}
}
