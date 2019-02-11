package chainOfResponsibilityPattern;

import java.util.Random;

public class ChainOfResponsibilityMain {
	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		Random random = new Random();
		
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(fred).setNext(elmo);
		
		for(int i=0; i<20; i++) {
			alice.support(new Trouble(random.nextInt(500)+1));
		}
	}
}
