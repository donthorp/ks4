package org.appcelerator.kitchensink;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.kroll.KrollModule;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class KitchensinkApplication extends TiApplication {

	protected HashMap<String, ArrayList<String>> moduleBindings = new HashMap<String, ArrayList<String>>();
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new KitchensinkAppInfo(this);
	}
	
	@Override
	public List<KrollModule> bootModules(TiContext context) {
		ArrayList<KrollModule> modules = new ArrayList<KrollModule>();
			// App module
			ArrayList<String> App_bindings = new ArrayList<String>();
			App_bindings.add("Properties");
			moduleBindings.put("App", App_bindings);
			ti.modules.titanium.app.AppModule App_module = new ti.modules.titanium.app.AppModule(context);
			App_module.bind(context.getScope(), null);
			modules.add(App_module);
			// API module
			ArrayList<String> API_bindings = new ArrayList<String>();
			moduleBindings.put("API", API_bindings);
			ti.modules.titanium.api.APIModule API_module = new ti.modules.titanium.api.APIModule(context);
			API_module.bind(context.getScope(), null);
			modules.add(API_module);
			// Platform module
			ArrayList<String> Platform_bindings = new ArrayList<String>();
			Platform_bindings.add("BATTERY_STATE_UNKNOWN");
			Platform_bindings.add("BATTERY_STATE_UNPLUGGED");
			Platform_bindings.add("BATTERY_STATE_CHARGING");
			Platform_bindings.add("BATTERY_STATE_FULL");
			moduleBindings.put("Platform", Platform_bindings);
			ti.modules.titanium.platform.PlatformModule Platform_module = new ti.modules.titanium.platform.PlatformModule(context);
			Platform_module.bind(context.getScope(), null);
			modules.add(Platform_module);
			// Analytics module
			ArrayList<String> Analytics_bindings = new ArrayList<String>();
			moduleBindings.put("Analytics", Analytics_bindings);
			ti.modules.titanium.analytics.AnalyticsModule Analytics_module = new ti.modules.titanium.analytics.AnalyticsModule(context);
			Analytics_module.bind(context.getScope(), null);
			modules.add(Analytics_module);
			// Network module
			ArrayList<String> Network_bindings = new ArrayList<String>();
			Network_bindings.add("INADDR_ANY");
			Network_bindings.add("READ_WRITE_MODE");
			Network_bindings.add("NOTIFICATION_TYPE_BADGE");
			Network_bindings.add("NOTIFICATION_TYPE_ALERT");
			Network_bindings.add("NOTIFICATION_TYPE_SOUND");
			moduleBindings.put("Network", Network_bindings);
			ti.modules.titanium.network.NetworkModule Network_module = new ti.modules.titanium.network.NetworkModule(context);
			Network_module.bind(context.getScope(), null);
			modules.add(Network_module);
			// UI module
			ArrayList<String> UI_bindings = new ArrayList<String>();
			UI_bindings.add("iPhone");
			UI_bindings.add("PORTRAIT");
			UI_bindings.add("UPSIDE_PORTRAIT");
			UI_bindings.add("LANDSCAPE_LEFT");
			UI_bindings.add("LANDSCAPE_RIGHT");
			UI_bindings.add("ANIMATION_CURVE_EASE_IN_OUT");
			UI_bindings.add("TEXT_ALIGNMENT_LEFT");
			UI_bindings.add("TEXT_ALIGNMENT_CENTER");
			UI_bindings.add("TEXT_ALIGNMENT_RIGHT");
			UI_bindings.add("TEXT_VERTICAL_ALIGNMENT_TOP");
			UI_bindings.add("TEXT_VERTICAL_ALIGNMENT_CENTER");
			UI_bindings.add("TEXT_VERTICAL_ALIGNMENT_BOTTOM");
			UI_bindings.add("INPUT_BORDERSTYLE_ROUNDED");
			UI_bindings.add("TEXT_AUTOCAPITALIZATION_NONE");
			UI_bindings.add("BLEND_MODE_SOURCE_IN");
			UI_bindings.add("Android");
			UI_bindings.add("NOTIFICATION_DURATION_LONG");
			UI_bindings.add("FACE_UP");
			UI_bindings.add("FACE_DOWN");
			UI_bindings.add("UNKNOWN");
			UI_bindings.add("PICKER_TYPE_DATE");
			UI_bindings.add("PICKER_TYPE_TIME");
			UI_bindings.add("PICKER_TYPE_DATE_AND_TIME");
			UI_bindings.add("PICKER_TYPE_COUNT_DOWN_TIMER");
			UI_bindings.add("ActivityIndicator");
			UI_bindings.add("RETURNKEY_GO");
			UI_bindings.add("KEYBOARD_URL");
			UI_bindings.add("INPUT_BORDERSTYLE_NONE");
			UI_bindings.add("KEYBOARD_APPEARANCE_ALERT");
			UI_bindings.add("KEYBOARD_NUMBERS_PUNCTUATION");
			UI_bindings.add("RETURNKEY_EMERGENCY_CALL");
			UI_bindings.add("TEXT_AUTOCAPITALIZATION_ALL");
			UI_bindings.add("INPUT_BORDERSTYLE_BEZEL");
			UI_bindings.add("INPUT_BORDERSTYLE_LINE");
			UI_bindings.add("INPUT_BUTTONMODE_NEVER");
			UI_bindings.add("INPUT_BUTTONMODE_ALWAYS");
			UI_bindings.add("INPUT_BUTTONMODE_ONFOCUS");
			UI_bindings.add("INPUT_BUTTONMODE_ONBLUR");
			UI_bindings.add("RETURNKEY_DEFAULT");
			UI_bindings.add("RETURNKEY_GOOGLE");
			UI_bindings.add("RETURNKEY_JOIN");
			UI_bindings.add("RETURNKEY_NEXT");
			UI_bindings.add("RETURNKEY_ROUTE");
			UI_bindings.add("RETURNKEY_SEARCH");
			UI_bindings.add("RETURNKEY_SEND");
			UI_bindings.add("RETURNKEY_YAHOO");
			UI_bindings.add("RETURNKEY_DONE");
			UI_bindings.add("KEYBOARD_DEFAULT");
			UI_bindings.add("KEYBOARD_ASCII");
			UI_bindings.add("KEYBOARD_APPEARANCE_DEFAULT");
			UI_bindings.add("KEYBOARD_NUMBER_PAD");
			UI_bindings.add("KEYBOARD_PHONE_PAD");
			UI_bindings.add("KEYBOARD_NAMEPHONE_PAD");
			UI_bindings.add("KEYBOARD_EMAIL");
			UI_bindings.add("TEXT_AUTOCAPITALIZATION_WORDS");
			UI_bindings.add("TEXT_AUTOCAPITALIZATION_SENTENCES");
			UI_bindings.add("INPUTMODE_ALWAYS");
			moduleBindings.put("UI", UI_bindings);
			ti.modules.titanium.ui.UIModule UI_module = new ti.modules.titanium.ui.UIModule(context);
			UI_module.bind(context.getScope(), null);
			modules.add(UI_module);
			// Accelerometer module
			ArrayList<String> Accelerometer_bindings = new ArrayList<String>();
			moduleBindings.put("Accelerometer", Accelerometer_bindings);
			ti.modules.titanium.accelerometer.AccelerometerModule Accelerometer_module = new ti.modules.titanium.accelerometer.AccelerometerModule(context);
			Accelerometer_module.bind(context.getScope(), null);
			modules.add(Accelerometer_module);
			// Map module
			ArrayList<String> Map_bindings = new ArrayList<String>();
			Map_bindings.add("ANNOTATION_RED");
			Map_bindings.add("ANNOTATION_GREEN");
			Map_bindings.add("ANNOTATION_PURPLE");
			Map_bindings.add("STANDARD_TYPE");
			Map_bindings.add("SATELLITE_TYPE");
			Map_bindings.add("HYBRID_TYPE");
			moduleBindings.put("Map", Map_bindings);
			ti.modules.titanium.map.MapModule Map_module = new ti.modules.titanium.map.MapModule(context);
			Map_module.bind(context.getScope(), null);
			modules.add(Map_module);
			// Media module
			ArrayList<String> Media_bindings = new ArrayList<String>();
			Media_bindings.add("NO_CAMERA");
			Media_bindings.add("MEDIA_TYPE_PHOTO");
			Media_bindings.add("MEDIA_TYPE_VIDEO");
			Media_bindings.add("CAMERA_FLASH_AUTO");
			Media_bindings.add("CAMERA_FLASH_ON");
			Media_bindings.add("CAMERA_FLASH_OFF");
			Media_bindings.add("CAMERA_REAR");
			Media_bindings.add("CAMERA_FRONT");
			Media_bindings.add("VIDEO_CONTROL_DEFAULT");
			Media_bindings.add("VIDEO_CONTROL_FULLSCREEN");
			Media_bindings.add("VIDEO_SCALING_MODE_FILL");
			Media_bindings.add("QUALITY_640x480");
			Media_bindings.add("VIDEO_CONTROL_EMBEDDED");
			Media_bindings.add("VIDEO_TIME_OPTION_EXACT");
			Media_bindings.add("VIDEO_CONTROL_NONE");
			Media_bindings.add("MUSIC_PLAYER_STATE_PLAYING");
			Media_bindings.add("MUSIC_PLAYER_STATE_STOPPED");
			Media_bindings.add("NO_MUSIC_PLAYER");
			Media_bindings.add("MUSIC_MEDIA_TYPE_ALL");
			Media_bindings.add("MUSIC_MEDIA_TYPE_MUSIC");
			Media_bindings.add("MUSIC_MEDIA_TYPE_PODCAST");
			Media_bindings.add("MUSIC_MEDIA_TYPE_AUDIOBOOK");
			Media_bindings.add("MUSIC_MEDIA_TYPE_ANY_AUDIO");
			Media_bindings.add("NO_VIDEO");
			Media_bindings.add("QUALITY_HIGH");
			Media_bindings.add("VIDEO_SCALING_ASPECT_FILL");
			Media_bindings.add("AUDIO_SESSION_MODE_PLAYBACK");
			Media_bindings.add("AUDIO_SESSION_MODE_AMBIENT");
			Media_bindings.add("AUDIO_SESSION_MODE_SOLO_AMBIENT");
			Media_bindings.add("AUDIO_SESSION_MODE_PLAY_AND_RECORD");
			Media_bindings.add("AUDIO_FORMAT_LINEAR_PCM");
			Media_bindings.add("AUDIO_FILEFORMAT_CAF");
			Media_bindings.add("AUDIO_FORMAT_ULAW");
			Media_bindings.add("AUDIO_FILEFORMAT_WAVE");
			Media_bindings.add("AUDIO_HEADSET_INOUT");
			Media_bindings.add("AUDIO_RECEIVER_AND_MIC");
			Media_bindings.add("AUDIO_HEADPHONES_AND_MIC");
			Media_bindings.add("AUDIO_HEADPHONES");
			Media_bindings.add("AUDIO_LINEOUT");
			Media_bindings.add("AUDIO_SPEAKER");
			Media_bindings.add("AUDIO_MICROPHONE");
			Media_bindings.add("AUDIO_MUTED");
			Media_bindings.add("AUDIO_UNAVAILABLE");
			Media_bindings.add("AUDIO_UNKNOWN");
			Media_bindings.add("AUDIO_SESSION_MODE_RECORD");
			moduleBindings.put("Media", Media_bindings);
			ti.modules.titanium.media.MediaModule Media_module = new ti.modules.titanium.media.MediaModule(context);
			Media_module.bind(context.getScope(), null);
			modules.add(Media_module);
			// Geolocation module
			ArrayList<String> Geolocation_bindings = new ArrayList<String>();
			Geolocation_bindings.add("ACCURACY_BEST");
			Geolocation_bindings.add("ACCURACY_NEAREST_TEN_METERS");
			Geolocation_bindings.add("ACCURACY_HUNDRED_METERS");
			Geolocation_bindings.add("ACCURACY_KILOMETER");
			Geolocation_bindings.add("ACCURACY_THREE_KILOMETERS");
			moduleBindings.put("Geolocation", Geolocation_bindings);
			ti.modules.titanium.geolocation.GeolocationModule Geolocation_module = new ti.modules.titanium.geolocation.GeolocationModule(context);
			Geolocation_module.bind(context.getScope(), null);
			modules.add(Geolocation_module);
			// Filesystem module
			ArrayList<String> Filesystem_bindings = new ArrayList<String>();
			moduleBindings.put("Filesystem", Filesystem_bindings);
			ti.modules.titanium.filesystem.FilesystemModule Filesystem_module = new ti.modules.titanium.filesystem.FilesystemModule(context);
			Filesystem_module.bind(context.getScope(), null);
			modules.add(Filesystem_module);
			// Contacts module
			ArrayList<String> Contacts_bindings = new ArrayList<String>();
			moduleBindings.put("Contacts", Contacts_bindings);
			ti.modules.titanium.contacts.ContactsModule Contacts_module = new ti.modules.titanium.contacts.ContactsModule(context);
			Contacts_module.bind(context.getScope(), null);
			modules.add(Contacts_module);
			// Database module
			ArrayList<String> Database_bindings = new ArrayList<String>();
			moduleBindings.put("Database", Database_bindings);
			ti.modules.titanium.database.DatabaseModule Database_module = new ti.modules.titanium.database.DatabaseModule(context);
			Database_module.bind(context.getScope(), null);
			modules.add(Database_module);
			// Facebook module
			ArrayList<String> Facebook_bindings = new ArrayList<String>();
			moduleBindings.put("Facebook", Facebook_bindings);
			ti.modules.titanium.facebook.FacebookModule Facebook_module = new ti.modules.titanium.facebook.FacebookModule(context);
			Facebook_module.bind(context.getScope(), null);
			modules.add(Facebook_module);
			// Utils module
			ArrayList<String> Utils_bindings = new ArrayList<String>();
			moduleBindings.put("Utils", Utils_bindings);
			ti.modules.titanium.utils.UtilsModule Utils_module = new ti.modules.titanium.utils.UtilsModule(context);
			Utils_module.bind(context.getScope(), null);
			modules.add(Utils_module);
			// Gesture module
			ArrayList<String> Gesture_bindings = new ArrayList<String>();
			moduleBindings.put("Gesture", Gesture_bindings);
			ti.modules.titanium.gesture.GestureModule Gesture_module = new ti.modules.titanium.gesture.GestureModule(context);
			Gesture_module.bind(context.getScope(), null);
			modules.add(Gesture_module);
			// XML module
			ArrayList<String> XML_bindings = new ArrayList<String>();
			moduleBindings.put("XML", XML_bindings);
			ti.modules.titanium.xml.XMLModule XML_module = new ti.modules.titanium.xml.XMLModule(context);
			XML_module.bind(context.getScope(), null);
			modules.add(XML_module);
			// Yahoo module
			ArrayList<String> Yahoo_bindings = new ArrayList<String>();
			moduleBindings.put("Yahoo", Yahoo_bindings);
			ti.modules.titanium.yahoo.YahooModule Yahoo_module = new ti.modules.titanium.yahoo.YahooModule(context);
			Yahoo_module.bind(context.getScope(), null);
			modules.add(Yahoo_module);
		return modules;
	}
	
	@Override
	public List<String> getFilteredBindings(String moduleName) {
		return moduleBindings.get(moduleName);
	}
}
