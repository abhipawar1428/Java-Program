import java.util.*;
class CricPlayer{
	String name=null;
	int jerNo=0;

	CricPlayer(String name,int jerNo){
		this.name=name;
		this.jerNo=jerNo;
	}
	public String toString(){
		return name+" : "+jerNo;
	}
}
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new CricPlayer("Virat",7));
		al.add(new CricPlayer("Rohit",45));
		al.add(new CricPlayer("Hardik",33));
		al.add(1,new CricPlayer("Sachin",1));
		al.add(2,new CricPlayer("Yuvraj",11));
		
		System.out.println("List of  players:");
		System.out.println(al);

		System.out.println("List using for each loop");
		for(var obj:al){
			System.out.print(obj+" ");
		}
		System.out.println();

		System.out.println("List using for loop");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		System.out.println();

		//contains method
		System.out.println("Does this list contains virat? "+al.contains("Virat"));


	}
}
