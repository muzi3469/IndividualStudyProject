package proxyPattern;

public class Printer implements Printable {

	private String name;
	public Printer() {
		heavyJob("Printer의 인스턴스를 생성중");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer의 인스턴스 생성중 --> "+name);
	}
	
	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(string);
	}

	private void heavyJob(String msg) {
		System.out.print(msg);
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.print(".");
		}
		System.out.println("complete.");
	}
}
