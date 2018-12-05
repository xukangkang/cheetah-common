package org.kk.cheetah.common.model.response;

import java.io.Serializable;

public class ConsumerRecord<K, V> implements Serializable {

    private K key;
    private V data;
    private long offset;
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
        return "ConsumerRecord [key=" + key + ", data=" + data + ", offset=" + offset + ", topic=" + topic + "]";
    }

}
