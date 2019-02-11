package statePattern;

public class DayState implements State{

	private static DayState singleton = new DayState();
	private DayState() {
	}
	
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour<9 || 17 <= hour) 
			context.changeState(NightState.getInstance());
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recordLog("금고사용 (주간)");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("비상벨 (주간)");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("일반통화 (주간)");
	}
	
	@Override
	public String toString() {
		return "[주간]";
	}
}
