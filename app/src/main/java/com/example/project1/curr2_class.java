package com.example.project1;

import java.util.ArrayList;

public class curr2_class {

    private ArrayList<String> CollectCourseClass = new ArrayList<String>();
    private ArrayList<String> CollectCourseNotPassClass = new ArrayList<String>();

    public curr2_class() {

    }

    public curr2_class(ArrayList<String> collectCourseClass, ArrayList<String> collectCourseNotPassClass) {
        CollectCourseClass = collectCourseClass;
        CollectCourseNotPassClass = collectCourseNotPassClass;
    }

    public ArrayList<String> getCollectCourseClass() {
        return CollectCourseClass;
    }

    public void setCollectCourseClass(ArrayList<String> collectCourseClass) {
        CollectCourseClass = collectCourseClass;
    }

    public ArrayList<String> getCollectCourseNotPassClass() {
        return CollectCourseNotPassClass;
    }

    public void setCollectCourseNotPassClass(ArrayList<String> collectCourseNotPassClass) {
        CollectCourseNotPassClass = collectCourseNotPassClass;
    }
}
