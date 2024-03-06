public class SecondSmallestAndLargest{
	public static void main(String[] args) {
		int[] arr = {1,2,4,7,7,5};
		// int[] arr = {0,1,2,3,5};
		// int largest = arr[arr.length-1];
		int largest = arr[0];
		// int smallest = arr[0];
		// int sec = Integer.MIN_VALUE;
		// int ssec = Integer.MIN_VALUE;
		// int count = 0;

		// for (int i=arr.length-2;i>=0;i--) {
		// 	//Brute Force Approach would be to sort first after that take the n-1 element as largest element in an array and iterate as well and if element is not equal to the largest then it is our second largest array.
		// 	if (arr[i] != largest && count != 1) {
		// 		sec = arr[i];
		// 		count++;
		// 	}
		// }
		// System.out.println(sec);
		// System.out.println(largest);


//Better Approach
		// for(int j=0;j<arr.length;j++){
		// 	if (arr[j] > largest) {
		// 		largest=arr[j];
		// 	}
		// }
		// int secondLargest=-1;
		// for(int i=0;i<arr.length;i++){
		// 	if (arr[i] > secondLargest && arr[i] < largest) {
		// 		secondLargest = arr[i];
		// 	}
		// }
		// System.out.println(secondLargest);

		//Optimal approach

		int secondLargest = -1;
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}