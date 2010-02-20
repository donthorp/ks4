package org.appcelerator.kitchensink;

import org.appcelerator.titanium.TiApplication;

public class KitchenSinkApplication extends TiApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new KitchenSinkAppInfo(this);
	}
}
