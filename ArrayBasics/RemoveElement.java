import java.util.*;
class Remove{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,3,5};
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		int newArr[]=new int[arr.length-1];
		
		int newIndex=0;
		for(int i=0;i<arr.length;i++){
			if(i != index){
				newArr[newIndex]=arr[i];
				newIndex++;	
			}
		}
		for(int ans:newArr){
			System.out.print(ans+"  ");
		}

	}
}
