public class QuickSort{
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1,5,6,2,4};

		quickSort(arr,0,arr.length-1);

		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


	}
	public static void quickSort(int[] arr , int low , int high){
		if (low < high) {
			int partition = fun(arr,low,high);
			quickSort(arr,low,partition-1);
			quickSort(arr,partition+1,high);
		}
	}

	public static int fun(int[] arr , int low , int high){
		int i = low;
		int j = high;
		int pivot = low;

		while(j > i){
			while(arr[i] <= arr[pivot] && i <= high){
				i++;
			}
			while(arr[j] > arr[pivot] && j >= low){
				j--;
			}
			if (j > i) {
				swap(arr,i,j);
			}
		}

		swap(arr,pivot,j);
		return j;
	}

	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}