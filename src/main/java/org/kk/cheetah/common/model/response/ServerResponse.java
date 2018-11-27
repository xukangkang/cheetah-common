package org.kk.cheetah.common.model.response;

/**
 *
* @ClassName: ClientRequest
* @Description: 客户端请求，此接口为标记接口
* @author xukangkang
* @date 2018年11月19日  
*
 */

public interface ServerResponse {
    String getOnlyTag();

    String getErrorMsg();

    void setErrorMsg(String errorMsg);
}
