
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(2, 8)-1);
		
		double sqrt20=Math.sqrt(20);
		double sqrt10=Math.sqrt(10);
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		result=Math.round(result*10)/10.0;
		System.out.println(result);
		
		String name="张飞";
		char sex ='男';
		short age =35;
		float height = 1.99f;
		String type="豪放的";
		System.out.println("嗨，大家好，俺叫"+name+",今年"+age+"岁，俺是一个"+type+sex+"士");
		
		name="王菲";
		sex='女';
		age=33;
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}