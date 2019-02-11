package visitorPattern;

import java.util.Iterator;

public class FileFindVisitor extends Visitor{

	private String currentDir = "";
	private String findName = "";
	
	public FileFindVisitor(String findName) {
		this.findName = findName;
	}
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		if(file.getName().endsWith(findName))
			System.out.println(file.getName());
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentDir = saveDir;
	}

}
