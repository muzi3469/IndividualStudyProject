package strategyPattern;

public class Player {
	private String name;
	private Strategy startegy;
	private int wincount;
	private int losecount;
	private int gamecount;
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.startegy = strategy;
	}
	
	public Hand nextHand() {
		return startegy.nextHand();
	}
	public void win() {
		startegy.study(true);
		wincount++;
		gamecount++;
	}
	public void lose() {
		startegy.study(false);
		losecount++;
		gamecount++;
	}
	public void even() {
		gamecount++;
	}
	@Override
	public String toString() {
		return "[" + name+":"+gamecount+" games, "+wincount+" win, "+
					losecount+" lose"+"]";
	}
}
