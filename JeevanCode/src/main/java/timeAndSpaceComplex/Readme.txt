Consider an set of numbers = {1,2,3,4,5,6}
need to search the position of number "1" 
	i. Base case : {1,2,3,4,5,6} position of "1" is at 1, 
					so complexity is Ω(1) 
	ii. Average Case : {2,1,3,5,6,4} at position 2 
						OR {3,5,4,6,1,2} at position 5 
						OR {6,3,1,4,2,5} at position 3
						Average of all the cases is (1+2+3+4+5+6) positions/6 = n(n+1)/(2*n)
						So Complexity is 𝚯((n+1)/2)
	iii. Worst case : when 1 is at last position i the set {5,2,6,4,3,1} 
					  position of 1 is at last(nth) position, 
					  so complexity O(n)
				
-----------------------------------------------------------------------------------------------

Example 1 :
			for(int i=0;i<n;i++) { // n times
				for(int j=0;j<n;j++) { // n times
					So the complexity is O(n^2)
				}
			}

Example 2 :
			for(int i=0;i<n;i++) { // n times
				for(int j=0;j<m;j++) { // m times
					So the complexity is O(n*m)
				}
			}
Example 3 :
			for(int i=0;i<n;i++) { // n times
					So the complexity is O(n)
			}
Example 4 :
			for(int i=0;i<n;i++) { // n times
				complexity is O(n)
			}
			for(int j=0;j<m;j++) { // m times
				complexity is O(m)
			}
			So the total complexity is O(m+n)
