package week05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.repeat('*', error.length() + 13);
		System.out.println(sb.toString() + "\n***Error: " + error + "***\n" + sb.toString());
	}

}
