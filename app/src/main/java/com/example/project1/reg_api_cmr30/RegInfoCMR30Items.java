package com.example.project1.reg_api_cmr30;

import com.google.gson.annotations.SerializedName;

public class RegInfoCMR30Items {

    /*@SerializedName("id") private String id;
    @SerializedName("COURSENO") private String COURSENO;
    @SerializedName("TITLE") private String TITLE;
    @SerializedName("SECLEC") private String SECLEC;
    @SerializedName("SECLAB") private String SECLAB;
    @SerializedName("CRELEC") private String CRELEC;
    @SerializedName("CRELAB") private String CRELAB;
    @SerializedName("PRACTIC") private String PRACTIC;
    @SerializedName("PRE1") private String PRE1;
    @SerializedName("PRE2") private String PRE2;
    @SerializedName("DAYLEC") private String DAYLEC;
    @SerializedName("BTLEC") private String BTLEC;
    @SerializedName("FTLEC") private String FTLEC;
    @SerializedName("ROOM") private String ROOM;
    @SerializedName("INSTRUC") private String INSTRUC;
    @SerializedName("PRE_REGIST") private String PRE_REGIST;
    @SerializedName("MAX_REGIST") private String MAX_REGIST;*/

    @SerializedName("ID") private String ID;
    @SerializedName("YEAR") private String YEAR;
    @SerializedName("SEMESTER") private String SEMESTER;
    @SerializedName("COURSENO") private String COURSENO;
    @SerializedName("TITLE") private String TITLE;
    @SerializedName("SECLEC") private String SECLEC;
    @SerializedName("SECLAB") private String SECLAB;
    @SerializedName("CRELEC") private String CRELEC;
    @SerializedName("CRELAB") private String CRELAB;
    @SerializedName("PRACTIC") private String PRACTIC;
    @SerializedName("DAYLEC_1") private String DAYLEC_1;
    @SerializedName("DAYLEC_2") private String DAYLEC_2;
    @SerializedName("DAYLEC_3") private  String DAYLEC_3;
    @SerializedName("BTLEC_1") private  String BTLEC_1;
    @SerializedName("BTLEC_2") private  String BTLEC_2;
    @SerializedName("BTLEC_3") private  String BTLEC_3;
    @SerializedName("FTLEC_1") private  String FTLEC_1;
    @SerializedName("FTLEC_2") private  String FTLEC_2;
    @SerializedName("FTLEC_3") private  String FTLEC_3;
    @SerializedName("ROOM") private  String ROOM;
    @SerializedName("INSTRUC_1") private  String INSTRUC_1;
    @SerializedName("INSTRUC_2") private  String INSTRUC_2;
    @SerializedName("INSTRUC_3") private  String INSTRUC_3;
    @SerializedName("MAX_REGIST") private  String MAX_REGIST;


