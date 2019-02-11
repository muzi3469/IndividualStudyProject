package observerPattern;

public class GraphObserver implements Observer{

	@Override
	public void update(NumberGenrator generator) {
		// TODO Auto-generated method stub
		System.out.println("GraphObserver:");
		int count = generator.getNumber();
		for(int i=0; i<count; i++)
			System.out.print("*");
		System.out.println();
		try {
			Thread.sleep(1*100);
		} catch(InterruptedException e) {}
	}

}
