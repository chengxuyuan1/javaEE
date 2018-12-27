package 泛型;
interface GenInter<T>{
	public void say();
}
class Gin implements GenInter<String>{
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	public Gin(String info) {
		// TODO Auto-generated constructor stub
		this.info=info;
	}
}
public class genericDemo05 {
	public static void main(String[] args) {
		Gin gin=new Gin("jike");
		System.out.println(gin.getInfo());
	}
}
