package chp1;

public class RotateMatrix {
	
	
	// N *N 
	public static int[][] rotateMatrix(int[][] arr){
		
		if(arr==null|| arr.length==0)
			return arr;
		int temp = 0;
		for(int layer = 0; layer<arr.length/2;layer++){
			int st = layer;
			int end = arr.length-st-1;
			
			for(int i=st;i<end;i++){
				temp = arr[layer][i];
				
				arr[layer][i] = arr[end][i];
				
				arr[end][i] = arr[end][end-i];
				
				 arr[end][end-i] = arr[end-i][st];
				 
				arr[end-i][st] = temp;
				
			}
		}
		return arr;
	}

}
