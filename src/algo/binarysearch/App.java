package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		//System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0, 7,  99));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 7));


	}
	
	public static int binarySearch(int [] a, int x){
		int p = 0;
		int r = a.length-1;
		double start = System.currentTimeMillis();
		while(p <= r){
			int q = (p+r)/2;
			if(x < a[q]) r = q-1;
			else if (x > a[q]) p = q+1;
			else return q;
		}

		double end = System.currentTimeMillis() - start;
		//System.out.println(System.ti);
		return -1;
	}

	public static int recursiveBinarySearch(int [] a, int p, int r, int x){
		System.out.println("[ "+ p + "..." + r + " ]");
		if( p > r){
			return -1;
		} else{
			int q = (p+r)/2;
			if(a[q] == x){
				return q;
			} else if (a[q] > x){
				return recursiveBinarySearch(a, p, q-1, x);
			} else{
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}
	
	public int getElementFrom(int [] a, int index){
		return a[index];
	}
	
	
}
