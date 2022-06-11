package org.demo.command;

public class Demo {

	public static void main(String[] args) {
		Light light=new Light();
		Invoker invoker=new Invoker(new TurnOnLight(light));
		invoker.execute();
	}
}
