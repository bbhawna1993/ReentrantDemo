package com.io.trylockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class Mythread extends Thread{
	static ReentrantLock l=new ReentrantLock();

	Mythread(String name)
	{super(name);}

	public void run()
	{
		if(l.tryLock())
		{System.out.println(Thread.currentThread().getName()+"\n"+"Performing safe operationss...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		l.unlock();
		}
		else
		{System.out.println("can't get the lock"+"\n"+Thread.currentThread().getName());}

	}
}
