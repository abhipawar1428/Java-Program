import java.io.*;
class MyDelete{
	static StringBuffer mydelete(StringBuffer sb,int from,int end){
	
		char arr[]=new char[sb.length()-(end-from)];
		
		for(int i=0;i<sb.length();i++){
			if(i<from){
				arr[i]=sb.charAt(i);
			}else if(i>=end){
				arr[i-end+from]=sb.charAt(i);
			}

		}
	
		
		sb=new StringBuffer(new String(arr));
		
		return sb;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter StringBuffer");
		StringBuffer sb=new StringBuffer(br.readLine());
		System.out.println("Enter from index and end index to delete subString");
		int from=Integer.parseInt(br.readLine());
		int end =Integer.parseInt(br.readLine());
		if(from<sb.length() && from>-1 && end<=sb.length() && end>0){
			sb=mydelete(sb,from,end);
			System.out.println(sb);
		}else{
			System.out.println("Wrong Index enter");
		}
	}
}
