package com.binwang.frontOfBinwang.common.bean.httpBean;

/**
 * Created by owen on 17/7/19.
 */
public class JsApiTicket {
    private String ticket;
    private int expires_in;
    private String errcode;
    private String errmsg;

    public JsApiTicket() {
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
