package com.example.cobeosijek.nkkutjevo.ui.main;

public interface MainPresenter {

    void setView(MainView mainView);

    void onItemSelected(int id);

    void onViewReady();

    void saveDataIntoRealm();
}
