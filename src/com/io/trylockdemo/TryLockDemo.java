package com.io.trylockdemo;

public class TryLockDemo {

	public static void main(String[] args)
	{
		Mythread t1=new Mythread("first thread");
		Mythread t2=new Mythread("second thread");

		t1.start();
		t2.start();
	}

}
