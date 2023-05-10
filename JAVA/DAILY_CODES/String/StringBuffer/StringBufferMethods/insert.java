class InsertDemo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("AbhiPawar");
		sb.insert(4,"Sammer");
		StringBuffer sb1=new StringBuffer("Rohit");
		sb1.insert(5,sb);

		System.out.println(sb);
		System.out.println(sb1);
	}
}
