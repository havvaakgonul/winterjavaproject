package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
		String arr[][]= {{"A","Y","M","B"},{"K","e"},{"L","X","e"}};
	// By using given multidimesional array, print "Bee" ion the console
	
		String s="";
		for (int i=0; i<arr.length; i++) {
			s=s+arr[i][arr[i].length-1];
		/*	for (int j=0; j<arr[i].length; j++) {
				s=s+arr[j][arr[j].length-1];
			}
			*/
		}
		
		
		System.out.println(s);
		//Homework
		//Find the multiplication of the first elements in every array
		int brr[][]= {{32,12,11},{21,34},{3}};
		
		int prod=1;
		for (int i=0; i<brr.length;i++) {
		
			prod=prod*brr[i][0];
			
		}
		System.out.println(prod);
	}

}
