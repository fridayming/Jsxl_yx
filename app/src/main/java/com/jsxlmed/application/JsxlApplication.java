package com.jsxlmed.application;

import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.jsxlmed.R;




public class JsxlApplication extends Application {
	public HashMap<String, SoftReference<Bitmap>> mMenusCache = new HashMap<String, SoftReference<Bitmap>>();
	public String mVedioPath;

	private boolean isLogin = false;

	private String userId;

	private String userName;

	public static final String SHIYONGBAN = "shiyong";

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@SuppressLint("SdCardPath")
	@Override
	public void onCreate() {
		super.onCreate();
		// mVedioPath = Environment.getExternalStorageDirectory().toString() +
		// "/jsxl/vedio/";
		mVedioPath = "/mnt/sdcard/jsxl/video/";
		//initImageLoader(getApplicationContext());
		/*Vitamio.isInitialized(getApplicationContext());
		MobSDK.init(this, "249aba5c906a8", "ffa31ba2dff213c8271a59563affad98");*/
	}

	/**
	 * ????????menu??
	 */
	public Bitmap getMenuPic(String gid) {
		try {
			Bitmap bitmap = null;
			if (mMenusCache.containsKey(gid)) {
				SoftReference<Bitmap> reference = mMenusCache.get(gid);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets()
					.open("menus/" + gid));
			mMenusCache.put(gid, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.menu_item_default_01);
		}
	}


}
