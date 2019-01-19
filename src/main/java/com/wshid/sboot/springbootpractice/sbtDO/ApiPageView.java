package com.wshid.sboot.springbootpractice.sbtDO;

/**
 * Project:  spring-boot-practice
 * Author :  wshid(kso4013@gmail.com)
 * GitHub : https://github.com/Wshid
 * Date :  2019-01-19 16:45
 */
public class ApiPageView {
    private String sid;
    private String cid;
    private String attr1;
    private String attr2;
    private String processTimestamp;

    public ApiPageView(String sid, String cid, String attr1, String attr2, String processTimestamp) {
        this.sid = sid;
        this.cid = cid;
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.processTimestamp = processTimestamp;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getProcessTimestamp() {
        return processTimestamp;
    }

    public void setProcessTimestamp(String processTimestamp) {
        this.processTimestamp = processTimestamp;
    }
}
