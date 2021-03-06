package com.example.winzipgmaildrive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivityd extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayoutd;
    TextView tvinfod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityd);

        Toolbar toold=(Toolbar)findViewById(R.id.Toold);
        setSupportActionBar(toold);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView=(NavigationView) findViewById(R.id.nav_viewd);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayoutd = (DrawerLayout)findViewById(R.id.drawer_layoutd);
                drawerLayoutd.openDrawer(GravityCompat.START);
                return true;
                default:
               return super.onOptionsItemSelected(item);

        }

    }

    @Override
    public boolean onNavigationItemSelected(  MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.item_a:
                break;

        }
        return true;
    }

    private void closeDrawer() {
        drawerLayoutd.closeDrawer(GravityCompat.START);
    }
    private void openDrawer(){
        if(drawerLayoutd.isDrawerOpen(GravityCompat.START)){
            closeDrawer();
        }
        super.onBackPressed();
    }
}