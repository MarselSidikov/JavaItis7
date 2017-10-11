class Program {
	public static void main(String args[]) {
		int array[] = {1, 6, 3, -1, 2, 4, 7, 8};

		for (int i = 0; i < 4; i++) {
			int temp = array[i];
			array[i] = array[8 - 1 - i];
			array[8 - 1 - i] = temp; 
		}

		// при i = 0
		// int temp = array[0]; // temp = 1
		// array[0] = array[7]; // array[0] = 8
		// array[7] = temp; // array[7] = 1

		// при i = 1
		// int temp = array[1]; // temp = 6
		// array[1] = array[6]; // array[1] = 7
		// array[6] = temp; // array[6] = 6

		// и т.д.

		for (int i = 0; i < 8; i++) {
			System.out.print(array[i] + " ");
		}
	}
}