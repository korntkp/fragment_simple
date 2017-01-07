package com.example.korshreddern.a16fragmentsimple.addfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.example.korshreddern.a16fragmentsimple.R;

public class AddFragmentActivity extends FragmentActivity implements View.OnClickListener{

    Button btn_one;
    Button btn_two;
    Button btn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fragment);
        // TODO: 07-Jan-17 Add Toolbar

        setupFragment();
        setupButton();
    }

    private void setupFragment() {
        AddFirstFragment addFirstFragment = AddFirstFragment.newInstance(getString(R.string.tv_fragment_one));
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, addFirstFragment);
        fragmentTransaction.commit();
    }

    private void setupButton() {
        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one: {
                AddFirstFragment oneFragment = AddFirstFragment.newInstance(getString(R.string.tv_fragment_one));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, oneFragment);
//                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
            case R.id.btn_two: {
                AddSecondFragment addSecondFragment = AddSecondFragment.newInstance(getString(R.string.tv_fragment_two));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, addSecondFragment);
//                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
            case R.id.btn_three: {
                AddThirdFragment addThirdFragment = AddThirdFragment.newInstance(getString(R.string.tv_fragment_three));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, addThirdFragment);
//                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }
        }
    }
}
