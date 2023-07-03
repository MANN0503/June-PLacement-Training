import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayLeader
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i = 0; i < size; i ++) {
		    array[i] = scanner.nextInt(); 
		}
		
		int max = array[array.length - 1];
		
		List<Integer> leader = new ArrayList<>();
        leader.add(max);
        
		
		for(int i = array.length - 2; i >= 0; i--) {
		    if(array[i] > max) {
		        max = array[i];
		        leader.add(max);
		    }
		}
		
		System.out.println("leader: " + leader);
		
	}
}
