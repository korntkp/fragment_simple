package com.example.korshreddern.a16fragmentsimple.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.korshreddern.a16fragmentsimple.R;

public class ViewPagerActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager viewPager;
    Button btnPrevious, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initialButton();
        setTitle("View Pager");

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
//        viewPager.setCurrentItem(1);
    }

    private void initialButton() {
        btnPrevious = (Button) findViewById(R.id.btn_previous);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_previous: {
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                break;
            }
            case R.id.btn_next: {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                break;
            }
        }
    }
}
