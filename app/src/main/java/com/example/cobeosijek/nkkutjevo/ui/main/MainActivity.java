package com.example.cobeosijek.nkkutjevo.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.ui.gallery.GalleryFragment;
import com.example.cobeosijek.nkkutjevo.ui.home.HomeFragment;
import com.example.cobeosijek.nkkutjevo.ui.news.NewsFragment;
import com.example.cobeosijek.nkkutjevo.ui.schedule.ScheduleFragment;
import com.example.cobeosijek.nkkutjevo.ui.team.fragments.TeamFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, MainView {

    private final MainPresenter presenter = new MainPresenterImpl();

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.navigation_view)
    NavigationView navigationView;

    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        presenter.setView(this);
        initUI();

        presenter.onViewReady();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    private void initUI() {
        initToolbar();
        initNavDrawer();
        initDrawerToggle();
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
    }

    private void initNavDrawer() {
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initDrawerToggle() {
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }

    private void setActionBarTitle(int title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void replaceFragments(int id, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(id, fragment)
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        presenter.onItemSelected(item.getItemId());
        return true;
    }

    @Override
    public void showScreenTitle(int screenTitle) {
        setActionBarTitle(screenTitle);
    }

    @Override
    public void showGalleryScreen() {
        replaceFragments(R.id.main_container, GalleryFragment.newInstance());
    }

    @Override
    public void showHomeScreen() {
        replaceFragments(R.id.main_container, HomeFragment.newInstance());
    }

    @Override
    public void showNewsScreen() {
        replaceFragments(R.id.main_container, NewsFragment.newInstance());
    }

    @Override
    public void showTeamScreen() {
        replaceFragments(R.id.main_container, TeamFragment.newInstance());
    }

    @Override
    public void showScheduleScreen() {
        replaceFragments(R.id.main_container, ScheduleFragment.newInstance());
    }

    @Override
    public void closeDrawer() {
        drawerLayout.closeDrawers();
    }
}
