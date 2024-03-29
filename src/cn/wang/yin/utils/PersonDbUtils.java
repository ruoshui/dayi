package cn.wang.yin.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;

public class PersonDbUtils {
	private static PersonDbAdapter personDb;
	private static Context context;
	private static SharedPreferences preference;

	public static void init(Context ctx) {
		if (ctx != null) {
			context = ctx;
		}
		getInstance();
		SQLiteDatabase sdb = personDb.getWritableDatabase();
		// sdb.execSQL(Constant.DROP_SQL_GPS_INFO);
		sdb.execSQL(PersonConstant.SQL_GPS_INFO);
		sdb.execSQL(PersonConstant.SQL_PERSON_COLLECT);
		sdb.close();
	}

	public static PersonDbAdapter getInstance() {
		if (personDb == null) {
			personDb = new PersonDbAdapter(context);
		}

		// getPreferenceManager();
		// preference.
		// getPreferences(Activity.MODE_PRIVATE);
		return personDb;
	}

	public static SharedPreferences getPreference() {
		return preference;
	}

	public static void setPreference(SharedPreferences preference) {
		PersonDbUtils.preference = preference;
	}

	public static boolean putValue(String key, String value,
			SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putString(key, value);
		return editor.commit();

	}

	public static boolean putValue(String key, boolean value,
			SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putBoolean(key, value);
		return editor.commit();

	}

	public static boolean putValue(String key, float value,
			SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putFloat(key, value);
		return editor.commit();

	}

	public static boolean putValue(String key, double value,
			SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putFloat(key, (float) value);
		return editor.commit();

	}

	public static boolean putValue(String key, int value, SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putInt(key, value);
		return editor.commit();

	}

	public static boolean putValue(String key, long value, SharedPreferences pre) {
		if (preference == null) {
			preference = pre;
		}
		Editor editor = preference.edit();
		editor.putLong(key, value);
		return editor.commit();
	}

	public static boolean remove(String key) {
		Editor editor = preference.edit();
		editor.remove(key);
		return editor.commit();
		// editor.putLong(key, value);
	}

	public static String getValue(String key, String defValue) {
		return preference.getString(key, defValue);
	}

	public static float getValue(String key, float defValue) {
		return preference.getFloat(key, defValue);
	}

	public static boolean getValue(String key, boolean defValue) {
		return preference.getBoolean(key, defValue);
	}

	public static long getValue(String key, long defValue) {
		return preference.getLong(key, defValue);
	}

	public static int getValue(String key, int defValue) {
		return preference.getInt(key, defValue);
	}

	public static Context getContext() {
		return context;
	}

	public static void setContext(Context context) {
		PersonDbUtils.context = context;
	}

}
