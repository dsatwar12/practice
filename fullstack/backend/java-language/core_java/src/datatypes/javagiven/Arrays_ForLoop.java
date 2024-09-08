package datatypes.javagiven;

public class Arrays_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30};
		System.out.println(num);

		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		for(int i:num) {
			System.out.println("advance loop"+i);
		}

	}

}
