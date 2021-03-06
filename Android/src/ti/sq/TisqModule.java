/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.sq;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name="Tisq", id="ti.sq")
public class TisqModule extends KrollModule
{
	public static boolean DEBUG = false;
	public static final String MODULE_SHORT_NAME = "ti.sq";	

	public TisqModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		// put module init code that needs to run when the application is created
	}
	// Properties
	@Kroll.getProperty
	public boolean getDebug()
	{
		return DEBUG;
	}
	
	@Kroll.setProperty
	public void setDebug(boolean value) {
		DEBUG = value;
	}
}

