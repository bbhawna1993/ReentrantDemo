package com.io.reentrantdemo;

import java.util.concurrent.locks.ReentrantLock;

class Display {

	ReentrantLock l=new ReentrantLock();

	public void wish(String name) {
		l.lock();
		for(int i=0;i<10;i++)
		{
			System.out.println("Good morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);

		}
		l.unlock();
	}
}
