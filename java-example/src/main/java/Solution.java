import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	// Complete the super_reduced_string function below.
	static String super_reduced_string(String s) {


		String oldStr = s;
		do {
			oldStr =s;
			char[] chars = s.toCharArray();
			for(int i=0; i<chars.length-1; i++) {
				if(chars[i]==chars[i+1]) {
					s = s.substring(0, i) + s.substring(i+2, s.length());
					break;
				}
			}
		} while (oldStr!=s);
		return (s.isEmpty()) ? "Empty String" : s;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = super_reduced_string(s);

//		bufferedWriter.write(result);
//		bufferedWriter.newLine();

//		bufferedWriter.close();

		scanner.close();
	}
}
