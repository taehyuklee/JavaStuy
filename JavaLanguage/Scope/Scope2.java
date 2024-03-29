package Scope;

//전역변수, 지역변수 (다양한 유효범위들)

public class Scope2 {

	static int i; //전역변수
	/*전역변수란?
	 * ->모든 지역에서 (method범위와 상관없이) 사용할수 있는 변수를 만드는 것이다. (전체 영역에서 사용할수 있는
	 * 변수라 하여 전역변수라 한것)
	 * 
	 * 최근 버전의 프로그래밍 언어 파이썬, 자바, C++등에서 변수를 선언한다는 것은 사실상 변수의 유효범위까지
	 * 정해서 선언하는 것과 마찬가지다.
	 * 
	 * */
	
	static void a() {
		i=0;
		//int i =0; //지역변수 
		/*
		 * 지역변수란?
		 * 특정범위에서만(method, class, for와 같은) 유효한 변수, 일반적으로 특정 method안에서 선언을 함으로써 실행됨 
		 * (특정 지역에서만 사용하고 삭제된다고 해서 지역변수라 한 것) -> C++, JAVA에서는 {}로 지역을 구분.
		 * 
		 * 만약 위와같이 i=0이 아닌 int i=0;을 하면 a라는 method안에서 선언했기때문에 i는 지역변수로 선언이된다
		 *지역변수는 그 코드 실행이 범위를 벗어나는 순간 삭제가 된다. (메모리에서) 따라서 전역변수 i와는 전혀 무관한 값이 된다. */
	}
	
	public static void main(String[] arg) {
		for (i=0; i<5; i++) {
			//만약 for문에서 int i = 0이라고 시작한다면, 이 i는 for문 안에서만 유효하게 된다.
			//for문 안에서의 int i는 for문 밖으로 나가면 삭제된다.
			a();
			System.out.println(i);
		}
	}
	
}
