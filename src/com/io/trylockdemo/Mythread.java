package com.io.trylockdemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Mythread extends Thread{
	static ReentrantLock l=new ReentrantLock();

	Mythread(String name)
	{super(name);}

	public void run()
	{
		try {
			if(l.tryLock(3000,TimeUnit.MILLISECONDS))
			{System.out.println(Thread.currentThread().getName()+"\n"+"Performing safe operationss...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			l.unlock();
			}
			else
			{System.out.println("can't get the lock"+"\n"+Thread.currentThread().getName());}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
