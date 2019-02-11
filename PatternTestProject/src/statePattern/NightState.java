package statePattern;

public class NightState implements State{

	private static NightState singleton = new NightState();
	private NightState() {
	}
	
	public static State getInstance() {
		return singleton;
	}
	
	
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour>=9 || 17 > hour) 
			context.changeState(DayState.getInstance());
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("비상 : 야간금고 사용!");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("비상벨 (야간)");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("야간통화 녹음");
	}

}
