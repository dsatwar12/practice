package datatypes.yourOwn;

public class MainPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottle bo=new Bottle();
		String word="kk";
		System.out.println(bo.cap);
		bo.withcap();
	}

}




class Bottle{
	String cap="yes";
	void withcap() {
		System.out.println("he cap for bottle");
	}
}