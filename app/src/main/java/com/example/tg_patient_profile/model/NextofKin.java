package com.example.tg_patient_profile.model;

public class NextofKin {
    String first_name, middle_name, last_name, home_address , mobile_phone, email_address, photo;

    public NextofKin(String first_name, String middle_name, String last_name, String home_address, String mobile_phone, String email_address, String photo) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.home_address = home_address;
        this.mobile_phone = mobile_phone;
        this.email_address = email_address;
        this.photo = photo;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    @Override
    public String toString() {
        return "NextofKin{" +
                "first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", home_address='" + home_address + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", email_address='" + email_address + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
