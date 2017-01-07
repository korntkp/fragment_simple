package com.example.korshreddern.a16fragmentsimple.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.korshreddern.a16fragmentsimple.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MySecondFragment extends Fragment {

    private static final String KEY_MESSAGE = "message";
    String message;

    public MySecondFragment() {
        // Required empty public constructor
    }

    public static MySecondFragment newInstance(String message) {
        MySecondFragment mySecondFragment = new MySecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_MESSAGE, message);
        mySecondFragment.setArguments(bundle);
        return mySecondFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            message = bundle.getString(KEY_MESSAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_second, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvDescription = (TextView) view.findViewById(R.id.tv_description);
        tvDescription.setText(message);
    }
}
