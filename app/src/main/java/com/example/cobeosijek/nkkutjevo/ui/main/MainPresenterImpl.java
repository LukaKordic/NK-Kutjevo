package com.example.cobeosijek.nkkutjevo.ui.main;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.DataUtils;
import com.example.cobeosijek.nkkutjevo.common.utils.RealmUtils;

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;

    @Override
    public void setView(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void onViewReady() {
        mainView.showHomeScreen();
        mainView.showScreenTitle(DataUtils.getScreenTitle(R.id.nav_header_home)); //show home
    }

    @Override
    public void onItemSelected(int id) {
        changeScreenTitle(id);

        switch (id) {
            case R.id.nav_header_home: {
                DataUtils.getScreenTitle(id);

                mainView.showHomeScreen();
                break;
            }

            case R.id.nav_header_news: {
                mainView.showNewsScreen();
                break;
            }

            case R.id.nav_header_gallery: {
                mainView.showGalleryScreen();
                break;
            }

            case R.id.nav_header_team: {
                mainView.showTeamScreen();
                break;
            }

            case R.id.nav_header_schedule: {
                mainView.showScheduleScreen();
                break;
            }
        }
        mainView.closeDrawer();
    }

    private void changeScreenTitle(int id) {
        int screenTitle = DataUtils.getScreenTitle(id);

        if (screenTitle != 0) {
            mainView.showScreenTitle(screenTitle);
        }
    }

    @Override
    public void saveDataIntoRealm() {
        RealmUtils.savePlayersIntoRealm();
    }
}
