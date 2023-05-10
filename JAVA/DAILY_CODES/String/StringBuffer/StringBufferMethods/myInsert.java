import java.io.*;
class MyInsert{
	static StringBuffer myinsert(StringBuffer sb,int index,String str){
		char arr[]=new char[sb.length()+str.length()];
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(i>=index && cnt<str.length()){
				cnt++;
				arr[i]=str.charAt(i-index);

			}else if(i<index){
				arr[i]=sb.charAt(i);
			}else{
				arr[i]=sb.charAt(i-str.length());
			}
		}
		sb=new StringBuffer(new String(arr));
		return sb;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter StringBuffer");
		StringBuffer sb=new StringBuffer(br.readLine());

		System.out.println("Enter String to Insert");
		String str=br.readLine();
		System.out.println("At what index to you want to Insert String");
		int index=Integer.parseInt(br.readLine());

		if(index<sb.length()){
			sb=myinsert(sb,index,str);
			System.out.println(sb);
		}else{
			System.out.println("Index out of range");
		}
	}
}

