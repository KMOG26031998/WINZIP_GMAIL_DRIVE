package com.example.winzipgmaildrive;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;



public class MainActivityg extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayoutg;
    TextView tvinfog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityg);

        Toolbar tool=(Toolbar)findViewById(R.id.Toolg);
        setSupportActionBar(tool);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView navigationVie=(NavigationView) findViewById(R.id.nav_viewg);
        navigationVie.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayoutg = (DrawerLayout)findViewById(R.id.drawer_layoutg);
                drawerLayoutg.openDrawer(GravityCompat.START);
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
        drawerLayoutg.closeDrawer(GravityCompat.START);
    }
    private void openDrawer(){
        if(drawerLayoutg.isDrawerOpen(GravityCompat.START)){
            closeDrawer();
        }
        super.onBackPressed();
    }
}