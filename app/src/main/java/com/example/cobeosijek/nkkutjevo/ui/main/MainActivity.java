package com.example.cobeosijek.nkkutjevo.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.ui.fragments.GalleryFragment;
import com.example.cobeosijek.nkkutjevo.ui.fragments.HomeFragment;
import com.example.cobeosijek.nkkutjevo.ui.fragments.NewsFragment;
import com.example.cobeosijek.nkkutjevo.ui.fragments.ScheduleFragment;
import com.example.cobeosijek.nkkutjevo.ui.fragments.TeamFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Toolbar toolbar;
    private FragmentTransaction fragmentTransaction;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setupHomeFragment();
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

    private void setupHomeFragment() {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, new HomeFragment());
        fragmentTransaction.commit();
        setActionBarTitle(R.string.nav_home_title);
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initNavDrawer() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

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
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // presenter.onItemSelected(item.getItemId());

        switch (item.getItemId()) {

            case R.id.nav_home:
                replaceFragments(R.id.main_container, new HomeFragment());
                setActionBarTitle(R.string.nav_home_title);
                break;

            case R.id.nav_header_news:
                replaceFragments(R.id.main_container, new NewsFragment());
                setActionBarTitle(R.string.nav_news_title);
                break;

            case R.id.nav_header_gallery:
                replaceFragments(R.id.main_container, new GalleryFragment());
                setActionBarTitle(R.string.nav_gallery_title);
                break;

            case R.id.nav_header_team:
                replaceFragments(R.id.main_container, new TeamFragment());
                setActionBarTitle(R.string.nav_team_title);
                break;

            case R.id.nav_header_schedule:
                replaceFragments(R.id.main_container, new ScheduleFragment());
                setActionBarTitle(R.string.nav_schedule_title);
                break;
        }

        item.setChecked(true);
        return true;
    }

    public void closeNavigationDrawer() {
        drawerLayout.closeDrawers();
    }

    public void showHomeScreen() {

    }
}
