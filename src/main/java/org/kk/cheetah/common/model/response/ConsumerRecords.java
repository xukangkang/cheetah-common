package org.kk.cheetah.common.model.response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConsumerRecords<K, V> implements Iterable<ConsumerRecord<K, V>>, ServerResponse {

    private List<ConsumerRecord<K, V>> consumberRecords;

    public ConsumerRecords() {
        this.consumberRecords = new ArrayList<ConsumerRecord<K, V>>();
    }

    public Iterator<ConsumerRecord<K, V>> iterator() {
        return consumberRecords.iterator();
    }

    public String getOnlyTag() {
        return null;
    }

    public List<ConsumerRecord<K, V>> getConsumberRecords() {
        return consumberRecords;
    }

    public void setConsumberRecords(List<ConsumerRecord<K, V>> consumberRecords) {
        this.consumberRecords = consumberRecords;
    }

    public void add(ConsumerRecord consumerRecord) {
        consumberRecords.add(consumerRecord);

    }
}
