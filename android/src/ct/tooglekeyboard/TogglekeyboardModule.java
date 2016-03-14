/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ct.tooglekeyboard;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
//import org.appcelerator.kroll.common.Log;
//import org.appcelerator.kroll.common.TiConfig;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

@Kroll.module(name="Togglekeyboard", id="ct.tooglekeyboard")
public class TogglekeyboardModule extends KrollModule
{
	// Standard Debugging variables
	//private static final String LCAT = "TogglekeyboardModule";

	public TogglekeyboardModule()
	{
		super();
	}

	// Methods
	@Kroll.method
	public String show()
	{
		Context context = TiApplication.getInstance().getApplicationContext();
		InputMethodManager manager = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
		manager.toggleSoftInput(1, InputMethodManager.SHOW_IMPLICIT);

		return "show";
	}

	@Kroll.method
	public String hide()
	{
		Context context = TiApplication.getInstance().getApplicationContext();
		InputMethodManager manager = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
		manager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

		return "hidde";
	}
}

