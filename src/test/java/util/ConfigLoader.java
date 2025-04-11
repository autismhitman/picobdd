package util;

import java.util.Properties;

public class ConfigLoader {
	
	private final Properties props;
	private static ConfigLoader configLoader;
	
	private ConfigLoader() {
		props = PropertyUtils.propLoader("src/test/resources/Config.properties");
	}
	
    public static ConfigLoader getInstance() {
    	if(configLoader==null) {
    		configLoader = new ConfigLoader();
    	}
    	return configLoader;
    }
    
    public String getBaseUrl() {
    	String prop = props.getProperty("baseurl");
    	if(prop!=null) {
    		return prop;
    	}
    	else {
    		throw new RuntimeException("property baseurl is not configured in the config property file.");
    	}
    }
}
