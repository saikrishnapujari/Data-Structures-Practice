/*
	 * Driver program for Array rotation using temp array
	 * Time complexity : O(n)
	 * Space complexity : O(d)
	 */
public class ArrayRotation1 {
	
	public int[] rotate(int[] arr,int d,int n){
		int[] temp = new int[d];
		
		for(int i=0;i<arr.length;i++){
			if(i<d){
				temp[i]=arr[i];
			}
			if(!(i+d>=arr.length)){
				arr[i]=arr[i+d];
			}else{
				arr[i]=temp[(i+d)-arr.length];
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
		arr = new ArrayRotation1().rotate(arr, 3, arr.length);
		StringBuilder sb = new StringBuilder();
		for(int i : arr)
		{
			sb.append(i).append(",");
		}
		System.out.println("Rotated array : "+sb);
	}

}
