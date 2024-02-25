public class SelectionSort{
	public static void main(String[] args) {
		int[] array ={13,46,24,52,20,9};
		int min = 0;
		int c = 0;

		for (int i=0;i<array.length-1;i++) {
			min = array[i];
			for (int j=i+1;j<array.length;j++) {
				if (min > array[j]) {
					min = array[j];
					c = j;
				}
			}
			// System.out.println(min);
			swap(array,i,c);
		}


		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	
}