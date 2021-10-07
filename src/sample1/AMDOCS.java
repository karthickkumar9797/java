package sample1;

public class AMDOCS {

	public static void main(String[] args) {
		String s="a1b2c3";
		for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9') {
		
			int count =Integer.parseInt(s.charAt(i+1)+"");
		
			if(count%2!=0) {
				for(int j=0;j<=count;j++) {
					System.out.print(s.charAt(i));
					
				}
			}
				else {
					System.out.print(s.charAt(i));
				}
			}
		}
		}
	}


