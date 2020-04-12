class day1_17 {
//n단의 피라미드 메서드 (i행에는 (i-1)*2+1개의 * , 마지막 n행에는 (n-1)*2+1개의 *
//*대신 단별 숫자
static void spira(int n) {

	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=(i-1)*2+1;k++){
			System.out.print(i);
			}
			System.out.println(" ");
	}
}
	public static void main(String[] args) {
		spira(4);
	}
}
