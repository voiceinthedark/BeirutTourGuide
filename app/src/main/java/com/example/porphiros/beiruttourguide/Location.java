package com.example.porphiros.beiruttourguide;

/**
 * Class {@link Location} holds the information needed about restaurants, events, public places
 * etc. for the Tour guide app
 */
public class Location {
    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    /**
     * Name of the restaurant, public place, event
     */
    private String mName;
    private String mAddress;
    private String mPhone;
    private String mDescription;

    //TODO: Add image resource field

    /**
     * private default constructor fills members with Builder fields
     * @param builder
     */
    private Location(Builder builder){
        this.mName = builder.name;
        mAddress = builder.mPlaceAddress;
        mPhone = builder.mPhone;
        mDescription = builder.mDescription;
    }

    /**
     * Inner static Builder class
     */
    public static class Builder{
        //required
        private final String name;

        //optional fields
        private String mPlaceAddress = "N/A";
        private String mPhone = "N/A";
        private String mDescription = "N/A";

        public Builder(String name){
            this.name = name;
        }

        public Builder address(String the_address){
            mPlaceAddress = the_address;
            return this;
        }

        public Builder phoneNb(String the_phone){
            mPhone = the_phone;
            return this;
        }

        public Builder description(String the_description){
            mDescription = the_description;
            return this;
        }

        public Location build(){
            return new Location(this);
        }

    } /*end of builder inner class*/




}
