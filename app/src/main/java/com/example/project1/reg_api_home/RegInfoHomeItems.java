package com.example.project1.reg_api_home;

import com.google.gson.annotations.SerializedName;

public class RegInfoHomeItems {


    /*@SerializedName("acad_id") private String acad_id;
    @SerializedName("ID") private String ID;
    @SerializedName("TRM") private String TRM;
    @SerializedName("COURSENO") private String COURSENO;
    @SerializedName("TITLE") private String TITLE;
    @SerializedName("CREDIT") private String CREDIT;
    @SerializedName("GRADE") private String GRADE;*/

    @SerializedName("id") private  String id;
    @SerializedName("year") private String year;
    @SerializedName("semester") private String semester;
    @SerializedName("student_id") private String student_id;
    @SerializedName("a_credit") private String a_credit;
    @SerializedName("e_credit") private String e_credit;
    @SerializedName("c_credit") private String c_credit;
    @SerializedName("gpa") private String gpa;
    @SerializedName("oa_credit") private String oa_credit;
    @SerializedName("oe_credit") private String oe_credit;
    @SerializedName("oc_credit") private String oc_credit;
    @SerializedName("gpa_grad") private String gpa_grad;
    @SerializedName("e_credit_grad") private String e_credit_grad;

    public RegInfoHomeItems() {
    }

    public RegInfoHomeItems(String id, String year, String semester, String student_id, String a_credit, String e_credit, String c_credit, String gpa, String oa_credit, String oe_credit, String oc_credit, String gpa_grad, String e_credit_grad) {
        this.id = id;
        this.year = year;
        this.semester = semester;
        this.student_id = student_id;
        this.a_credit = a_credit;
        this.e_credit = e_credit;
        this.c_credit = c_credit;
        this.gpa = gpa;
        this.oa_credit = oa_credit;
        this.oe_credit = oe_credit;
        this.oc_credit = oc_credit;
        this.gpa_grad = gpa_grad;
        this.e_credit_grad = e_credit_grad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getA_credit() {
        return a_credit;
    }

    public void setA_credit(String a_credit) {
        this.a_credit = a_credit;
    }

    public String getE_credit() {
        return e_credit;
    }

    public void setE_credit(String e_credit) {
        this.e_credit = e_credit;
    }

    public String getC_credit() {
        return c_credit;
    }

    public void setC_credit(String c_credit) {
        this.c_credit = c_credit;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getOa_credit() {
        return oa_credit;
    }

    public void setOa_credit(String oa_credit) {
        this.oa_credit = oa_credit;
    }

    public String getOe_credit() {
        return oe_credit;
    }

    public void setOe_credit(String oe_credit) {
        this.oe_credit = oe_credit;
    }

    public String getOc_credit() {
        return oc_credit;
    }

    public void setOc_credit(String oc_credit) {
        this.oc_credit = oc_credit;
    }

    public String getGpa_grad() {
        return gpa_grad;
    }

    public void setGpa_grad(String gpa_grad) {
        this.gpa_grad = gpa_grad;
    }

    public String getE_credit_grad() {
        return e_credit_grad;
    }

    public void setE_credit_grad(String e_credit_grad) {
        this.e_credit_grad = e_credit_grad;
    }
}
