package abstractFactory.listfactory;

import java.util.Iterator;

import abstractFactory.factory.*;

public class ListPage extends Page{

	public ListPage(String title, String author) {
		super(title,author);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>"+title+"</h1>\n");
		buffer.append("<ul>\n");
		Iterator<Item> it = content.iterator();
		while(it.hasNext()) {
			buffer.append(it.next().makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}

}
