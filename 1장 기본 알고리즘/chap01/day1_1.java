class day1_1 {
//네 값의 최댓값을 구하는 max4 메서드 작성
	static int max4(int a,int b,int c,int d){
		int max = a;
		if(max<b) max=b;
		if(max<c) max=c;
		if(max<d) max=d;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max4(4,2,5,3) = "+max4(4,2,5,3));
		}
}
