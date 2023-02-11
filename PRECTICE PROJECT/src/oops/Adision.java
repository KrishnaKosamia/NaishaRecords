package oops;

public class Adision {
	
	
	public int add (int x,int y){
		
		return x+y;
		
		
	}
	
	
	public int add (int x,int y,int z){
		
		return x+y+z;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //method overloading
		//method is but argument is diffrent
		
       Adision a= new Adision();
       System.out.println(a.add(9,9,89));
       
	}

}
