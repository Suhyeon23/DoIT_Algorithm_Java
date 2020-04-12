class day1_7 {
//for문으로 n=7이면, "1+2+3+4+5+6+7=28" 출력하는 프로그램 
	
	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		for(int i=1;i<=n;i++)
			{
				sum += i;
				if(i==7)
					System.out.print(i+"="+sum);
				else
					System.out.print(i+"+");	
			}
		}
}
