package com.grp.console.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class thread_1 {

    public static void main(String[] args){
//        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
//        ThreadInfo[] info = threadMXBean.dumpAllThreads(false,false);
//
//        for (ThreadInfo threadInfo : info) {
//            System.out.println(threadInfo.getThreadId() + "," + threadInfo.getThreadName() + "\n");
//        }


        Date t = new Date("2020/02/18 17:41:00");

        Calendar cal = Calendar.getInstance();
        cal.setTime(t);
        cal.add(Calendar.MINUTE, 5);
        Date endDate = cal.getTime();

        System.out.println( t.after(endDate) );
    }

}
