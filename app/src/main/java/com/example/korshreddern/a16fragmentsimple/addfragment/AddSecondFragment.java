package com.example.korshreddern.a16fragmentsimple.addfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.korshreddern.a16fragmentsimple.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddSecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddSecondFragment extends Fragment {

    private static final String TAG = "SecondTransFrag";
    private static final String KEY_MESSAGE = "key_message";
    private String mMessage;

    public AddSecondFragment() {
        // Required empty public constructor
        Log.d(TAG, "AddSecondFragment: Call Constructor");
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment AddSecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddSecondFragment newInstance(String param1) {
        AddSecondFragment fragment = new AddSecondFragment();
        Bundle args = new Bundle();
        args.putString(KEY_MESSAGE, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMessage = getArguments().getString(KEY_MESSAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_second, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnClose = (Button) view.findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.remove(AddSecondFragment.this);
                fragmentTransaction.commit();
            }
        });
    }
}
