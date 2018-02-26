package com.chs.androiddailytext;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.chs.androiddailytext.changeSkin.CustomSDCardLoader;

import skin.support.SkinCompatManager;

/**
 * 作者：chs on 2018-02-24 14:04
 * 邮箱：657083984@qq.com
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinCompatManager.withoutActivity(this)
                .addStrategy(new CustomSDCardLoader()).
        loadSkin();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
