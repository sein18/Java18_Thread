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
		System.out.println(this.getName() + " ��!! "); 
	}
}

public class Thread02 {

	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("�߿�");
		MyThread02 m2 = new MyThread02("�۸�");
		
		//thread scheduling
		//�켱����(priority), ��ȯ�Ҵ�(round_robin)
		//��ȯ�Ҵ��� JVM�� ���� ����, ������ ���Ƿ� ���� �Ұ�
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);
		//���ڰ� ���� ���� �켱������ ����.(���� ������.)
		
		
		m1.start();
		m2.start();
	}

}
