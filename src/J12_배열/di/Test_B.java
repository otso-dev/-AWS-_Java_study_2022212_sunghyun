package J12_배열.di;

public class Test_B {
	
	private Test_C tc;
	
	public Test_B(Test_C tc) {
		this.tc = tc;
	}
	
	public void testB1() {
		System.out.println("\tTest_B1 메소드 호출!");

		tc.testC1();
	}

}
