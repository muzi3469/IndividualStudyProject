package mementoPattern.game;

import java.util.*;

public class Gamer {
	private int money;
	private List fruits = new ArrayList<>();
	private Random random = new Random();
	private static String[] fruitsName = {
			"사과", "포도", "바나나", "귤"
	};
	public Gamer(int money) {
		this.money = money;
	}
	public int getMoney() { return money; }
	
	public void bet() {
		int dice = random.nextInt(6)+1;
		if(dice == 1) {
			money += 100;
			System.out.println("money Plus");
		} else if(dice == 2) {
			money /= 2;
			System.out.println("money divide by 2");
		} else if(dice == 6) {
			String f = getFruit();
			System.out.println(f + " get! ");
			fruits.add(f);
		} else {
			System.out.println("nothing change!!~!~!~!~!~!");
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String f = (String)it.next();
			if(f.contains("맛있는 "))
				m.addFruit(f);
		}
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	@Override
	public String toString() {
		return "[money = " + money + ", fruits = " + fruits + "]";
	}
	
	private String getFruit() {
		String prefix = "";
		if(random.nextBoolean())
			prefix = "맛있는 ";
		
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
}
