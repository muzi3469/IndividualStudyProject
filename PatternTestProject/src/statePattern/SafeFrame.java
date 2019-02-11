package statePattern;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context{

	private TextField textClock = new TextField(60);		//현재 시간 표시
	private TextArea textScreen = new TextArea(10, 60);
	private Button buttonUse = new Button("금고사용");
	private Button buttonAlarm = new Button("비상벨");
	private Button  buttonPhone = new Button("일반통화");
	private Button buttonExit = new Button("종료");
	
	private State state = DayState.getInstance();

	public SafeFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		
		add(panel, BorderLayout.SOUTH);
		
		pack();
		show();
		
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}
	
	@Override
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		String clockString = "현재 시간은";
		if(hour<10)
			clockString += "0" + hour + ":00";
		else
			clockString += hour + ":00";
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		// TODO Auto-generated method stub
		System.out.println(this.state +"에서" +state+"로 상태가 변화했습니다.");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		// TODO Auto-generated method stub
		textScreen.append("record ... "+msg+"\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.err.println(e.toString());
		if(e.getSource() == buttonUse)
			state.doUse(this);
		else if(e.getSource() == buttonAlarm)
			state.doAlarm(this);
		else if(e.getSource() == buttonPhone)
			state.doPhone(this);
		else if(e.getSource() == buttonExit)
			System.exit(0);
		else
			System.out.println("?");
	}
	
}
