package observerPattern;

public class DigitObserver implements Observer{

	@Override
	public void update(NumberGenrator generator) {
		// TODO Auto-generated method stub
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(1*100);
		} catch(InterruptedException e) {}
	}

}
