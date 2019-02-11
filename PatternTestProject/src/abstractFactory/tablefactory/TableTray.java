package abstractFactory.tablefactory;

import java.util.Iterator;

import abstractFactory.factory.*;

public class TableTray extends Tray{

	public TableTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<td>");
		buffer.append("<table width=\"100%\" border=\"1\"><tr>");
		buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + 
						tray.size() + "\"> <b>" + caption + "</b></td>");
		buffer.append("</tr>\n");
		buffer.append("<tr>\n");
		
		Iterator<Item> it = tray.iterator();
		while(it.hasNext())
			buffer.append(it.next().makeHTML());
		buffer.append("</tr></table>");
		buffer.append("</td>");
		return buffer.toString();
	}

}
