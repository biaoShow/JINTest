package com.benxiang.jintest;

import java.io.FileDescriptor;

/**
 * Created by ZeQiang Fang on 2018/6/1.
 */

public class OpenAndCloseJNI {
    private native static FileDescriptor open(String path, int baudrate, int flags);
    public native void close();
    static {
        System.loadLibrary("serial_port");
    }
}
