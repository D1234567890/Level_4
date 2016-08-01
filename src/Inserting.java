
public class Inserting {
	public static int[] insertAt(int[] intArray, int index, int num) {
		int[] addTo = new int[intArray.length + 1];
		addTo[index] = num;
		for (int i = intArray.length; i > index; i--) {
			if (i < 6) {
				addTo[i + 1] = intArray[i];
			}
		}
		for (int i = 0; i < index; i++) {
			if (i < 6) {
				addTo[i] = intArray[i];
			}
		}
		return addTo;
	}

	public static String[] insertAlphabetically(String[] array, String word) {
		String[] addTo = new String[array.length + 1];
		boolean done = false;
		for (int i = 0; i < addTo.length; i++) {
			if (!done) {
				if (word.compareTo(array[i]) < 0) {
					addTo[i] = word;
					done = true;
				} else {
					addTo[i] = array[i];
				}
			} else {
				addTo[i + 1] = array[i];
			}
		}
		for (int i = 0; i < addTo.length; i++) {
			System.out.println(addTo[i]);
		}
		return addTo;
	}
}
