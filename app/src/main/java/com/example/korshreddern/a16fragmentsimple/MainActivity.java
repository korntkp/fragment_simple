package com.example.korshreddern.a16fragmentsimple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.korshreddern.a16fragmentsimple.fragment.MyFirstFragment;
import com.example.korshreddern.a16fragmentsimple.fragment.MySecondFragment;
import com.example.korshreddern.a16fragmentsimple.fragment.MyThirdFragment;
import com.example.korshreddern.a16fragmentsimple.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {
    Fragment firstFragment;
    MyFirstFragment myFirstFragment;
    MySecondFragment mySecondFragment;
    MyThirdFragment myThirdFragment;

    Button btnGotoPager;
    Button btnGotoTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        initFirstFragment();
        initSecondFragment();
        initThirdFragment();
    }

    private void initButton() {
        btnGotoPager = (Button) findViewById(R.id.btn_goto_pager);
        btnGotoPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });
        btnGotoTransaction = (Button) findViewById(R.id.btn_goto_transaction);
        btnGotoTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransactActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Statically Fragment
     * e.g. GoogleMap
     * */
    private void initFirstFragment() {
        firstFragment = getSupportFragmentManager().findFragmentById(R.id.fm_my_first);
        myFirstFragment = (MyFirstFragment) firstFragment;
    }

    /**
     * Dynamically Fragment
     * */
    private void initSecondFragment() {
        mySecondFragment = MySecondFragment.newInstance(getString(R.string.second_fragment_description));
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_second_fragment, mySecondFragment);
        fragmentTransaction.commit();
    }

    private void initThirdFragment() {
        myThirdFragment = MyThirdFragment.newInstance(getString(R.string.third_fragment_title), getString(R.string.third_fragment_description));
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_third_fragment, myThirdFragment);
        fragmentTransaction.commit();
    }
}
