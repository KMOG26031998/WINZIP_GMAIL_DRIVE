package com.example.winzipgmaildrive;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ActionMenuView;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
 DrawerLayout drawerLayout;
 TextView tvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar tool=(Toolbar)findViewById(R.id.Tool);
        setSupportActionBar(tool);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView navigationView=(NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
   }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            default:

        return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(  MenuItem menuItem) {
      String itemName=(String) menuItem.getTitle();
      tvinfo.setText(itemName);

      closeDrawer();
      switch (menuItem.getItemId()){
          case R.id.item_a:
              break;
          case R.id.item_b:
              break;
      }
        return true;
    }

    private void closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }
    private void openDrawer(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            closeDrawer();
        }
        super.onBackPressed();
    }

}