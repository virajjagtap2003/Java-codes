class ArrayDemo1{

        void fun(int arr[]){
                arr[1]=700;
                arr[2]=800;
        }
        public static void main(String [] args){
                int arr[]={1000,2000,3000,4000};

                System.out.println(System.identityHashCode(arr[0]));
                System.out.println(System.identityHashCode(arr[1]));
                System.out.println(System.identityHashCode(arr[2]));
                System.out.println(System.identityHashCode(arr[3]));

                ArrayDemo obj=new ArrayDemo();
                obj.fun(arr);

                for(int x:arr){
                        System.out.println(x);

                }

                System.out.println(System.identityHashCode(arr[1]));
                System.out.println(System.identityHashCode(arr[2]));
                int x=700;
                int y=800;

                System.out.println(System.identityHashCode(x)); // same identity hashcode because value 70 is already present in Integer cashe
                System.out.println(System.identityHashCode(y));
        }
}
