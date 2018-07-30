/*
 * Array rotation one by one element in d number of cycles
 * Time complexity : O(n*d)
 * Space complexity : O(1) 
 */
public class ArrayRotation2 {
	/*
	 * Left rotate by d loops 
	 */
	public int[] leftRotate(int[] arr,int d,int n){
		
		for(int i=0;i<d;i++){
			arr = leftRotateOnebyOne(arr,n);
		}
		return arr;
	}
	/*
	 * Left rotate one by one element in the array to left
	 */
	public int[] leftRotateOnebyOne(int[] arr,int n){
		/*
		 * Take the first element to temp variable
		 */
		int temp = arr[0];
		for(int i=0;i<n;i++){
			/*
			 * To Last index copy the temp value i.e., the first element
			 */
			if(i+1 == n){
				arr[i]=temp;
			} else {//copy next index element to current index
				arr[i]=arr[i+1];
			}
		}
		return arr;
	}
	/*
	 * Driver program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		arr = new ArrayRotation2().leftRotate(arr, 3, arr.length);
		StringBuilder sb = new StringBuilder();
		for(int i : arr)
		{
			sb.append(i).append(",");
		}
		System.out.println("Rotated array : "+sb);
	}

}
