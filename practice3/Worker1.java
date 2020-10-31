package practice3;

public class Worker1 implements Runnable {

	Storage storage;

	Worker1(Storage st) {
		 storage = st;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {
			storage.addBrick(new Brick());
			System.out.println("Add one brick " + i);
		}
	}

}
