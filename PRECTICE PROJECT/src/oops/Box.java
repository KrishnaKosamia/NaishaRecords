package oops;

public class Box {
	
	int length;
	int breadth;
	int height;
	
	Box(int length, int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
	}
	public int printvolume()
	{
		return length*breadth*height;
	}
	public static void main(String[] args) {
		Box b1= new Box(2,6,7);
		int printvolume =b1.printvolume();
		
		System.out.println(printvolume);
		
	}

}
