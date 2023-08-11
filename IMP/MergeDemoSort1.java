// merge two arrays in sorted order

class MergeDemo{
        public static void main(String[] args){
                int arr1[]={1,3,5,7,9};
                int arr2[]={2,4,6,8};

                int size1=arr1.length;
                int size2=arr2.length;

                int size3=size1+size2;

                int arr3[]=new int[size3];
                int itr=0;
                int itr1=0;
                int itr2=0;
                int itr3=0;

                for(int i=0;i<arr1.length;i++){
                        if(arr1[i]<arr2[i]){
                                arr3[itr]=arr1[i];
                                itr1++;
                                itr++;
                        }else{
                                arr3[itr]=arr2[i];
                                itr2++;
                                itr++;
                        }
                }



                for(int i=0;i<arr3.length;i++){
                        System.out.print(arr3[i]+" ");
                }
        }
}
~                                                                                                                                                           ~                                                                                                                                                                                 
