package utils;

import java.time.Duration;

public class configutils {
    
    propertiesutils putils = new propertiesutils("config.properties");

	public String getbrowsertype() {
		return putils.getproperty("browser");
	}

	public Duration getdefault_timeout() {
		return Duration.ofSeconds(Long.parseLong(putils.getproperty("default_wait")));	
	}
	
	public String getenv() {
		return putils.getproperty("env");
	}
	
	public String getUrl() {
		System.out.println(this.getenv()+"."+"url");
		System.out.println(putils.getproperty(this.getenv()+"."+"url"));
		return putils.getproperty(this.getenv()+"."+"url");
	}
}
