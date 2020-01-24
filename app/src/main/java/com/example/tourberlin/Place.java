package com.example.tourberlin;


public class Place {

    private String mPlaceName;
    private int mImageResourceId;


    public Place(String placeName, int imageResourceId){
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }


    public String getPlaceName(){
        return mPlaceName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}

