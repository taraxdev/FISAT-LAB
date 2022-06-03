```ThreadDemo.java

class ThreadDemo{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println("My thread program!!!" + t);
		t.setName("MyThread");
		System.out.println("My thread program!!!" + t);
	}
}

```
