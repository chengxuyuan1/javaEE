
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-2;
		long l=i;
		System.out.println(i+":"+Integer.toBinaryString(i));
		System.out.println(l+":"+Long.toBinaryString(l));
		
		int j=0x1000001;
		float f=j;
		System.out.println(j+":"+Integer.toBinaryString(j));
		System.out.println(f+":"+Integer.toBinaryString((int)f));
		
		long k=0x20000000000001l;
		double d=k;
		System.out.println(Long.toBinaryString(k)+":"+k);
		System.out.println(Long.toBinaryString((long) d)+":"+d);
	}

}
