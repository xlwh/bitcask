package com.pwc.bitcask;

import java.io.Serializable;

//��������
public class Index implements Serializable {
    public final String key;              //���ݵ�key
    public final long offset;             //���������ϵ�offset
    public final int size;                //���ݵĳ���
    public final String fileName;         //�����Ǵ����ĸ��ļ���

    public Index(String key, String name, long offset, int size) {
        this.key = key;
        this.fileName = name;
        this.offset = offset;
        this.size = size;
    }
}
