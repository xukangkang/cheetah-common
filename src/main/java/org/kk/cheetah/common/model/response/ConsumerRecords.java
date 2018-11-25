package org.kk.cheetah.common.model.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConsumerRecords<K, V> implements Iterable<ConsumerRecord<K, V>>, ServerResponse ,Serializable{

    private List<ConsumerRecord<K, V>> consumberRecords;

    private String onlyTag;
    public void setOnlyTag(String onlyTag) {
		this.onlyTag = onlyTag;
	}

	public ConsumerRecords() {
        this.consumberRecords = new ArrayList<ConsumerRecord<K, V>>();
    }

    public Iterator<ConsumerRecord<K, V>> iterator() {
    	if(consumberRecords  != null){
            return consumberRecords.iterator();
    	}else{
    		return new ArrayList<ConsumerRecord<K, V>>().iterator();
    	}

    }

    public String getOnlyTag() {
        return onlyTag;
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

	@Override
	public String toString() {
		return "ConsumerRecords [consumberRecords=" + consumberRecords + ", onlyTag=" + onlyTag + "]";
	}
}
