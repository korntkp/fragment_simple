package com.example.korshreddern.a16fragmentsimple.mainfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.korshreddern.a16fragmentsimple.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFirstFragment extends Fragment {
    public static final String KEY_MESSAGE = "message";

    public MainFirstFragment() {
        // Required empty public constructor
    }

//    public static MainFirstFragment newInstance() {
//        return new MainFirstFragment();
//    }
//
//    public static MainFirstFragment newInstance(String message) {
//        MainFirstFragment myFirstFragment = new MainFirstFragment();
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
        return inflater.inflate(R.layout.fragment_main_first, container, false);
    }

}
