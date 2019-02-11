package visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{

	private String name;
	private ArrayList dir = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Entry add(Entry entry){
		dir.add(entry);
		return this;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator it = dir.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}
	
	public Iterator iterator() {
		return dir.iterator();
	}
}
