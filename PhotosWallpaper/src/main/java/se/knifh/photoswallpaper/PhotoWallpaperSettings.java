package se.knifh.photoswallpaper;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by knifhen on 1/1/14.
 */
public class PhotoWallpaperSettings extends PreferenceActivity
    implements SharedPreferences.OnSharedPreferenceChangeListener {

        @Override
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            getPreferenceManager().setSharedPreferencesName(
                    PhotoWallpaper.SHARED_PREFS_NAME);
            addPreferencesFromResource(R.xml.photo_settings);
            getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(
                    this);
        }

        @Override
        protected void onResume() {
            super.onResume();
        }

        @Override
        protected void onDestroy() {
            getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(
                    this);
            super.onDestroy();
        }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
                                          String key) {
    }
}
