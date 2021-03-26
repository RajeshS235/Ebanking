package com.ebankingUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataConfig {

	public Properties p;
	
	public DataConfig() throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);
	}
	
	public String applicationUrl() {
		String urls = p.getProperty("url");
		return urls;
	}
	public String userName() {
		String user = p.getProperty("username");
		return user;
	}
	
	public String password() {
		String pass = p.getProperty("password");
		return pass;
	}

	
	
	
}


