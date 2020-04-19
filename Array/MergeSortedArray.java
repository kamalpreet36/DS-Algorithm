

public class MergeSortedArray {
	public int[] mergeArrays(int[] array1, int[] array2){
		
		int[] array = new int[array1.length + array2.length];
		 
		int i=0, j=0, k=0;
		
		while(i < array1.length && j < array2.length ){
			if(array1[i] < array2[j]){
				array[k++] = array1[i];
				i++;
			}
			
			else {
				array[k++] = array2[j];
				j++;
			}
		}
		
		if(i == array1.length){
			while(j<array2.length){
				array[k++] = array2[j];
				j++;
			}
		}
		
		else{
			while(i<array1.length){
				array[k++] = array1[i];
				i++;
			}
		}
		
		return array;
		
	}
	
	public static void main(String[] args) {
		MergeSortedArray merge = new MergeSortedArray();
		int[] array1={1, 5, 7, 40};
		int[] array2 = {2, 7, 12};
		int[] result = merge.mergeArrays(array1, array2);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+ " ");
	}
}
