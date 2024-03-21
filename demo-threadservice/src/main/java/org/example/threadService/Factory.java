package org.example.threadService;

import java.util.concurrent.ThreadFactory;

public class Factory implements ThreadFactory {
    private String threadName;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName(threadName);
        return thread;
    }
}
