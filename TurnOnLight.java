package org.demo.command;

public class TurnOnLight implements Icommand {
	
	private Light light;
	
	

	public TurnOnLight(Light light) {
		super();
		this.light = light;
	}



	@Override
	public void execute() {
		light.turnLightOn();

	}

}
