package com.cognizant;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCars.getPrice());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	private double convertUSDtoEuro(double price) {
		return price * 0.91;
	}

}
