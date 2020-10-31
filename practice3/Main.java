package practice3;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Storage storage = new Storage();
		Worker1 w1 = new Worker1(storage);
		Worker2 w2 = new Worker2(storage);
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);
		t1.start();
		t2.start();
		t1.join();
		t1.join();

	}

}
