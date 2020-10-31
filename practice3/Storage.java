package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Storage {


	private List<Brick> bricks = new ArrayList<Brick>();

	public synchronized void addBrick(Brick brick) {

		while (bricks.size() >= 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bricks.add(brick);
		notifyAll();

	}

	public synchronized List<Brick> getBricks() {
		List<Brick> party = new ArrayList<>();
		while (bricks.size() < 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		party.addAll(bricks);
		notifyAll();
		bricks.clear();

		return party;
	}

}
