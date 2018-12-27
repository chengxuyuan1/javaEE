
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//转义符
		System.out.print('\u4e2d'+":");
		System.out.println(4*Math.pow(16, 3)+14*Math.pow(16, 2)+2*16+13);
		System.out.println((char)20013+":"+20013);
		System.out.println("我和\n你不在一行哟");
		System.out.println("\t我在这里显示哟");
		System.out.println("System.out.println(\"双引号也显示出来\");");
		
		//布尔类型
		boolean isPass;
		isPass=true;
		System.out.println("考试通过："+isPass);
		isPass=false;
		System.out.println("考试通过："+isPass);	
		isPass=65>=60;
		System.out.println(65+"分："+isPass);
	}

}
