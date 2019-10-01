/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t>0)
		{
		    int n,m;
		    int c=0;
		    n = sc.nextInt();
		    m = sc.nextInt();
		    
		    int[] a = new int[n];
		    for(int i=0;i<n;i++)
		      {  
		          a[i] = sc.nextInt();
		          if(a[i]%m ==0)
		              c++;
		      }
		      
		    System.out.println((int)Math.pow(2,c)-1);
		    t--;
		}
	}
}