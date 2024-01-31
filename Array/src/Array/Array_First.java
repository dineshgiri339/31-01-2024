package Array;

public class Array_First {
	public static void main(String args[]) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		for (int i=0;i<ar.length;i=i+1) {
			System.out.println(ar[i]);
		}
		System.out.println(ar[1]);
		System.out.println(ar[(ar.length)-1]);
		System.out.println(ar.length);
		ar[1]=22;
	}

}
