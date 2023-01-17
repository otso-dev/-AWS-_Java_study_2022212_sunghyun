package j21_예외;


//사용자 정의 예외처리를 할 때는 RuntimeException을 상속받는다.
public class CustomErrorException extends RuntimeException{
	
	public CustomErrorException() {
		System.out.println("내가 만든 예외 생성");
	}
	public CustomErrorException(String message) {
		super(message);//RuntimeException안에는 생성자 오버로딩이 많음
	}

}