    public RegInfoCMR30Items(String ID, String YEAR, String SEMESTER, String COURSENO, String TITLE, String SECLEC, String SECLAB, String CRELEC, String CRELAB, String PRACTIC, String DAYLEC_1, String DAYLEC_2, String DAYLEC_3, String BTLEC_1, String BTLEC_2, String BTLEC_3, String FTLEC_1, String FTLEC_2, String FTLEC_3, String ROOM, String INSTRUC_1, String INSTRUC_2, String INSTRUC_3, String MAX_REGIST) {
        this.ID = ID;
        this.YEAR = YEAR;
        this.SEMESTER = SEMESTER;
        this.COURSENO = COURSENO;
        this.TITLE = TITLE;
        this.SECLEC = SECLEC;
        this.SECLAB = SECLAB;
        this.CRELEC = CRELEC;
        this.CRELAB = CRELAB;
        this.PRACTIC = PRACTIC;
        this.DAYLEC_1 = DAYLEC_1;
        this.DAYLEC_2 = DAYLEC_2;
        this.DAYLEC_3 = DAYLEC_3;
        this.BTLEC_1 = BTLEC_1;
        this.BTLEC_2 = BTLEC_2;
        this.BTLEC_3 = BTLEC_3;
        this.FTLEC_1 = FTLEC_1;
        this.FTLEC_2 = FTLEC_2;
        this.FTLEC_3 = FTLEC_3;
        this.ROOM = ROOM;
        this.INSTRUC_1 = INSTRUC_1;
        this.INSTRUC_2 = INSTRUC_2;
        this.INSTRUC_3 = INSTRUC_3;
        this.MAX_REGIST = MAX_REGIST;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public String getSEMESTER() {
        return SEMESTER;
    }

    public void setSEMESTER(String SEMESTER) {
        this.SEMESTER = SEMESTER;
    }

    public String getCOURSENO() {
        return COURSENO;
    }

    public void setCOURSENO(String COURSENO) {
        this.COURSENO = COURSENO;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getSECLEC() {
        return SECLEC;
    }

    public void setSECLEC(String SECLEC) {
        this.SECLEC = SECLEC;
    }

    public String getSECLAB() {
        return SECLAB;
    }

    public void setSECLAB(String SECLAB) {
        this.SECLAB = SECLAB;
    }

    public String getCRELEC() {
        return CRELEC;
    }

    public void setCRELEC(String CRELEC) {
        this.CRELEC = CRELEC;
    }

    public String getCRELAB() {
        return CRELAB;
    }

    public void setCRELAB(String CRELAB) {
        this.CRELAB = CRELAB;
    }

    public String getPRACTIC() {
        return PRACTIC;
    }

    public void setPRACTIC(String PRACTIC) {
        this.PRACTIC = PRACTIC;
    }

    public String getDAYLEC_1() {
        return DAYLEC_1;
    }

    public void setDAYLEC_1(String DAYLEC_1) {
        this.DAYLEC_1 = DAYLEC_1;
    }

    public String getDAYLEC_2() {
        return DAYLEC_2;
    }

    public void setDAYLEC_2(String DAYLEC_2) {
        this.DAYLEC_2 = DAYLEC_2;
    }

    public String getDAYLEC_3() {
        return DAYLEC_3;
    }

    public void setDAYLEC_3(String DAYLEC_3) {
        this.DAYLEC_3 = DAYLEC_3;
    }

    public String getBTLEC_1() {
        return BTLEC_1;
    }

    public void setBTLEC_1(String BTLEC_1) {
        this.BTLEC_1 = BTLEC_1;
    }

    public String getBTLEC_2() {
        return BTLEC_2;
    }

    public void setBTLEC_2(String BTLEC_2) {
        this.BTLEC_2 = BTLEC_2;
    }

    public String getBTLEC_3() {
        return BTLEC_3;
    }

    public void setBTLEC_3(String BTLEC_3) {
        this.BTLEC_3 = BTLEC_3;
    }

    public String getFTLEC_1() {
        return FTLEC_1;
    }

    public void setFTLEC_1(String FTLEC_1) {
        this.FTLEC_1 = FTLEC_1;
    }

    public String getFTLEC_2() {
        return FTLEC_2;
    }

    public void setFTLEC_2(String FTLEC_2) {
        this.FTLEC_2 = FTLEC_2;
    }

    public String getFTLEC_3() {
        return FTLEC_3;
    }

    public void setFTLEC_3(String FTLEC_3) {
        this.FTLEC_3 = FTLEC_3;
    }

    public String getROOM() {
        return ROOM;
    }

    public void setROOM(String ROOM) {
        this.ROOM = ROOM;
    }

    public String getINSTRUC_1() {
        return INSTRUC_1;
    }

    public void setINSTRUC_1(String INSTRUC_1) {
        this.INSTRUC_1 = INSTRUC_1;
    }

    public String getINSTRUC_2() {
        return INSTRUC_2;
    }

    public void setINSTRUC_2(String INSTRUC_2) {
        this.INSTRUC_2 = INSTRUC_2;
    }

    public String getINSTRUC_3() {
        return INSTRUC_3;
    }

    public void setINSTRUC_3(String INSTRUC_3) {
        this.INSTRUC_3 = INSTRUC_3;
    }

    public String getMAX_REGIST() {
        return MAX_REGIST;
    }

    public void setMAX_REGIST(String MAX_REGIST) {
        this.MAX_REGIST = MAX_REGIST;
    }
}
