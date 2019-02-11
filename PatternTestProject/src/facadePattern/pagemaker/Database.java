package facadePattern.pagemaker;

import java.io.*;
import java.util.*;

public class Database {
	private Database() {}		// new에서 인스턴스를 생성시키지 않기 위한 private 선언
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch(IOException e) {
			System.out.println(filename + "not found.");
		}
		return prop;
	}
}
