import java.util.*;

class TEST {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line = null;
		while (in.hasNextLine()) {
			line = in.nextLine();
			if ("42".equals(line)) {
				break;
			} else {
				System.out.println(line);
			}
		}
	}	
}