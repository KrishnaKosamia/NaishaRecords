package oops;

public class CHARACTERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "#$%^*(SOURAV PANDA WEDS SHRUTEE REKHA##";
		int[] count1 = new int[128];
		for (int i = 0; i < x.length(); i++) {
			char charAt = x.charAt(i);
			count1[charAt]++;
			
		}
		
		for (int i = 0; i < count1.length; i++) {
			
			if(!(count1[i]==0)) {
				System.out.println((char)(i)+ " "+count1[i]);
				
				
			}
			
		}
	}

}
