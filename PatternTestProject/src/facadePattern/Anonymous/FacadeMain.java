package facadePattern.Anonymous;

import facadePattern.pagemaker.PageMaker;

public class FacadeMain {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("kim@youngjin.com", "welcomeKim.html");
	}
}
