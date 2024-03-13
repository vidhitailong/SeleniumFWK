package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_Files {
	@Test
	public void fetchdata() throws FileNotFoundException, IOException {
		Properties p= new Properties();
		p.load(new FileInputStream("./PropertyFile.properties"));
		String val= p.getProperty("BaseURL");
		System.out.println(val);
	}

}
