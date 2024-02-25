public class InsertionSort{
	public static void main(String[] args) {
		int[] array ={6,8,9,12,14,15,7};
		int min = 0;
		int c = 0;

		for (int i=0;i<array.length;i++) {
			for (int j=1;j<array.length;j++) {
				if (array[j] < array[j-1]) {
					swap(array,j,j-1);
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