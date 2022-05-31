package day10;

public class MainClass04 {

	public static void main(String[] args) {
		TestClass04 t4 = new TestClass04();
		
		t4.SumFunc(10, 20);
		t4.SumFunc(10, 2.0);
		t4.sumFunc(1234);
		
		
		
		for(int i =0; i<5; i++) {
			int ran =(int) (Math.random()*3)+10;
			System.out.println(ran);
		}
	}

}
