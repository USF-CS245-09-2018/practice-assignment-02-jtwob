
public class BinaryRecursiveSearch implements Practice2Search{
	public  int search(int[] arr, int target) {
    	return recursiveSearch(arr, 0, arr.length-1, target);
	}

	public int recursiveSearch(int[] arr, int leftBound, int rightBound, int target) {
    	int indexOfMid = (leftBound + rightBound)/2;
    	if(rightBound < leftBound) {
        	return -1;
    	} 
    	if(arr[indexOfMid] == target) {
        	return indexOfMid;
    	} else if(arr[indexOfMid] > target) {
        	return recursiveSearch(arr, leftBound, indexOfMid - 1, target);
    	} else {
        	return recursiveSearch(arr, indexOfMid + 1, rightBound, target);
    	}
	}

	public String searchName(){
		return "Binary Recursive Search";
	}
}