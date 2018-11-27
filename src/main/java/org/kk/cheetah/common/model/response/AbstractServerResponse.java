package org.kk.cheetah.common.model.response;

import java.io.Serializable;

public abstract class AbstractServerResponse implements ServerResponse, Serializable {

    protected String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
