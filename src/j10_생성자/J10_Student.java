package j10_생성자;

public class J10_Student {
	
	
	//상수는 무조건 한번은 초기화가 되어야 한다.(final)
	//required argument constructor는 필수 인수값을 가진 것만 모아놓은 생성자이다.
	//필수 생성자는 기본생성자를 만들 수 가 없다.
	//기본 생성자는 기본적으로 생성자가 생략 되있음
	//하지만 생성자의 오버로딩이 되면 기본 생성자가 비활성화가 됨 생략이 의미없어짐
	//생성자 오버로딩시 기본 생성자도 명시해야함
	
	
	//접근지정자 : 멤버변수나 메소드에 아무것도 입력 안하면 default 상태
	//public : 접근제한 없음
	//protected : 동일 패키지와 상속받은 클래스 내부
	//default : 동일 패키지 내에서만
	//private : 클래스 내부만
	
	//참조변수,멤버변수,레퍼런스 변수
	 public String name;
	 public int age;
	 private final int a;
	
//	J10_Student(){ //NO argument constructor
//		System.out.println("기본 생성자 호출");
//	}
	
	J10_Student(int a) {//required argument constructor
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	J10_Student(int age, int a) {
		this.age = age;
		this.a = a;
		System.out.println("학생의 나이 : " + age);
	}
	
	J10_Student(String name, int a){
		this.name = name;
		this.a = a;
		System.out.println("학생의 이름 : " + name);
	}
	J10_Student(String name, int age, int a) {//all argument constructor
		
		//클래스내의 멤버변수의 지역변수들은 이름이 같아도 구분을 해줌
		//하지만 이름이 같아지기 때문에 this를 이용해준다.
		//this 자기자신의 주소를 가지고 있음.
		this.name = name;
		this.age = age;
		this.a = a;
	}
	void printInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
	}
}
