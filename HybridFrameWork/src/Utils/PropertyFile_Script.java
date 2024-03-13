package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Script {
	
	public static String fetchProperty() throws FileNotFoundException, IOException {
		Properties p= new Properties();
		 p.load(new FileInputStream("./ProperFile.properties"));
		 String file = p.getProperty("BaseURL");
		return file;
	}
}
