package com.example.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FragmentTwo extends Fragment {
    TextView tv1;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_fragment_two, container, false);
       tv1=v.findViewById(R.id.tv1);
        tv1.setText("Hello people \n You are in Second Fragment");
       return  v;
    }

}
