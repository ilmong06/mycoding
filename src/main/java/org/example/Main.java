package org.example;
// 문제 : 아래가 실행되도록 해주세요.

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();

		변호사 a변호사 = a사람;
		a변호사.변호하다();
		// 출력 : 사람이 변호 합니다.

		변호사 a변호사2 = new 오랑우탄();
		a변호사2.변호하다();
		// 출력 : 오랑우탄이 변호 합니다.

		의사 a의사 = new 오랑우탄();
		a의사.진찰하다();
		// 출력 : 오랑우탄이 진찰 합니다.

		의사 a의사2 = new 사람();
		a의사2.진찰하다();
		// 출력 : 사람이 진찰 합니다.
	}
}



class 사람 implements 변호사,의사{
	void 변호하다(){

	}
}

interface 변호사{
	void 변호하다();

}

class 오랑우탄 implements 변호사,의사{

}

interface 의사{
	void 진찰하다();

}


