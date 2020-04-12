class day1_3 {
//네 값의 최솟값을 구하는 min4 메서드 작성
	static int min4(int a,int b,int c,int d){
		int min = a;
		if(min>b) min=b;
		if(min>c) min=c;
		if(min>d) min=d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(4,2,5,3) = "+min4(4,2,5,3));
		}
}
