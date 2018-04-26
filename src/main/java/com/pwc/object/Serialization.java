package com.pwc.object;

import java.io.*;

public class Serialization {

    //把传入的任意类型的数据对象进行序列化操作
    //使用的是java原生的对象序列化操作，这种序列化性能并不高，并且语言通用性并不高，不太建议这样使用
    //这里是否可以优化一下，使用protobuf来搞数据的序列化操作
    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();
    }

    //数据的反序列化操作，性能问题和上面的一样
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }
}
