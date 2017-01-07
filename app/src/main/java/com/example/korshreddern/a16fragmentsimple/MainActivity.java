package com.example.korshreddern.a16fragmentsimple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.korshreddern.a16fragmentsimple.mainfragment.MainFirstFragment;
import com.example.korshreddern.a16fragmentsimple.mainfragment.MainSecondFragment;
import com.example.korshreddern.a16fragmentsimple.mainfragment.MainThirdFragment;
import com.example.korshreddern.a16fragmentsimple.addfragment.AddFragmentActivity;
import com.example.korshreddern.a16fragmentsimple.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {
    Fragment firstFragment;
    MainFirstFragment mainFirstFragment;
    MainSecondFragment mainSecondFragment;
    MainThirdFragment mainThirdFragment;

    Button btnGotoViewPager;
    Button btnGotoAddFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMenuButton();
        initFirstFragment();
        initSecondFragment();
        initThirdFragment();
    }

    private void initMenuButton() {
        btnGotoViewPager = (Button) findViewById(R.id.btn_goto_view_pager);
        btnGotoViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });
        btnGotoAddFragment = (Button) findViewById(R.id.btn_goto_add_fragment);
        btnGotoAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddFragmentActivity.class);
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
        mainFirstFragment = (MainFirstFragment) firstFragment;
    }

    /**
     * Dynamically Fragment
     * */
    private void initSecondFragment() {
        mainSecondFragment = MainSecondFragment.newInstance(getString(R.string.second_fragment_description));
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_second_fragment, mainSecondFragment);
        fragmentTransaction.commit();
    }

    private void initThirdFragment() {
        mainThirdFragment = MainThirdFragment.newInstance(getString(R.string.third_fragment_title), getString(R.string.third_fragment_description));
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_third_fragment, mainThirdFragment);
        fragmentTransaction.commit();
    }
}
