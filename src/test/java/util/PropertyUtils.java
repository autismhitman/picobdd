package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	public static Properties propLoader(String filePath) {
		
		Properties prop = new Properties();
		BufferedReader reader;
		
		try {
			
			reader = new BufferedReader(new FileReader(filePath));
			
			try {
				prop.load(reader);
				reader.close();
			 }catch(IOException e) {
				 e.printStackTrace();
				 throw new RuntimeException("Failed to load property file "+ filePath);
			 }
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
			throw new RuntimeException("File not found at specified path"+ filePath);
		}
		return prop;
		
		
		
		
	}
 
}
