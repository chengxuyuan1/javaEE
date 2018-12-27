
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//包装类
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("108")+10);
		
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("50000")+5);
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.toHexString(16));
		
		long longValue=3000000000l;
		byte b1=5;
		byte b2=(byte) (b1+2);
		
		double d=2.6;
		double result=d-2;
		System.out.println(result);
		
		//unicode
		System.out.println((char)0+":"+0);
		System.out.println((char)1+":"+1);
		System.out.println((char)2+"："+2);
		System.out.println((char)65+"："+65);
		for (int i = 0; i <= 127; i++) {
			System.out.println((char)i+"："+i);
		}
	}

}
