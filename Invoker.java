package org.demo.command;

public class Invoker {

	Icommand command;

	public Invoker(Icommand command) {
		super();
		this.command = command;
	}
	
	
	public void execute() {
		command.execute();
	}
	
}
