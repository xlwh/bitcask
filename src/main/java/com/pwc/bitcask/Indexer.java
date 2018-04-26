package com.pwc.bitcask;

import java.io.Serializable;
import java.util.HashMap;

public class Indexer implements Serializable {
    private final HashMap<String, Index> map;

    //���췽���д�������
    public Indexer() {
        this.map = new HashMap<>();
    }

    public Index get(String key) {
        return map.get(key);
    }

    //�����ͷŵ�һ��map����
    public void put(String key, Index index) {
        map.put(key, index);
    }
}
