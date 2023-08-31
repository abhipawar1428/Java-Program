import java.util.*;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add(20.9f);
		al.add("Abhi");
		al.add(' ');
		System.out.println(al);

		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).getClass().getName());
		}
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		for(var obj:al){
			System.out.println(obj);
		}
	}
}
