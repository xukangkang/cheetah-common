package org.kk.cheetah.common.model.response;

import java.io.Serializable;

import org.msgpack.annotation.Message;
import org.msgpack.annotation.MessagePackMessage;

@Message
public class ConsumerRecord<K, V> implements Serializable{
	
	private K key;
    private V data;
    private long offset;
    private String test;
    public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

	@Override
	public String toString() {
		return "ConsumerRecord [key=" + key + ", data=" + data + ", offset=" + offset + ", test=" + test + "]";
	}
}
