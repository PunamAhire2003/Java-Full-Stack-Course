import java.util.Scanner;
class Percentage_Mathod{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		float obtainedMarks=sc.nextInt();
		int totalMarks=600;
		if(obtainedMarks<0||obtainedMarks>600){
			System.out.println("invalid marks entered");
			return;
		}

		float percentage=calculatePercentage(totalMarks,obtainedMarks);
		System.out.println("percentage is"+ percentage+"%");
		}
	}
	public static float calculatePercentage
	(int totalMarks,float obtainedMarks)
	{
		return (obtainedMarks/totalMarks)*100;

	}
