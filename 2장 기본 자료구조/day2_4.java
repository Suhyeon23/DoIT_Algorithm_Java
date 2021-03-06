package day2;
// 배열 복사 (배열 b전체를 배열a에 복사)

class day2_4 {
	//배열 복사 메서드 copy
	static void copy(int a[],int b[]) {
		int num = a.length<=b.length? a.length : b.length;
		for(int i=0;i<num;i++) {
			a[i]=b[i];
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
		int a[] = new int[] {5,10,73,2,-5,42};
		System.out.print("a[] = "); printArray(a);
		int b[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.print("b[] = "); printArray(b);
		
		copy(a,b); 
		System.out.print("복사 후 a[] = "); printArray(a);
	}
}