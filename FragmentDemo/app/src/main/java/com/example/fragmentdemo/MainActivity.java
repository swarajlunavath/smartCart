package com.example.fragmentdemo;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
   private BottomNavigationView mainbottomnav;
   private FragmentTwo fragmentTwo;
   private ScannedBarcodeActivity scannedBarcodeActivity;
   private Payment payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainbottomnav = findViewById(R.id.mainBottomnav);

        scannedBarcodeActivity = new ScannedBarcodeActivity();
        fragmentTwo = new FragmentTwo();
        payment = new Payment();

        mainbottomnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()) {
                    case R.id.bottom_action_scan : replaceFragment(scannedBarcodeActivity);
                                                    return true;
                    case R.id.bottom_action_cart : replaceFragment(fragmentTwo);
                                                    return true;
                    case R.id.bottom_action_payment :replaceFragment(payment);
                                                        return true;
                     default:return false;

                }

            }
        });
    }

    /*public void fOne(View view) {
        Fragment fragment = new ScannedBarcodeActivity();
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();

    }

    public void fTwo(View view) {
        Fragment fragment = new FragmentTwo();
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }*/

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container,fragment);
        fragmentTransaction.commit();
    }
}
