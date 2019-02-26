package com.example.emywx.databindingdemo;

public interface MainActivityContract {

    public interface Presenter{
        void onShowData(User user);
    }

    public interface View{
        void showData(User user);
    }
}
