package cfh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {

	
	public int count(String file, String word) {
		int counter=0;
		
		try(FileReader f= new FileReader(CountWords.class.getResource(file).getPath());
			Scanner lineScanner= new Scanner(f);)
		{
			while(lineScanner.hasNext()) {
				Scanner fieldScanner= new Scanner(lineScanner.nextLine());
				while(fieldScanner.hasNext()) {
					String w= fieldScanner.next();
					if(w.equalsIgnoreCase(word)) {
						counter++;
					}
				}
				fieldScanner.close();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	};
	
	
	public static void main(String[] args) {
		CountWords cw= new CountWords();
		int count= cw.count("puttydoc.txt", "bytes");
		System.out.format("count= %3d", count);
	}

}
