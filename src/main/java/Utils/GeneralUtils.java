package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GeneralUtils {
	
	private Properties props;
	
	public GeneralUtils() {
		try {
		InputStream input = new FileInputStream(System.getProperty("user.dir")+"//resources//application.properties");
		props = new Properties();
		props.load(input);
		}catch(IOException e) {
			throw new RuntimeException("Can not read Properties file");
		}
	}
	
	public String getUrl() {
		return props.getProperty("applicationurl");
	}
	
	public String getBrowserName() {
		return props.getProperty("browsername");
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = props.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
	
}
