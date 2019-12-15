package com.example.project1.reg_api_student;

import com.google.gson.annotations.SerializedName;

public class RegInfoStudentItems {


    @SerializedName("student_id") private String student_id;
    @SerializedName("student_prefix") private String student_prefix;
    @SerializedName("name_th") private String name_th;
    @SerializedName("middle_name_th") private String middle_name_th;
    @SerializedName("surname_th") private String surname_th;
    @SerializedName("name_en") private String name_en;
    @SerializedName("middle_name_en") private String middle_name_en;
    @SerializedName("surname_en") private String surname_en;
    @SerializedName("faculty_id") private String faculty_id;
    @SerializedName("major_id") private String major_id;
    @SerializedName("curriculum_id") private String curriculum_id;
    @SerializedName("level_id") private String level_id;
    @SerializedName("sex_id") private String sex_id;
    @SerializedName("major_name_th") private String major_name_th;
    @SerializedName("level_name_th") private String level_name_th;
    @SerializedName("degree_name_long_th") private String degree_name_long_th;
    @SerializedName("plan_id") private String plan_id;
    @SerializedName("plan_name_th") private String plan_name_th;
    @SerializedName("race_id") private String race_id;
    @SerializedName("nationality_id") private String nationality_id;
    @SerializedName("religion_id") private String religion_id;
    @SerializedName("date_admit") private String date_admit;
    @SerializedName("semester_admit") private String semester_admit;
    @SerializedName("year_admit") private String year_admit;
    @SerializedName("study_time_id") private String study_time_id;
    @SerializedName("adviser_id") private String adviser_id;
    @SerializedName("adviser_name") private String adviser_name;
    @SerializedName("adviser_cmu_account") private String adviser_cmu_account;

    public RegInfoStudentItems(String student_id, String student_prefix, String name_th, String middle_name_th, String surname_th, String name_en, String middle_name_en, String surname_en, String faculty_id, String major_id, String curriculum_id, String level_id, String sex_id, String major_name_th, String level_name_th, String degree_name_long_th, String plan_id, String plan_name_th, String race_id, String nationality_id, String religion_id, String date_admit, String semester_admit, String year_admit, String study_time_id, String adviser_id, String adviser_name, String adviser_cmu_account) {
        this.student_id = student_id;
        this.student_prefix = student_prefix;
        this.name_th = name_th;
        this.middle_name_th = middle_name_th;
        this.surname_th = surname_th;
        this.name_en = name_en;
        this.middle_name_en = middle_name_en;
        this.surname_en = surname_en;
        this.faculty_id = faculty_id;
        this.major_id = major_id;
        this.curriculum_id = curriculum_id;
        this.level_id = level_id;
        this.sex_id = sex_id;
        this.major_name_th = major_name_th;
        this.level_name_th = level_name_th;
        this.degree_name_long_th = degree_name_long_th;
        this.plan_id = plan_id;
        this.plan_name_th = plan_name_th;
        this.race_id = race_id;
        this.nationality_id = nationality_id;
        this.religion_id = religion_id;
        this.date_admit = date_admit;
        this.semester_admit = semester_admit;
        this.year_admit = year_admit;
        this.study_time_id = study_time_id;
        this.adviser_id = adviser_id;
        this.adviser_name = adviser_name;
        this.adviser_cmu_account = adviser_cmu_account;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_prefix() {
        return student_prefix;
    }

    public void setStudent_prefix(String student_prefix) {
        this.student_prefix = student_prefix;
    }

    public String getName_th() {
        return name_th;
    }

    public void setName_th(String name_th) {
        this.name_th = name_th;
    }

    public String getMiddle_name_th() {
        return middle_name_th;
    }

    public void setMiddle_name_th(String middle_name_th) {
        this.middle_name_th = middle_name_th;
    }

    public String getSurname_th() {
        return surname_th;
    }

    public void setSurname_th(String surname_th) {
        this.surname_th = surname_th;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getMiddle_name_en() {
        return middle_name_en;
    }

    public void setMiddle_name_en(String middle_name_en) {
        this.middle_name_en = middle_name_en;
    }

    public String getSurname_en() {
        return surname_en;
    }

    public void setSurname_en(String surname_en) {
        this.surname_en = surname_en;
    }

    public String getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }

    public String getCurriculum_id() {
        return curriculum_id;
    }

    public void setCurriculum_id(String curriculum_id) {
        this.curriculum_id = curriculum_id;
    }

    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public String getSex_id() {
        return sex_id;
    }

    public void setSex_id(String sex_id) {
        this.sex_id = sex_id;
    }

    public String getMajor_name_th() {
        return major_name_th;
    }

    public void setMajor_name_th(String major_name_th) {
        this.major_name_th = major_name_th;
    }

    public String getLevel_name_th() {
        return level_name_th;
    }

    public void setLevel_name_th(String level_name_th) {
        this.level_name_th = level_name_th;
    }

    public String getDegree_name_long_th() {
        return degree_name_long_th;
    }

    public void setDegree_name_long_th(String degree_name_long_th) {
        this.degree_name_long_th = degree_name_long_th;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getPlan_name_th() {
        return plan_name_th;
    }

    public void setPlan_name_th(String plan_name_th) {
        this.plan_name_th = plan_name_th;
    }

    public String getRace_id() {
        return race_id;
    }

    public void setRace_id(String race_id) {
        this.race_id = race_id;
    }

    public String getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(String nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getReligion_id() {
        return religion_id;
    }

    public void setReligion_id(String religion_id) {
        this.religion_id = religion_id;
    }

    public String getDate_admit() {
        return date_admit;
    }

    public void setDate_admit(String date_admit) {
        this.date_admit = date_admit;
    }

    public String getSemester_admit() {
        return semester_admit;
    }

    public void setSemester_admit(String semester_admit) {
        this.semester_admit = semester_admit;
    }

    public String getYear_admit() {
        return year_admit;
    }

    public void setYear_admit(String year_admit) {
        this.year_admit = year_admit;
    }

    public String getStudy_time_id() {
        return study_time_id;
    }

    public void setStudy_time_id(String study_time_id) {
        this.study_time_id = study_time_id;
    }

    public String getAdviser_id() {
        return adviser_id;
    }

    public void setAdviser_id(String adviser_id) {
        this.adviser_id = adviser_id;
    }

    public String getAdviser_name() {
        return adviser_name;
    }

    public void setAdviser_name(String adviser_name) {
        this.adviser_name = adviser_name;
    }

    public String getAdviser_cmu_account() {
        return adviser_cmu_account;
    }

    public void setAdviser_cmu_account(String adviser_cmu_account) {
        this.adviser_cmu_account = adviser_cmu_account;
    }
}
