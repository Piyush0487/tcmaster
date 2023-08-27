package utils;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

public class propertiesutils {
	Properties p = null;

	public propertiesutils(String filePath) {
		try {
			FileReader reader = new FileReader(filePath);
			p = new Properties();
			p.load(reader);
		} catch (Exception e) {
			System.out.println("NO SUCH FILE FOUND WHILE FINDING PROPERTIES---->"+filePath);
		}

	}

	public propertiesutils(String string, Duration defaultTimeout) {
	}

	public String getproperty(String key) {
		System.out.println(this.p.getProperty(key));
		return this.p.getProperty(key);
	}

}
