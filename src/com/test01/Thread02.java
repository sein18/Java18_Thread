package com.test01;

class MyThread02 extends Thread {
	
	public MyThread02(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " = " + i);	
		}
		System.out.println(this.getName() + " 끝!! "); 
	}
}

public class Thread02 {

	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("야옹");
		MyThread02 m2 = new MyThread02("멍멍");
		
		//thread scheduling
		//우선순위(priority), 순환할당(round_robin)
		//순환할당은 JVM에 의해 결정, 개발자 임의로 수정 불가
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);
		//숫자가 낮을 수록 우선순위가 높다.(먼저 끝난다.)
		
		
		m1.start();
		m2.start();
	}

}
