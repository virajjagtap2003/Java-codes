// print that numbers which are occuring even number of times [9,12,23,10,12,12,15,23,14,12,15]== 12, 15,23 these numbers are occurs even times
import java.util.*;
class Demo{
        public static void main(String[] args){
                int arr[]={9,12,23,10,12,12,15,23,14,12,15};
                ArrayList al=new ArrayList();
               
                for(int i=0;i<arr.length;i++){
                        int count=1;
                        for(int j=i+1;j<arr.length;j++){
                                if(arr[i]==arr[j]){
                                        count++;
                                }
                        }
			if(count%2==0 && !al.contains(arr[i])){
				al.add(arr[i]);
			}
			count=0;


                }
                System.out.println(al);

        }
}


