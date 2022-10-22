package com.heima.utils.thread;

import com.heima.model.wemedia.pojos.WmUser;

/**
 * @作者 花火
 * @创建日期 2022/10/21 14:45
 */
public class WmThreadLocalUtil {
    private final static ThreadLocal<WmUser> WM_USER_THREAD_LOCAL = new ThreadLocal<>();
    //存入线程
    public static void setUser(WmUser wmUser)
    {
        WM_USER_THREAD_LOCAL.set(wmUser);
    }

    //从线程中获取
    public static WmUser getUser(){
        return WM_USER_THREAD_LOCAL.get();
    }

    //清理
    public static void clear()
    {
        WM_USER_THREAD_LOCAL.remove();
    }
}
