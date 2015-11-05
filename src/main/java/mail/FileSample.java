/**
 * 
 */
package mail;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author LalithaMadhavi
 *
 */
public class FileSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		File file = new File("src/main/resources/abc.txt");
		System.out.println("\n\there File Exsists: "+file.getAbsolutePath());
		if(file.exists()){
			System.out.println("\n\tFile Exsists: "+file.getAbsolutePath());
		}
		else{
			throw new FileNotFoundException();
		}

	}

}
