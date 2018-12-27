import java.util.Scanner;
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制分数:");
		int score =scanner.nextInt();
		boolean isFiveScore=score>=0&&score<=5;
		System.out.println(score+"是5分制分数:"+isFiveScore);
		if (score>=60) {
			System.out.println(score+"及格");
		}else {
			System.out.println(score+"不及格");
		}
	}

}
