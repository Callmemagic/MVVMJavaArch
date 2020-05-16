package com.joe.taiwandelicacies.model;

import com.google.gson.annotations.SerializedName;

/**
 * author: Joe Cheng
 */
public class RestaurantBean {
    @SerializedName("Listname")
    private String Listname;

    @SerializedName("Language")
    private String Language;

    @SerializedName("Orgname")
    private String Orgname;

    @SerializedName("Updatetime")
    private String Updatetime;

    @SerializedName("Infos")
    private RestaurantInfoBean alInfo;

    public String getListname() {
        return Listname;
    }

    public void setListname(String listname) {
        Listname = listname;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getOrgname() {
        return Orgname;
    }

    public void setOrgname(String orgname) {
        Orgname = orgname;
    }

    public String getUpdatetime() {
        return Updatetime;
    }

    public void setUpdatetime(String updatetime) {
        Updatetime = updatetime;
    }

    public RestaurantInfoBean getAlInfo() {
        return alInfo;
    }
}
