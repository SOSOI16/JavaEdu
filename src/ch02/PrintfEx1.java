package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;	//8진수 10, 10진수로는 8
		int hexNum = 0x10;	//16진수 10, 10진수로는 16
		int binNum = 0b10;	//2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);				//10진수로 나타냄. 값은 1
		System.out.printf("s=%d%n", s);				//10진수로 나타냄. 값은 2
		System.out.printf("c=%c, %d%n", c, (int)c);	//문자, 10진수로 나타냄. 값은 A, 65
		
		System.out.printf("finger=[%5d]%n", finger);	//출력될 값이 차지하는 공간 지정. 값은 [   10]
		System.out.printf("finger=[%-5d]%n", finger);	//출력될 값이 차지하는 공간 지정. 값은 [10   ]
		System.out.printf("finger=[%05d]%n", finger);	//출력될 값이 차지하는 공간 지정. 값은 [00010]
		
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);	//#는 접두사(16진수 0x)
		
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		// Integer.toBinaryString(int i) : 10진수를 2진수로 출력해주는 지시자는 없기 때문에 정수를 2진 문자열로 변환
	}

}
