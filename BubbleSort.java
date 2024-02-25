public class BubbleSort{
	public static void main(String[] args) {
		int[] array ={13,46,24,52,20,9};
		int min = 0;
		int c = 0;

		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length-1;j++) {
				if (array[j] > array[j+1]) {
					swap(array,j,j+1);
				}
			}
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