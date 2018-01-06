package com.zxz.gradledemo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * <pre>
 *     author : ZhanXuzhao
 *     e-mail : zhanxuzhao@yyd.robo.com
 *     time   : 2018/1/6 15:49
 *     desc   :
 *     version:
 * </pre>
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
