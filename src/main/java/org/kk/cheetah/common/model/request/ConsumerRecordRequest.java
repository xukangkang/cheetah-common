package org.kk.cheetah.common.model.request;

import java.io.Serializable;

import org.msgpack.annotation.MessagePackBeans;

@MessagePackBeans
public class ConsumerRecordRequest implements ClientRequest, Serializable {

    private String group;
    private String clientId;
    private int maxPollNum;
    private String pollTag;
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPollTag() {
        return pollTag;
    }

    public void setPollTag(String pollTag) {
        this.pollTag = pollTag;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setMaxPollNum(int maxPollNum) {
        this.maxPollNum = maxPollNum;
    }

    public int getMaxPollNum() {
        return maxPollNum;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime * result + ((topic == null) ? 0 : topic.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConsumerRecordRequest other = (ConsumerRecordRequest) obj;
        if (clientId == null) {
            if (other.clientId != null)
                return false;
        } else if (!clientId.equals(other.clientId))
            return false;
        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        if (topic == null) {
            if (other.topic != null)
                return false;
        } else if (!topic.equals(other.topic))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ConsumerRecordRequest [group=" + group + ", clientId=" + clientId + ", maxPollNum=" + maxPollNum
                + ", pollTag=" + pollTag + ", topic=" + topic + "]";
    }

}
