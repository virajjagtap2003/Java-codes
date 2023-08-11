import java.util.*;
class Demo1{
        public static void main(String[] args){
                int n=5;
                int arr1[]={1,2,2,3,5};
                int arr2[]=new int[arr1.length+1];
                ArrayList<Integer> missing=new ArrayList<>();
                ArrayList<Integer> Duplicate=new ArrayList<>();

                for(int i=0;i<arr1.length;i++){
                        int val1=arr1[i];
                        arr2[val1]=arr2[val1]+1;
                }
                for(int i=1;i<arr2.length;i++){
                        if(arr2[i]==0){
                                missing.add(i);
                        }else if(arr2[i]>1){
                                Duplicate.add(i);
                        }
                }
                for(int i=0;i<missing.size();i++){
                        System.out.print(missing.get(i)+"  ");

                }
                System.out.println();
                for(int i=0;i<Duplicate.size();i++){
                        System.out.print(Duplicate.get(i)+"  ");

                }
        }
}
