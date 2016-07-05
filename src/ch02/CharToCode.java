package ch02;

public class CharToCode {
	public static void main(String[] args){
		char ch = 'A';		//char ch = 65 = 0x41;
		int code = (int)ch;	//ch에 저장된 값을 int타입으로 변환하여 저장
		
		System.out.printf("%c=%d(%#x)%n", ch, code, code);	//문자, 유니코드, 16진수
		
		char hch = '가';	//char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}
}
