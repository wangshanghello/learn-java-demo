package com.goku.druid.demo.model;

import java.util.Date;

public class gokuTranlog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_tranlog.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_tranlog.bscode
     *
     * @mbg.generated
     */
    private String bscode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_tranlog.tranno
     *
     * @mbg.generated
     */
    private String tranno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_tranlog.startdate
     *
     * @mbg.generated
     */
    private Date startdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goku_tranlog.enddate
     *
     * @mbg.generated
     */
    private Date enddate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_tranlog.userid
     *
     * @return the value of goku_tranlog.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_tranlog.userid
     *
     * @param userid the value for goku_tranlog.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_tranlog.bscode
     *
     * @return the value of goku_tranlog.bscode
     *
     * @mbg.generated
     */
    public String getBscode() {
        return bscode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_tranlog.bscode
     *
     * @param bscode the value for goku_tranlog.bscode
     *
     * @mbg.generated
     */
    public void setBscode(String bscode) {
        this.bscode = bscode == null ? null : bscode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_tranlog.tranno
     *
     * @return the value of goku_tranlog.tranno
     *
     * @mbg.generated
     */
    public String getTranno() {
        return tranno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_tranlog.tranno
     *
     * @param tranno the value for goku_tranlog.tranno
     *
     * @mbg.generated
     */
    public void setTranno(String tranno) {
        this.tranno = tranno == null ? null : tranno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_tranlog.startdate
     *
     * @return the value of goku_tranlog.startdate
     *
     * @mbg.generated
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_tranlog.startdate
     *
     * @param startdate the value for goku_tranlog.startdate
     *
     * @mbg.generated
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goku_tranlog.enddate
     *
     * @return the value of goku_tranlog.enddate
     *
     * @mbg.generated
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goku_tranlog.enddate
     *
     * @param enddate the value for goku_tranlog.enddate
     *
     * @mbg.generated
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}