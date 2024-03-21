package org.example.threadService;

import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;
@Configuration
public class ThreadPoolUtil {

    public static ThreadPoolExecutor threadPoolExecutor;


    static {
        int cpusize=Runtime.getRuntime().availableProcessors();
        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(Integer.MAX_VALUE);
        threadPoolExecutor=new ThreadPoolExecutor(cpusize,
                Runtime.getRuntime().availableProcessors()*2,
                10, TimeUnit.SECONDS,arrayBlockingQueue, Executors.defaultThreadFactory()
                ,new ThreadPoolExecutor.AbortPolicy());
    }
    private ThreadPoolUtil() {
    }

}
