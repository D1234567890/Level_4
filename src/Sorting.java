
public class Sorting {
	public static String[] sort(String[] array) {
		for (int q = 0; q < 6; q++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					String temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		return array;
	}
}
