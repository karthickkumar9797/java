package sample1;



public class withoutSorting {

	public static void main(String[] args) {
		int[] a= {2,1,3,4,5,6};
		int max=a[0];
		int secondmax=a[1];
		for(int i=0;i<a.length;i++) {
			if(max <a[i]) {
				secondmax=max;
				max=a[i];
				
			}
			else if(a[i]<secondmax && a[i]!=max){
				secondmax=a[i];
			}
		}
		System.out.println(secondmax);
	}
}
		