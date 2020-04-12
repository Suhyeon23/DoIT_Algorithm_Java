class day1_2 {
//세 값의 최솟값을 구하는 min3 메서드 작성
	static int min3(int a,int b,int c){
		int min = a;
		if(min>b) min=b;
		if(min>c) min=c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(4,2,5) = "+min3(4,2,5));
		}
}
