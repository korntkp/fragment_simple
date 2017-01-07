package com.example.korshreddern.a16fragmentsimple.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.korshreddern.a16fragmentsimple.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFirstFragment extends Fragment {

    private static final String TAG = "PagerFirst";
    private static final String KEY_INPUT_STRING = "key_input_string";

    public static PagerFirstFragment newInstance(String inputString) {
        PagerFirstFragment pagerFirstFragment = new PagerFirstFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_INPUT_STRING, inputString);
        pagerFirstFragment.setArguments(bundle);
        return pagerFirstFragment;
    }

    public PagerFirstFragment() {
        Log.d(TAG, "PagerFirstFragment: Constructor");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: PagerFirstFragment");
        String input = getArguments().getString(KEY_INPUT_STRING);
        Log.d(TAG, "onCreateView: " + input);
        return inflater.inflate(R.layout.fragment_pager_first, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: End");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: End");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: End");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: End");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: End");
    }
}
