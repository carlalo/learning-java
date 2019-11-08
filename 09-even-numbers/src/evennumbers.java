public class evennumbers {

	public static void main(String[] args) {
		System.out.println("Folgende Zahlen sind durch zwei teilbar:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
//			if ((i / 2) * 2 == i) {
				System.out.println(i);
			}
		}
		System.out.println("Davon durch 4 teilbar:");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
//			if ((i / 4) * 4== i) {
				System.out.println(i);
			}
		}

	}

}
