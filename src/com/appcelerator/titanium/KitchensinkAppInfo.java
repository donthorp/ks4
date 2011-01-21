package com.appcelerator.titanium;

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
	
	public KitchensinkAppInfo(TiApplication app) {
		TiProperties properties = app.getSystemProperties();
					
					properties.setBool("ti.android.debug", false);
					
					properties.setString("ti.android.google.map.api.key.development", "0ZnKXkWA2dIAu2EM-OV4ZD2lJY3sEWE5TSgjJNg");
					
					properties.setString("ti.deploytype", "development");
					
					properties.setString("ti.android.google.map.api.key.production", "GET_ME_FROM_GOOGLE");
	}
	
	public String getId() {
		return "com.appcelerator.titanium";
	}
	
	public String getName() {
		return "KitchenSink";
	}
	
	public String getVersion() {
		return "1.0";
	}
	
	public String getPublisher() {
		return "nwright";
	}
	
	public String getUrl() {
		return "appcelerator.com";
	}
	
	public String getCopyright() {
		return "2010 by nwright";
	}
	
	public String getDescription() {
		return "No description provided";
	}
	
	public String getIcon() {
		return "default_app_logo.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "6fe33f33fd1f4e95a06d2d217170866d";
	}
	
	public boolean isFullscreen() {
		return false;
	}
	
	public boolean isNavBarHidden() {
		return false;
	}
}
