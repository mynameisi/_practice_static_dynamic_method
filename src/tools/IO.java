package tools;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class IO {
	static final class Input {
		private Input() {
		}
		public static String getOneStringFromFile(String file) throws FileNotFoundException {
			Scanner sc = new Scanner(new File(file));
			String str = sc.next();
			sc.close();
			return str;
		}
		public static String getOneStringFromFile(File file) {
			Scanner sc = null;
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String str = sc.next();
			sc.close();
			return str;
		}
	}
	static final class Output {
		private Output() {
		}
		public static boolean WriteOneStringToFile(File file, String S) {
			OutputStreamWriter ot = null;
			try {
				ot = new OutputStreamWriter(new FileOutputStream(file));
				ot.write(S + " ");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					ot.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return false;
		}
	}
}
