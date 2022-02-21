public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state = soldOutState;
	int count = 0;
	// Machine Code is for the type of machine, Goes from 0 to 2 based on the problem statement
	int machineCode = 0;
	int totalAmount = 0;

	public GumballMachine(int numberGumballs, int machineCode) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}

		this.machineCode = machineCode;
	}

	public void insertQuarter(int amount) {
		if (machineCode == 0) {
			if (amount == 25) {
				state.insertQuarter(amount);
			} else {
				System.out.println("Sorry, this Quarter cannot be accepted.");
			}
		} else if (machineCode == 1) {
			if (amount == 25) {
				totalAmount = totalAmount + 25;
				if (totalAmount >= 50) {
					state.insertQuarter(amount);
				} else {
					System.out.println("Need one more quarter.");
				}
			} else {
				System.out.println("Sorry, this Quarter cannot be accepted.");
			}
		} else {
			if (amount == 5 || amount == 10 || amount == 25) {
				totalAmount = totalAmount + amount;
				if (totalAmount >= 50) {
					state.insertQuarter(amount);
				} else {
					System.out.println("Insufficient amount");
				}
			} else {
				System.out.println("Sorry, this Quarter cannot be accepted.");
			}
		}
	}

	public void ejectQuarter() {
		state.ejectQuarter();
		totalAmount = 0;
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
		totalAmount = 0;
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}