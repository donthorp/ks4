package org.appcelerator.kitchensink;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

public class KitchenSinkAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";

	public KitchenSinkAppInfo(TiApplication app) {
		TiProperties properties = app.getSystemProperties();

		properties.setBool("ti.android.debug", false);
		properties.setString("ti.deploytype", "eclipse");

		//properties.setString("ti.android.google.map.api.key.development", "0ZnKXkWA2dIAu2EM-OV4ZD2lJY3sEWE5TSgjJNg");
		properties.setString("ti.android.google.map.api.key.development", "0Rq5tT4bUSXduTPp-FltklB_7oi4E7YRNic20sg");

	}

	public String getId() {
		return "com.nolanwright.kitchensink";
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

	@Override
	public boolean isFullscreen() {
		return false;
	}

	@Override
	public boolean isNavBarHidden() {
		return false;
	}
}
