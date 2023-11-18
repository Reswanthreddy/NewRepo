package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants{

	public String readingDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(property_file_path);
		Properties ppt =  new Properties();
		ppt.load(fis);
		
		return ppt.getProperty(key) ;
	}
	
}
