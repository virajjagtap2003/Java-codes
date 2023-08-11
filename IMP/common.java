import java.util.*;
class Demo{
	public static void main(String[] args){
		int arr1[]={1,2,3,4,5};
		int arr2[]={9,8,5,1,7,334,34,23,2};
		int arr3[]={70,1,10,44,2,45,7};
		int count=0;
		ArrayList<Integer>list =new ArrayList<>();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
					for(int k=0;k<arr3.length;k++){
					
						if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
								count++;			
								list.add(arr1[i]);
						}
	

			}
		}
		}
		/*for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(list.get(i)==arr3[j]){
					
					break;	
				}
			}
		}*/
		
		for(int i=0;i<count;i++){
			System.out.print(list.get(i)+"  ");
		}
	}
}	
