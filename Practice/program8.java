// missing number in array

class Missing {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 4,5,6, 8, 9, 10};
        int arr1[] = new int[10];
        int index = 0;
        int no = 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1) {
               	 arr1[index]=arr[i];
		 index++;
		
            }
        }
        
        System.out.println("Display");
        for (int i = 0; i < index; i++) {
            System.out.println(arr1[i]);
        }
    }
}

