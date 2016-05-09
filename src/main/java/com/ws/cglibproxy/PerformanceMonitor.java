package com.ws.cglibproxy;



/**
 * Performance 性能
 * Monitor 监听器
 * 性能监听器实现类
 * Created by alvin on 2016/5/9.
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<MethodPerformance>();
    public static void begin(String method){
        System.out.println("begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceThreadLocal.set(mp);
    }

    public static void end(){
        System.out.println("end monitor...");
        MethodPerformance mp = performanceThreadLocal.get();
        mp.printPerformance();
    }
}
