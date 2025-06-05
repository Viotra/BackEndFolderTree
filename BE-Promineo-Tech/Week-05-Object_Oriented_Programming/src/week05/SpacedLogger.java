package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		char[] parts = log.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			if (i - 1 == log.length()) {
				sb.append(parts[i]);
			}
			else {
				sb.append(parts[i] + " ");
			}
		}
		System.out.println(sb.toString());
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		char[] parts = error.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			if (i - 1 == error.length()) {
				sb.append(parts[i]);
			}
			else {
				sb.append(parts[i] + " ");
			}
		}
		System.out.println("ERROR: " + sb.toString());
	}

}
