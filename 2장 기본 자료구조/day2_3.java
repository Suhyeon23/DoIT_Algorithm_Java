package day2;
// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성

class day2_3 {
	//배열 요소의 합계를 구하는 메서드
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) sum += a[i];
		return sum;
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
		System.out.print("배열 모든 요소의 합 : " + sumOf(x));
	}
}