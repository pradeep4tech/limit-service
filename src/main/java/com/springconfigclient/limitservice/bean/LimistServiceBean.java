package com.springconfigclient.limitservice.bean;

public class LimistServiceBean {

	private int minimum;
	private int maximum;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public LimistServiceBean(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

}
