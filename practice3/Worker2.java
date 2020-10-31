package practice3;

public class Worker2 implements Runnable {

	Storage storage;
	
	Worker2(Storage st) {
		storage=st;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			storage.getBricks();
			System.out.println("Take 10 bricks");
		}
		
	}

}
