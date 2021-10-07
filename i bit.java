class ithbit {
	public static void main (String[] args) {
		int a= 12;
		int n=2;
		odd(a,n);
		
		
	}
	static void odd(int a,int n){
	    if((a&(1<<(n-1)))>0)
	    {
	        System.out.println("set");
	    }
	    else
	    {
	        System.out.println("mnot");
	    }
	    
	}
}
