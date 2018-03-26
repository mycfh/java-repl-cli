import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {
	Scanner lineScanner;
	Repository rep= new Repository();
	
	public Repository getRep() {
		return rep;
	}

	//Constructor
	App() {
		lineScanner = new Scanner(System.in);
	}

	void prompt(String s) {
		System.out.print(s);
		System.out.flush();
	}

	void display(String s) {
		System.out.println(s);
	}

	String input() {
		String s = lineScanner.nextLine();
		return s;
	}

	void help() {
		display("===============================");
		display("d ==> prints map");
		display("c ==> add word to map");
		display("l ==> load map from file");
		display("s ==> save map to file");
		display("? ==> prints help");
		display("===============================");
	}
	
	void process() {
		String s;
		help();
		while (true) {
			prompt("Enter>");
			s = input();
			String arr[] = s.split(" ", 2);
			String command= arr[0];
			String options= (arr.length<2)?"":arr[1];
			
			if (command.equalsIgnoreCase("Exit"))	break;
			switch (command) {
			case "d": rep.printMap(options); break;
			case "c": rep.setWord(options);	break;
			case "l": rep.load();	break;
			case "s": rep.save();	break;
			case "?": help();	break;
			default:
				display("\nUnknown: " + command);
			}
		} // while
		lineScanner.close();
	}
}
