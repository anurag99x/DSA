public class MergeSortFour{
	public void mergeSort(int[] arr,int low,int high){
		int mid = low+high/2;

		if (low == high) {
			return;
		}

		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

	public void merge(int[] arr,int lw,int mid,int high){
		int left = low;
		int right = mid+1;
		List<Integer> temp = new ArrayList<>();
		int j = 0;

		while(low <= mid && right <= high){
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else{
				temp.add(arr[right]);
				right++;
			}
		}

		while(left <= mid){
			temp.add(arr[left]);
			left++;
		}

		while(right <= high){
			temp.add(arr[right]);
			right++;
		}

		for (int i = low;i<= high;i++) {
			arr[i] = temp.get(j);
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1,5,6,2,4};

		mergeSort(arr,0,arr.length-1);

		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}	
}