package me.everton.logica;
import java.util.Arrays;

public class ArrayMultidimensional {
	public static void main(String[] args) {
		String[][] duas = {
				{"Everton", "M", "Florianópolis"},
				{"Everton", "M", "Criciúma"},
				{"Luiza", "F", "Orleans"}
		};
		System.out.println(Arrays.toString(duas[1]));
	}
}
