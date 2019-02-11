package observerPattern;

public class ObserverMain {
	public static void main(String[] args) {
		NumberGenrator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();
	}
}
