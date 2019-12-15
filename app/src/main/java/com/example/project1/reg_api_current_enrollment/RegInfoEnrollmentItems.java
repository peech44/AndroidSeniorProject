package com.example.project1.reg_api_current_enrollment;

import com.google.gson.annotations.SerializedName;

public class RegInfoEnrollmentItems {

   /* @SerializedName("reg_id") private String reg_id;
    @SerializedName("ID") private String ID;
    @SerializedName("COURSENO") private String COURSENO;
    @SerializedName("SECTION") private String SECTION;
    @SerializedName("SECLEC") private String SECLEC;
    @SerializedName("SECLAB") private String SECLAB;
    @SerializedName("INSTRU") private String INSTRU;*/

    @SerializedName("ID") private String ID;
    @SerializedName("YEAR") private String YEAR;
    @SerializedName("SEMESTER") private String SEMESTER;
    @SerializedName("COURSE_ID") private String COURSE_ID;
    @SerializedName("COURSENO") private String COURSENO;
    @SerializedName("SECTION") private String SECTION;
    @SerializedName("SECLEC") private String SECLEC;
    @SerializedName("SECLAB") private String SECLAB;
    @SerializedName("STUDENT_ID") private String STUDENT_ID;
    @SerializedName("GRADE") private String GRADE;


    public RegInfoEnrollmentItems(String ID, String YEAR, String SEMESTER, String COURSE_ID, String COURSENO, String SECTION, String SECLEC, String SECLAB, String STUDENT_ID, String GRADE) {
        this.ID = ID;
        this.YEAR = YEAR;
        this.SEMESTER = SEMESTER;
        this.COURSE_ID = COURSE_ID;
        this.COURSENO = COURSENO;
        this.SECTION = SECTION;
        this.SECLEC = SECLEC;
        this.SECLAB = SECLAB;
        this.STUDENT_ID = STUDENT_ID;
        this.GRADE = GRADE;
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

    public String getCOURSE_ID() {
        return COURSE_ID;
    }

    public void setCOURSE_ID(String COURSE_ID) {
        this.COURSE_ID = COURSE_ID;
    }

    public String getCOURSENO() {
        return COURSENO;
    }

    public void setCOURSENO(String COURSENO) {
        this.COURSENO = COURSENO;
    }

    public String getSECTION() {
        return SECTION;
    }

    public void setSECTION(String SECTION) {
        this.SECTION = SECTION;
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

    public String getSTUDENT_ID() {
        return STUDENT_ID;
    }

    public void setSTUDENT_ID(String STUDENT_ID) {
        this.STUDENT_ID = STUDENT_ID;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }
}
