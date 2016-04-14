package com.umaplay.fluxxan4j.util;

import com.sun.istack.internal.Nullable;

/**
 * Created by stefan.froelich on 4/14/2016.
 */
public class TextUtils {
    public static boolean isEmpty(@Nullable CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }
}
