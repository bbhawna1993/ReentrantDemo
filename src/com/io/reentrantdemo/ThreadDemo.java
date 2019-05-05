package com.io.reentrantdemo;

public class ThreadDemo {

	public static void main(String[] args) {
		Display d=new Display();

		Mythread t1=new Mythread(d,"Dhoni");
		Mythread t2=new Mythread(d,"yuvraj");

		t1.start();
		t2.start();
	}

}
