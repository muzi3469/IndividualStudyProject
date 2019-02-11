package statePattern;

public interface State {
	public void doClock(Context context, int hour);		//시간설정
	public void doUse(Context context);					//금고사용
	public void doAlarm(Context context);				//비상벨
	public void doPhone(Context context);				//일반 통화
}
