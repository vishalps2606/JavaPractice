/* 
    write a program to shuffle the integers of an array in the form of this formula
    a1 <= a2 >= a3 <= a4 >= a5 ...
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {2,1,5,3,11,7};
		solve(arr);
	}
	
	private static void solve(int[] arr){
	    
	    int len = arr.length, len1, len2;
	    if(len%2 == 0){
	        len1 = len2 = len/2;
	    }
	    else{
	        len2 = len/2;
	        len1 = len2+1;
	    }
	    Arrays.sort(arr);
	    
	    int[] ans = new int[len];
	    int[] small = new int[len1];
	    int[] large = new int[len2];
	    int j = 0, k = 0;
	    for(int i = 0; i < len1; i++){
	        small[j++] = arr[i];
	    }
	    for(int i = len1; i < len1+len2; i++){
	        large[k++] = arr[i];
	    }
	    
	    int l = 0;
	    for(int i = 0; i < Math.min(len1, len2); i++){
	        ans[l++] = small[i];
	        ans[l++] = large[i];
	    }
	    if(len1 > len2){
	        ans[l++] = small[len1-1];
	    }
	    
	    for(int i = 0; i < ans.length; i++){
	        System.out.print(ans[i] + " ");
	    }
	}
}

/* OUTPUT
   1 5 2 7 3 11
*/
