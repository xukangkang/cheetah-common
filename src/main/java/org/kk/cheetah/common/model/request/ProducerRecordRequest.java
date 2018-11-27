package org.kk.cheetah.common.model.request;

import java.io.Serializable;

import org.msgpack.annotation.MessagePackBeans;

@MessagePackBeans
public class ProducerRecordRequest<K, V> implements ClientRequest, Serializable {
    private String topic;
    private String clientId;
    private String dataId;
    private V data;
    private K key;

    public ProducerRecordRequest(K key, V data) {
        this.data = data;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ProducerRecordRequest [topic=" + topic + ", clientId=" + clientId + ", dataId=" + dataId + ", data="
                + data + ", key=" + key + "]";
    }

}
