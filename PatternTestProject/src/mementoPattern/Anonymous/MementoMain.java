package mementoPattern.Anonymous;

import mementoPattern.game.Gamer;
import mementoPattern.game.Memento;

public class MementoMain {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);				//소지금 100
		Memento memento = gamer.createMemento();	//최초 상태 저장.
		
		for(int i=0; i<100; i++) {
			System.out.println("====" + i);
			System.out.println("status : " + gamer);
			
			gamer.bet();
			
			System.out.println("MONEY : "+ gamer.getMoney());
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("increase Money, so save this status");
				memento = gamer.createMemento();
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("a lot decrease Money, so restore status");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
			}
			
			System.out.println();
		}
	}
}
