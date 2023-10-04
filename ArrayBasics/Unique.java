import java.util.*;
class UniqueDemo{
	public static void main(String[] args){
		int arr[]={2,1,2,3,1,3,4,5,5};
		
		HashMap<Integer,Integer> hm=new HashMap();
		for(int key:arr){
			hm.put(key,hm.getOrDefault(key,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		
	}
}
