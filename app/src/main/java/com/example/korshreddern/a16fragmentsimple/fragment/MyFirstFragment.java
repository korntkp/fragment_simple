package com.example.korshreddern.a16fragmentsimple.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.korshreddern.a16fragmentsimple.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFirstFragment extends Fragment {
    public static final String KEY_MESSAGE = "message";

    public MyFirstFragment() {
        // Required empty public constructor
    }

//    public static MyFirstFragment newInstance() {
//        return new MyFirstFragment();
//    }
//
//    public static MyFirstFragment newInstance(String message) {
//        MyFirstFragment myFirstFragment = new MyFirstFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString(KEY_MESSAGE, message);
//        myFirstFragment.setArguments(bundle);
//        return myFirstFragment;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        if (bundle != null) {
            String message = bundle.getString(KEY_MESSAGE);
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_first, container, false);
    }

}
