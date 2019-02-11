package builderPattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		if(type.equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		} else if(type.equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getResult();
			System.out.println(filename);
		} else {
			System.exit(0);
		}
	}
}
