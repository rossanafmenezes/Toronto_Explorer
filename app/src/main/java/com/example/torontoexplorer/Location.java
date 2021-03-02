package com.example.torontoexplorer;

public class Location {

    private String mLocationName;

    private String mLocationInfo;

    private int mImageResourceId;


    public Location (String locationName, String locationInfo, int imageResourceId) {
        mLocationName = locationName;
        mLocationInfo = locationInfo;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationInfo() {
        return mLocationInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}

