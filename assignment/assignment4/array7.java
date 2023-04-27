//Take array from user and print second largest element

import java.io.*;

class SecondLargest {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		int max1 = 0;
		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max1 = max;
				max = arr[i];

			}
		}
		System.out.println("second max=" + max1);
	}
}
