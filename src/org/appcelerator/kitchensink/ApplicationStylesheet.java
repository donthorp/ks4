/**
 * Appcelerator Titanium
 * WARNING: This is a generated file.  Do not modify.
 */
package org.appcelerator.kitchensink;

import java.util.HashMap;
import org.appcelerator.titanium.ITiStylesheet;
import org.appcelerator.kroll.KrollDict;

public final class ApplicationStylesheet implements ITiStylesheet 
{
	private static final HashMap<String,HashMap<String,KrollDict>> classesMap;
	private static final HashMap<String,HashMap<String,KrollDict>> idsMap;
	private static final HashMap<String,HashMap<String,HashMap<String,KrollDict>>> classesDensityMap;
	private static final HashMap<String,HashMap<String,HashMap<String,KrollDict>>> idsDensityMap;

	static
	{
		classesMap = new HashMap<String,HashMap<String,KrollDict>>();
		idsMap = new HashMap<String,HashMap<String,KrollDict>>();
		classesDensityMap = new HashMap<String,HashMap<String,HashMap<String,KrollDict>>>();
		idsDensityMap = new HashMap<String,HashMap<String,HashMap<String,KrollDict>>>();
		

		HashMap<String,KrollDict> m1285111676596880 = new HashMap<String,KrollDict>();
		KrollDict m1285111676596887 = new KrollDict();
		m1285111676596880.put("font_label_test",m1285111676596887);
		m1285111676596887.put("color","#369");
		m1285111676596887.put("top","10");
		m1285111676596887.put("height","150px");
		m1285111676596887.put("width","200px");
		KrollDict m1285111676596916 = new KrollDict();
		m1285111676596916.put("fontWeight","normal");
		m1285111676596916.put("fontSize","15px");
		m1285111676596887.put("font",m1285111676596916);
		m1285111676596887.put("textAlign","center");
		idsMap.put("label_basic",m1285111676596880);

		HashMap<String,KrollDict> m1285111676596939 = new HashMap<String,KrollDict>();
		KrollDict m1285111676596946 = new KrollDict();
		m1285111676596939.put("tab1",m1285111676596946);
		m1285111676596946.put("titleid","base_ui_title");
		m1285111676596946.put("icon","images/tabs/KS_nav_views.png");
		KrollDict m1285111676596964 = new KrollDict();
		m1285111676596939.put("win1",m1285111676596964);
		m1285111676596964.put("url","main_windows/base_ui.js");
		m1285111676596964.put("titleImage","images/appcelerator_small.png");
		KrollDict m1285111676596982 = new KrollDict();
		m1285111676596939.put("tabGroup1",m1285111676596982);
		m1285111676596982.put("barColor","#336699");
		idsMap.put("app",m1285111676596939);




	}

	public final KrollDict getStylesheet(String objectId, String type, String density, String basename)
	{
		KrollDict result = new KrollDict();
		if (classesMap!=null && classesMap.containsKey(basename))
		{
			KrollDict r = classesMap.get(basename).get(type);
			if (r!=null) result.putAll(r);
		}
		if (classesDensityMap!=null && classesDensityMap.containsKey(basename))
		{
			HashMap<String,KrollDict> r = classesDensityMap.get(basename).get(density);
			if (r!=null && r.containsKey(type)) 
			{
				KrollDict r2 = r.get(type);
				if (r2!=null) result.putAll(r2);
			}
		}
		if (idsMap!=null && idsMap.containsKey(basename))
		{
			KrollDict r = idsMap.get(basename).get(objectId);
			if (r!=null) result.putAll(r);
		}
		if (idsDensityMap!=null && idsDensityMap.containsKey(basename))
		{
			HashMap<String,KrollDict> r = idsDensityMap.get(basename).get(density);
			if (r!=null && r.containsKey(objectId)) 
			{
				KrollDict r2 = r.get(objectId);
				if (r2!=null) result.putAll(r2);
			}
		}
		return result;
	}
}

