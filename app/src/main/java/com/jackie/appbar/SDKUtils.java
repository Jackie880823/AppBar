package com.jackie.appbar;

import android.os.Build;

/**
 * Created by on 16/1/27.
 *
 * @author Jackie Zhu
 * @version 1.0
 */
public class SDKUtils {
    public static final boolean IS_LOLLIPOP = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    public static final boolean IS_ICE_CREAM_SANDWICH = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
}
