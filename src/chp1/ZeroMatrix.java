/**
 * 
 */
package chp1;
/**
 * 	ZeroMatrix.java
 *	Created on Jul 4, 2015, 1:07:40 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class ZeroMatrix {
	
	public int[][] zeroMatrix(int[][] arr){
		int[] hor = new int[arr[0].length];
		int[] ver = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0){
					hor[i] = 1;
					ver[j] = 1;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(hor[i]==1 || ver[j]==1){
					arr[i][j]=0;
				}
			}
		}
		return arr;
	}

}
