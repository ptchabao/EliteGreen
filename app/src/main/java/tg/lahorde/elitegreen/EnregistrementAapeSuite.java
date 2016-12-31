package tg.lahorde.elitegreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by pondikpa on 19/12/16.
 */

public class EnregistrementAapeSuite extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    Button enregistrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enregistrement_aape_suite);
        enregistrer=((Button)findViewById(R.id.enregistreraape));
        enregistrer.setOnClickListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.GONE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.enregistrement_aape) {
            // Handle the camera action
            Intent intent = new Intent(this,EnregistrementAape.class);
            intent.putExtra("madonn","AAPE");
            this.startActivityForResult(intent,1000);
        } else if (id == R.id.planvisites) {

        } else if (id == R.id.enregistrement_producteur) {
            Intent intent = new Intent(this,EnregistrementProducteur.class);
            intent.putExtra("madonn","Producteur");
            this.startActivityForResult(intent,1000);

        } else if (id == R.id.visites) {
            Intent intent = new Intent(this,Visites.class);
            intent.putExtra("madonn","Apropos");
            this.startActivityForResult(intent,1000);

        } else if (id == R.id.planvisites) {
            Intent intent = new Intent(this,Planing.class);
            intent.putExtra("madonn","Apropos");
            this.startActivityForResult(intent,1000);

        } else if (id == R.id.menumap) {
            Intent intent = new Intent(this,Map.class);
            intent.putExtra("madonn","Apropos");
            this.startActivityForResult(intent,1000);

        }
        else if (id == R.id.apropos) {
            Intent intent = new Intent(this,About.class);
            intent.putExtra("madonn","Apropos");
            this.startActivityForResult(intent,1000);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Maux.class);
        this.startActivityForResult(intent,1000);
    }
}
