import java.util.*;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		/*
		al.add(20.5);
		al.add(20.9f);
		al.add("Abhi");
		*/                     //error-> only Integer data will be stored

		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al.size());
		System.out.println(al);
	}
}
