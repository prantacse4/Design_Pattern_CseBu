package Strategy_Pattern_02;

import java.util.Arrays;
import java.util.Scanner;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context bubble = new Context(new BubbleSort());
		Context quick =  new Context(new Quicksort());


		int number[]= {10,15,30,35,40};
		bubble.executeAlogrithm(number);
		
		quick.executeAlogrithm(number);


	}

}
