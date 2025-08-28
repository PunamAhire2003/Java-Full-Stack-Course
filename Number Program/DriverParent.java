class Parent{
	public static void m1(){
		System.out.println("hello from static");
	}

		public void m1(){
			System.out.println("hello from non static");
			}
		}
	class Child extends Parent{
		public static void m2(){
			System.out.println("hello from static1");
		}
			public void m2(){
				System.out.println("hello from non static2");
			
		}
	}
		class DriverParent{
			public static void main(String[] args) {
				Parent obj=new child();
				obj.m1();
				obj.m2();
				Child obj1=(Child)obj;
				obj.m1();
				obj.m2();
							
		}
	}



