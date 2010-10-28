package org.appcelerator.kitchensink;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public final class KitchensinkAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";

	public KitchenSinkAppInfo(TiApplication app) {
		TiProperties properties = app.getSystemProperties();

		properties.setBool("ti.android.debug", false);
		properties.setString("ti.deploytype", "eclipse");

		//properties.setString("ti.android.google.map.api.key.development", "0ZnKXkWA2dIAu2EM-OV4ZD2lJY3sEWE5TSgjJNg");
		// don
		//properties.setString("ti.android.google.map.api.key", "0Rq5tT4bUSXcVQ3F0gt8ekVBkqgn05ZJBQMj6uw");					
		// marshall
		//properties.setString("ti.android.google.map.api.key.development", "0A5J3AcoQizmxgmS-SMUm4JttfeX-ugVYcW7mew");
		properties.setString("ti.android.google.map.api.key.production", "GET_ME_FROM_GOOGLE");
	}
	
	public String getId() {
		return "org.appcelerator.kitchensink";
	}
	
	public String getName() {
		return "KitchenSink";
	}
	
	public String getVersion() {
		return "1.5";
	}
	
	public String getPublisher() {
		return "nwright";
	}
	
	public String getUrl() {
		return "appcelerator.com";
	}
	
	public String getCopyright() {
		return "2009 by nwright";
	}
	
	public String getDescription() {
		return "No description provided";
	}
	
	public String getIcon() {
		return "appicon.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "6fe33f33fd1f4e95a06d2d217170866d";
	}
	@Override
	public boolean isFullscreen() {
		return false;
	}

	@Override
	public boolean isNavBarHidden() {
		return false;
	}
}
