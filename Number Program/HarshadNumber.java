class HarshadNumber{
	public static void main(String[] args) {
		int num=18;
		int sum=0;
		

		int temp=num;

		while(temp>0){  ////81=1+8=9 it is divisor of 81 is known as harshad number
			
			sum+=(temp%10);//18%10=8,1  8+1
			temp/=10;//1
		}
		if(num%sum==0){   //(18%9==o)
			System.out.println(num + " Harshad number");
		}
		else{
			System.out.println(num + " not a harshad number");
		}


		}

	}

//how we decide to take temp ver or not?????