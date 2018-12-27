import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入分数:");
		int score=scanner.nextInt();
		if (score==5) {
			System.out.println(score+"优秀");
		}else if (score==4) {
				System.out.println(score+"良好");
			} else if (score==3) {
				System.out.println(score+"及格");
			}else if (score>=0&&score<=2) {
				System.out.println(score+"不及格");
			}else  {
				System.out.println(score+"输入的分数不是5分制");
			}
		
		
		
	}

}
