package visitorPattern;

public interface Element {
	public abstract void accept(Visitor v);
}
