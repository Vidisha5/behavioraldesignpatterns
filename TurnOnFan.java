package org.demo.command;

public class TurnOnFan implements Icommand {
	
	private Fan fan;
	
	
	

	public TurnOnFan(Fan fan) {
		super();
		this.fan = fan;
	}




	@Override
	public void execute() {
		fan.turnFanOn();

	}

}
