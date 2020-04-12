class day1_9 {
//정수 a,b를 포함한 그 사이의 모든 정수의 합 구하는 메서드 작성
	static int sumof(int a,int b) {
		int sum = 0;
		if(a>b)
			for(int i=b;i<=a;i++)
				sum+=i;
		else if(a<b)
			for(int i=a;i<=b;i++)
				sum+=i;
		else
			sum = a;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("sumof(1,3) = "+sumof(1,3));
		System.out.println("sumof(5,2) = "+sumof(5,2));
		System.out.println("sumof(4,4) = "+sumof(4,4));
		}
}
