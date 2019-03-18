package com.test.sici;

import java.awt.List;

public class SimpleCompound {
	public int SimpleInterestCalculator(int principle, int rate,int time) {
		int SimpleInterest = (principle*rate*time)/100;
		return SimpleInterest;
	}
	public int CompoundInterestCalculator(int principle, double d,int time,int interestCompounted) {
		int CompoundInterest = (int)(principle*Math.pow((1+d/interestCompounted),interestCompounted*time));
		return CompoundInterest;
	}
}
