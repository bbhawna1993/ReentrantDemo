package com.io.trylockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class Mythread extends Thread{
	static ReentrantLock l=new ReentrantLock();

	Mythread(String name)
	{super(name);}

	public void run()
	{
		if(l.tryLock())
		{System.out.println(Thread.currentThread().getName()+"\n"+"Performing safe operationss...");}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		l.unlock();

	}
}
