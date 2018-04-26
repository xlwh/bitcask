package com.pwc.bitcask;

import java.io.Serializable;

//索引对象
public class Index implements Serializable {
    public final String key;              //数据的key
    public final long offset;             //数据在盘上的offset
    public final int size;                //数据的长度
    public final String fileName;         //数据是存在哪个文件的

    public Index(String key, String name, long offset, int size) {
        this.key = key;
        this.fileName = name;
        this.offset = offset;
        this.size = size;
    }
}
