package abstractFactory.tablefactory;

import java.util.Iterator;

import abstractFactory.factory.*;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator<Item> it = content.iterator();
		while(it.hasNext())
			buffer.append("<tr>" + it.next().makeHTML() + "</tr>");
		buffer.append("</table>\n");
		buffer.append("<hr><address>"+author+"</address>");
		buffer.append("</body></html>\n");
		
		return buffer.toString();
	}

}