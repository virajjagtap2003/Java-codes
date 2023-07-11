import java.io.*;
class DemoString{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter first String");
                String str1=br.readLine();
                System.out.println("enter second String");
                String str2=br.readLine();

		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		
		char arr3[]=new char[100];
		int index=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]!=arr2[j]){
					arr3[index]=arr1[i];
					index++;
				
				}
			}
		}
		System.out.println("Display");
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
                
	}
}	
