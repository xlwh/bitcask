package com.pwc.object;

import java.io.*;

public class Serialization {

    //�Ѵ�����������͵����ݶ���������л�����
    //ʹ�õ���javaԭ���Ķ������л��������������л����ܲ����ߣ���������ͨ���Բ����ߣ���̫��������ʹ��
    //�����Ƿ�����Ż�һ�£�ʹ��protobuf�������ݵ����л�����
    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();
    }

    //���ݵķ����л���������������������һ��
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }
}
