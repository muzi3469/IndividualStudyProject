package mediatorPattern;

import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague{

	private Mediator mediator;
	
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		super(caption, group, state);
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged();
	}

}
