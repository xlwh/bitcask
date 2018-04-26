package com.pwc.bitcask;

import java.io.Serializable;
import java.util.HashMap;

public class Indexer implements Serializable {
    private final HashMap<String, Index> map;

    //构造方法中创建索引
    public Indexer() {
        this.map = new HashMap<>();
    }

    public Index get(String key) {
        return map.get(key);
    }

    //索引就放到一个map里面
    public void put(String key, Index index) {
        map.put(key, index);
    }
}
