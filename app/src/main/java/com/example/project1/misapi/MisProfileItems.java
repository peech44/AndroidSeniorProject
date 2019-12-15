package com.example.project1.misapi;

import com.google.gson.annotations.SerializedName;

public class MisProfileItems {

    @SerializedName("cmuitaccount_name") private String cmuitaccount_name;
    @SerializedName("cmuitaccount")private String cmuitaccount;
    @SerializedName("student_id")private String student_id;
    @SerializedName("prename_id")private String prename_id;
    @SerializedName("prename_TH")private String prename_TH;
    @SerializedName("prename_EN")private String prename_EN;
    @SerializedName("firstname_TH")private String firstname_TH;
    @SerializedName("firstname_EN")private String firstname_EN;
    @SerializedName("lastname_TH")private String lastname_TH;
    @SerializedName("lastname_EN")private String lastname_EN;
    @SerializedName("organization_code")private String organization_code;
    @SerializedName("organization_name_TH")private String organization_name_TH;
    @SerializedName("organization_name_EN")private String organization_name_EN;
    @SerializedName("itaccounttype_id")private String itaccounttype_id;
    @SerializedName("itaccounttype_TH")private String itaccounttype_TH;
    @SerializedName("itaccounttype_EN")private String itaccounttype_EN;

    @SerializedName("ACCESS-TOKEN") private String accToken;


    public MisProfileItems(String accToken) {
        this.accToken = accToken;
    }

    public MisProfileItems(String cmuitaccount_name, String cmuitaccount, String student_id, String prename_id, String prename_TH, String prename_EN, String firstname_TH, String firstname_EN, String lastname_TH, String lastname_EN, String organization_code, String organization_name_TH, String organization_name_EN, String itaccounttype_id, String itaccounttype_TH, String itaccounttype_EN) {
        this.cmuitaccount_name = cmuitaccount_name;
        this.cmuitaccount = cmuitaccount;
        this.student_id = student_id;
        this.prename_id = prename_id;
        this.prename_TH = prename_TH;
        this.prename_EN = prename_EN;
        this.firstname_TH = firstname_TH;
        this.firstname_EN = firstname_EN;
        this.lastname_TH = lastname_TH;
        this.lastname_EN = lastname_EN;
        this.organization_code = organization_code;
        this.organization_name_TH = organization_name_TH;
        this.organization_name_EN = organization_name_EN;
        this.itaccounttype_id = itaccounttype_id;
        this.itaccounttype_TH = itaccounttype_TH;
        this.itaccounttype_EN = itaccounttype_EN;
    }


    public String getCmuitaccount_name() {
        return cmuitaccount_name;
    }

    public String getCmuitaccount() {
        return cmuitaccount;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getPrename_id() {
        return prename_id;
    }

    public String getPrename_TH() {
        return prename_TH;
    }

    public String getPrename_EN() {
        return prename_EN;
    }

    public String getFirstname_TH() {
        return firstname_TH;
    }

    public String getFirstname_EN() {
        return firstname_EN;
    }

    public String getLastname_TH() {
        return lastname_TH;
    }

    public String getLastname_EN() {
        return lastname_EN;
    }

    public String getOrganization_code() {
        return organization_code;
    }

    public String getOrganization_name_TH() {
        return organization_name_TH;
    }

    public String getOrganization_name_EN() {
        return organization_name_EN;
    }

    public String getItaccounttype_id() {
        return itaccounttype_id;
    }

    public String getItaccounttype_TH() {
        return itaccounttype_TH;
    }

    public String getItaccounttype_EN() {
        return itaccounttype_EN;
    }



    ///


    public String getAccToken() {
        return accToken;
    }
}
