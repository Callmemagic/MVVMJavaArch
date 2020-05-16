package com.joe.taiwandelicacies.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public class RestaurantMerchantInfoBean {
    @SerializedName("Id")
    private String Id;

    @SerializedName("Name")
    private String Name;

    @SerializedName("Description")
    private String Description;

    @SerializedName("Add")
    private String Add;

    @SerializedName("Zipcode")
    private String Zipcode;

    @SerializedName("Region")
    private String Region;

    @SerializedName("Town")
    private String Town;

    @SerializedName("Tel")
    private String Tel;

    @SerializedName("Opentime")
    private String Opentime;

    @SerializedName("Website")
    private String Website;

    @SerializedName("Picture1")
    private String Picture1;

    @SerializedName("Picdescribe1")
    private String Picdescribe1;

    @SerializedName("Picture2")
    private String Picture2;

    @SerializedName("Picdescribe2")
    private String Picdescribe2;

    @SerializedName("Picture3")
    private String Picture3;

    @SerializedName("Picdescribe3")
    private String Picdescribe3;

    @SerializedName("Px")
    private String Px;

    @SerializedName("Py")
    private String Py;

    @SerializedName("Class")
    private String Class;

    @SerializedName("Map")
    private String Map;

    @SerializedName("Parkinginfo")
    private String Parkinginfo;

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getAdd() {
        return Add;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public String getRegion() {
        return Region;
    }

    public String getTown() {
        return Town;
    }

    public String getTel() {
        return Tel;
    }

    public String getOpentime() {
        return Opentime;
    }

    public String getWebsite() {
        return Website;
    }

    public String getPicture1() {
        return Picture1;
    }

    public String getPicdescribe1() {
        return Picdescribe1;
    }

    public String getPicture2() {
        return Picture2;
    }

    public String getPicdescribe2() {
        return Picdescribe2;
    }

    public String getPicture3() {
        return Picture3;
    }

    public String getPicdescribe3() {
        return Picdescribe3;
    }

    public String getPx() {
        return Px;
    }

    public String getPy() {
        return Py;
    }

    public String getMap() {
        return Map;
    }

    public String getParkinginfo() {
        return Parkinginfo;
    }
}
