package org.kk.cheetah.common.model.response;

import java.io.Serializable;

public class ProducerRecord implements ServerResponse, Serializable {
    private String dataId;

    private long offset;

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getOnlyTag() {
        return dataId;
    }
}
