package utils;

import java.time.Duration;

public class configutils {
    
    propertiesutils putils = new propertiesutils("config.properties");

	public String getbrowsertype() {
		return putils.getProperty("browser");
	}

	public Duration getdefault_timeout() {
		return Duration.ofSeconds(Long.parseLong(putils.getProperty("default_wait")));	
	}
	
	public String getenv() {
		return putils.getProperty("env");
	}
	
	public String getUrl() {
		System.out.println(this.getenv()+"."+"url");
		System.out.println(putils.getProperty(this.getenv()+"."+"url"));
		return putils.getProperty(this.getenv()+"."+"url");
	}
}
