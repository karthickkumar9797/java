package sample1;

public class program2 {
  public static void main(String[] args) {
	  String s ="abc1234$*";
	  for(int i=0;i<s.length();i++) {
		  char num=s.charAt(i);
		  if(num>='0'&&num<='9') {
			  System.out.print(num);
			 
		  }
		
		  }
	  System.out.println("\t");
	  for(int i=0;i<s.length();i++) {
		  char alpha=s.charAt(i);
		  if(alpha>='a'&&alpha<='z'||alpha>='A'&&alpha<='Z') {
			  System.out.print(alpha);
		  }  
		  }
	  System.out.println("\t");
		  for(int i=0;i<s.length();i++) {
		  char special=s.charAt(i);
		  if(!(special>='0'&&special<='9')&&!(special>='a'&&special<='z'||special>='A'&&special<='Z')) {
			  System.out.print(special);
  }
}
}
}