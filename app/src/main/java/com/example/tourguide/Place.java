package com.example.tourguide;

public class Place {

    private String mPlaceName;
    private int mImagePlace;
    private String mPlaceAddress;
    private String mPlaceDescription;

    public Place(String placeName, Integer imagePlace, String placeAddress,
                 String placeDescription) {
        mPlaceName = placeName;
        mImagePlace = imagePlace;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public Integer getPlaceImage() {
        return mImagePlace;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

}


