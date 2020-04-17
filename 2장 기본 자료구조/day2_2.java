package day2;
// 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램

class day2_2 {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int a[],int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int a[]) {
		for(int i=0;i<a.length/2;i++) {	
			swap(a,i,a.length-i-1);
			System.out.println("a["+ i +"]과(와) a[" + (a.length-i-1) + "]를 교환합니다.");
			printArray(a);
		}
	}
	// 배열의 요소 조회
	static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		int x[] = new int[] {5,10,73,2,-5,42};
		printArray(x);
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}