import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;
public class file {
	static String [][] m = new String[5][3];
	static Scanner scn; 
	public static void main(String args[]){
		openFile();
		readFile();
		outFile();
	}
	private static void outFile() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();
		}
	}
	private static void readFile() {
		while (scn.hasNext()) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = scn.next();
				}
			}
			
		}
		
	}
	private static void openFile() {
		try {
			scn = new Scanner(new File("FileFolder//1.txt"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Файл не найден");
		}
		
	}
}
