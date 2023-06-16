public class Main
{
	public static void main(String[] args) {
		int n = 6;
		int arr[] = {0,1,1,0,1,0};
		int i=0, j=n-1;
		
		while(i<j) {
		    if(arr[i] == 0){
		        i++;
		    } else if (arr[j] == 1){
		        j--;
		    } else { arr[i] = 0;
		        arr[j] = 1;
		        i++; j--;
		    }
		}
		System.out.println("The sorted 0s and 1s are " );
		for(int k=0; k<n; k++) {
		    System.out.print(arr[k] + " ");
		}
	}
}
