package com.gengms.simplearch;

import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceManager
{
    private static ExecutorServiceManager manager = new ExecutorServiceManager();

    public static ExecutorServiceManager getInstance() {
        return manager;
    }

    private ExecutorService executorService;

    private ExecutorServiceManager() {
        executorService = Executors.newCachedThreadPool(r-> {
                Thread thread = new Thread(r);
                thread.setUncaughtExceptionHandler((t, e)-> Log.e(t.getName()+t.getId(), e.getMessage()));
                return thread;
            });
    }


    public void execute(Runnable runnable) {
        executorService.execute(runnable);
    }
}
