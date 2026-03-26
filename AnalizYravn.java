package Main;

public class AnalizYravn {

public static int[][] getCoord(int k, int b) {
	int[][] coordinates = new int[20][2];
	for(int j = 0; j < coordinates.length; j++) {
	for(int i = -10; i <= 10; i++) {
		coordinates[j] = new int[]{((i-b)/k), i};
	}}
	return coordinates;
}
}
