package week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger ast = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
		ast.log("Water sucks, Gatorade is better.");
		ast.error("H2O");
		
		space.log("Gatorade");
		space.error("H2O");
	}

}
