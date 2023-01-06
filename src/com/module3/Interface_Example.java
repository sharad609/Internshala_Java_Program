package com.module3;

public class Interface_Example {
	public static void main(String[] args) {
		//new Remote();  we cannot create object of Interface Remote.
		Remote remote = new Television();
		remote.volumeUp();
		remote.volumeDown();
		remote.powerOn();
		remote.powerOff();
	}
}
interface Remote{
	void volumeUp();
	void volumeDown();
	void powerOff();
	void powerOn();
}
class Television implements Remote{

	@Override
	public void volumeUp() {
		System.out.println("Volume Up!");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down!");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off!");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On!");
	}
}
