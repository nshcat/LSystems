package com.lsystems.android.livewallpaper;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.lsystems.android.R;

public class WallpaperSettings extends PreferenceActivity {
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);		
	}	
}
