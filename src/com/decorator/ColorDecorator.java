package com.decorator;

public class ColorDecorator extends RoomDecorator {

	public ColorDecorator(IRoom roomToBeDecorated) {
		super(roomToBeDecorated);
	}

	public String displayRoom() {
		System.out.println("");
		return super.displayRoom() + addColors();
	}

	private String addColors() {
		return "  Blue Color";
	}

}
