package chp1;

public class URLify {

	// please use a char array , do inplace
	public static char[] replace(char[] arr, int length){
		if(arr == null || length ==0)
			return arr;
		
		int i=0,count=0;
		while(i<length){
			if(arr[i]==' '){
				count++;
			}
			i++;
		}
		
		int newEnd = length+count*2;
		
		newEnd=newEnd-1;
		i=length-1; 
		while(i>=0){
			if(arr[i]==' '){
				arr[newEnd]='0';
				arr[newEnd-1]='2';
				arr[newEnd-2]='%';
				newEnd=newEnd-2;
			}else{
				arr[newEnd]=arr[i];
			}
			i--;
			newEnd--;

		}
		return arr;
	}

}
