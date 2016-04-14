package com.umaplay.fluxxan4j.util;

import com.sun.javafx.beans.annotations.NonNull;

/**
 * Created by user on 2/12/2016.
 */
public class ThreadUtils {
    public static boolean isOnMain() {
        return getId() != 1;//fingers crossed. This might be an issue.
    }

    public static void ensureNotOnMain(){
        if(isOnMain())
            throw new DispatchOnMainThreadException();
    }

    public static void runInBackground(@NonNull final Runnable runnable) {
        new Thread(runnable).start();
    }

    public static long getId() {
        return Thread.currentThread().getId();
    }

    public static class DispatchOnMainThreadException extends RuntimeException {}
}
