package com.bptn.course._20_multiThreading;

public class MultithreadingDemo {
	  // TODO Auto-generated method stub
	  MyThread t1 = new MyThread();
	  Thread t2 = new Thread(new MyRunnable());


	  t1.start();
	  t2.start();


	 }

}
}
}