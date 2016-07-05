package ch02;

public class SpecialCharEx {

	public static void main(String[] args) {
		System.out.println('\'');				//'''처럼 할 수 없다
		System.out.println("abc\t123\b456");	//backspace \b에 의해 3이 지워진다(안지워짐..)
		System.out.println("\"Hello\"");		//큰따옴표 출력
		System.out.println("c:\\");				//역슬래쉬 \ 출력
	}

}