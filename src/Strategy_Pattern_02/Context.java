package Strategy_Pattern_02;

public class Context {
	private Strategy strategy;

	
	
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}



	public void executeAlogrithm(int number[]) {
		strategy.SortAlgorithm(number);
	}

}
