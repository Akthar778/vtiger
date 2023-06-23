package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyUtility implements IAutoconstant{
		
		/**
		 * This method is used to fetch the value from property file and it is returning the 
		 * @param key
		 * @return
		 * @throws IOException
		 */

		public String readingDataFromPropertiesFile(String key) throws IOException {
			FileInputStream fis =new FileInputStream(PROPERTIEFILE);
			Properties ppt =new Properties();
			ppt.load(fis);
			return ppt.getProperty(key);
			
		}
	}


