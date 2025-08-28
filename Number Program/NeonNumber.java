class NeonNumber{
	public static void main(String[] args) {
		int num=9;  //(num)
		
		int sum=0;
		int squ=num*num;  //81

		while(squ>0){ //
			sum+=squ%10;   //81%10=1,  8//1+8=9(sum)
			squ/=10;  //81/10=8
		}
		if(sum==num){  //9==9
			System.out.println("neon number");
			}
			else{
				System.out.println("not neon number");
			}
		}

		}
	
