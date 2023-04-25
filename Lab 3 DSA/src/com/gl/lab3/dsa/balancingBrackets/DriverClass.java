package com.gl.lab3.dsa.balancingBrackets;

public class DriverClass {
	
	public static void main(String[] args) {
		String Exp = "(()]";
		BalancingBrackets obj = new BalancingBrackets();
		if(obj.checkBalance(Exp)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}

}
