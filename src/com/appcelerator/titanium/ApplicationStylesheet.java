/**
 * Appcelerator Titanium
 * WARNING: This is a generated file.  Do not modify.
 */
package com.appcelerator.titanium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.appcelerator.titanium.TiStylesheet;

import org.appcelerator.kroll.KrollDict;

public final class ApplicationStylesheet extends TiStylesheet 
{
	public ApplicationStylesheet()
	{
		super();
		HashMap<String,KrollDict> app_classesMap = new HashMap<String,KrollDict>();
		KrollDict app_classesMap_win1 = new KrollDict();
		app_classesMap.put("win1",app_classesMap_win1);
		app_classesMap_win1.put("url","main_windows/base_ui.js");
		app_classesMap_win1.put("titleImage","images/appcelerator_small.png");
		app_classesMap_win1.put("titleid","base_ui_title");
		classesMap.put("app",app_classesMap);


		HashMap<String,KrollDict> label_basic_idsMap = new HashMap<String,KrollDict>();
		KrollDict label_basic_idsMap_font_label_test = new KrollDict();
		label_basic_idsMap.put("font_label_test",label_basic_idsMap_font_label_test);
		label_basic_idsMap_font_label_test.put("color","#369");
		label_basic_idsMap_font_label_test.put("top","10");
		label_basic_idsMap_font_label_test.put("height","150px");
		label_basic_idsMap_font_label_test.put("width","200px");
		KrollDict label_basic_idsMap_font_label_test_font = new KrollDict();
		label_basic_idsMap_font_label_test_font.put("fontWeight","normal");
		label_basic_idsMap_font_label_test_font.put("fontSize","15px");
		label_basic_idsMap_font_label_test.put("font",label_basic_idsMap_font_label_test_font);
		label_basic_idsMap_font_label_test.put("textAlign","center");
		idsMap.put("label_basic",label_basic_idsMap);

		HashMap<String,KrollDict> app_idsMap = new HashMap<String,KrollDict>();
		KrollDict app_idsMap_tab1 = new KrollDict();
		app_idsMap.put("tab1",app_idsMap_tab1);
		app_idsMap_tab1.put("titleid","base_ui_title");
		app_idsMap_tab1.put("icon","images/tabs/KS_nav_views.png");
		KrollDict app_idsMap_tabGroup1 = new KrollDict();
		app_idsMap.put("tabGroup1",app_idsMap_tabGroup1);
		app_idsMap_tabGroup1.put("barColor","#336699");
		idsMap.put("app",app_idsMap);




	}
}

