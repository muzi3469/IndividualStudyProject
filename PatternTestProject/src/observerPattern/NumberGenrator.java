package observerPattern;

import java.util.*;

public abstract class NumberGenrator {
	private ArrayList observers = new ArrayList<>();
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		Iterator it = observers.iterator();
		while(it.hasNext()) {
			Observer ob = (Observer)it.next();
			ob.update(this);
		}
	}
	
	public abstract int getNumber();
	public abstract void execute();
}
