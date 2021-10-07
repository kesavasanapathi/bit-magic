class reset{
	public static void main (String[] args) {
		int a=10;
		int n=4;
		odd(a,n);
	}
	static void odd(int a,int n ){
	    if ((a&((0<<(n-1))))==0)
	    {
	        System.out.println("kesava");
	    }
	    else{
	        System.out.println("raji");
	    }
	}
}
