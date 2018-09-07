
public class BinaryIterativeSearch implements Practice2Search{
	

	public int search(int[] arr, int target){
		int leftBound = 0;
		int rightBound = arr.length-1;
		while(leftBound <= rightBound){
			int indexOfMid = leftBound + (rightBound - leftBound)/2;
			if(arr[indexOfMid] == target){
				return indexOfMid;
			} else if(arr[indexOfMid] < target){
				leftBound = indexOfMid+1;
			} else if(arr[indexOfMid] > target){
				rightBound = indexOfMid-1;
			}
		}
		return -1;
	}


	public String searchName(){
		return "Binary Iterative Search";
	}
}