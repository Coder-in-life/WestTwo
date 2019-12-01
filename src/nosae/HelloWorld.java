package nosae;

import java.util.Scanner;

class HelloWorld {
    private int n;
    private static Object lock=new Object();
    boolean flag=true;
    public HelloWorld( int n){
        this.n = n;
    }
    public void hello() throws InterruptedException{
        for (int i = 0; i < n; i++) {
        	synchronized (lock) {
            System.out.print("Hello");
            if (flag) {
            	flag=false;
            lock.notify();
            }
            lock.wait();
        }
        }
    }

    public void world() throws InterruptedException{
        for (int i = 0; i < n; i++) {
        	synchronized (lock) {
				
        		System.out.println("World!");
        		if (!flag) {
        			flag=true;
        			lock.notify();
        		}
        		lock.wait();
			}
        }
    }

}


