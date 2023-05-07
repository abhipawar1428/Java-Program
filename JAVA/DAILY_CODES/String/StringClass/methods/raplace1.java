class Demo{
	public static void main(String[] args){
		String str="Abhi pawar";
		System.out.println(str.replace('a','d'));          //Abhi pdwdr
		System.out.println(str);                           //Abhi pawar
		//System.out.println(str.replace("paw",'d'));      //argument mismatch 
		//System.out.println(str.replace('i',"yii"));      //argument mismatch
		//do not push string as parameters
		System.out.println(str.replace('x','d'));          //Abhi pawar

		
	}
}
