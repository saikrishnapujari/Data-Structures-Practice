
public class ArrayRotation3 {
	/*
	 * Left rotate using array divided into number of blocks equal to gcd(n,d) 
	 * With in each block replace current by current + d  
	 */
	public int[] leftRotate(int[] arr,int d,int n){
		
		for(int i=0;i<gcd(n,d);i++){
			int j,k,temp;
			temp = arr[i];
			j = i;
			while(true){
				k=j+d;
				if(k>=n)
					k = k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		return arr;
	}
	/*
	 * GCD using recursion
	 */
	
	public int gcd(int n,int d){
		if(d==0){
			return n;
		}else {
			return gcd(d,n%d);
		}
	}
	/*
	 * Driver program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		arr = new ArrayRotation3().leftRotate(arr, 3, arr.length);
		StringBuilder sb = new StringBuilder();
		for(int i : arr)
		{
			sb.append(i).append(",");
		}
		System.out.println("Rotated array : "+sb);
	}

}
