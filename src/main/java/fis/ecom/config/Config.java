package fis.ecom.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public Properties getPropertyInstance() {
		Properties properties = null;
		try (FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\source\\GlobalData.properties")) {
			properties = new Properties();
			properties.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return properties;
	}
}
