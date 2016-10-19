package com.github.stokito.unitTestExample.calculator;

public class Calculator {


        public int dummy(int a,int b)
        {
            if(a == 10 && b == 11 && a < b)
		return -1;
            return 0;
        }

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
