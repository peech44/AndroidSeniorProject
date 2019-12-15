package com.example.project1.reg_api_current_enrollment;

import com.example.project1.reg_api_home.RegInfoHomeItems;

import java.util.ArrayList;
import java.util.List;

public class RegInfoEnrollmentDAO {

    private List<RegInfoEnrollmentItems> regInfoEnrollmentItemsList = new ArrayList<>();

    public List<RegInfoEnrollmentItems> getRegInfoEnrollmentItemsList() {
        return regInfoEnrollmentItemsList;
    }
}
