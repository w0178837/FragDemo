package com.example.w0178837.fragdemo;

import android.app.Fragment;
import android.os.*;
import android.view.*;
import android.view.View.*;

public class FragmentTwo extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two,container,false);
    }// end on create - returns a view
}
