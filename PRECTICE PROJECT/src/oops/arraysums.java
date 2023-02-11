package oops;

public class arraysums {
	
	public static void main(String[] args)
	{
		int[][] x= {{4,4,5,3,5},
		{ 9,5,5,5}};
		int sum=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++) {
				sum= sum+x[i][j];
				
			
			}
	}
		System.out.println(sum);
	}

}
