class Number{
	public static void main(String[] args) throws InterruptedException{
		int n =10;
		for(int row = 1 ; row<=n; row++)
		{
			for(int col=row; col<=row-1; col++)
			{
				System.out.print("  ");
			}
			for(int i=1; i<=n; i++)
			{ Thread.sleep(200);
				System.out.print("  ");
			}
			System.out.println();
		}		
				
	}
}