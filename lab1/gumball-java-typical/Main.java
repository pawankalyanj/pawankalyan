public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);


		System.out.println("\n\nTesting Gumball Machine Type 2");
		GumballMachineT2 gbmachinetype2 = new GumballMachineT2(3);

		System.out.println("\nCase 1 where only 25 cents are inserted");
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.turnCrank();

		System.out.println("\nCase 2 where remaining 25 cents are inserted");
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.turnCrank();

		System.out.println("\nCase 3 where remaining coins other than quarter are inserted");
		gbmachinetype2.insertCoin( 5 );
		gbmachinetype2.turnCrank();
		gbmachinetype2.insertCoin( 50 );
		gbmachinetype2.turnCrank();

		System.out.println("\nCase 4 where total amount is more than 50.");
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.turnCrank();

		System.out.println("\ncase 5 where all the Gumballs are used.");
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.turnCrank();
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.insertCoin( 25 );
		gbmachinetype2.turnCrank();


		System.out.println("\n\nTesting Gumball Machine 3");
		GumballMachineT3 gbmachinetype3 = new GumballMachineT3(2);

		System.out.println("\n\nCase 1 where only 25 cents are inserted");
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.turnCrank();

		System.out.println("\nCase 2 where remaining 25 cents are inserted");
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.turnCrank();

		System.out.println("\nCase 3 where 3x nickle 1x dime and 1x Quarter inserted");
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.insertCoin( 10 );
		gbmachinetype3.insertCoin( 25 );

		System.out.println("\nCase 4 where total amount is more than 50.");
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.insertCoin( 10 );
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.turnCrank();

		System.out.println("\nCase 5 where partial amount is paid");
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.insertCoin( 10 );
		gbmachinetype3.insertCoin( 5 );
		gbmachinetype3.turnCrank();

		System.out.println("\nCase 6 where all the Gumballs are used.");
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.insertCoin( 25 );
		gbmachinetype3.turnCrank();


	}
}