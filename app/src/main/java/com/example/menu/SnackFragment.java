package com.example.menu;

/**
 * Created by abigailthomson13 on 11/28/2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class SnackFragment extends Fragment{
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_breakfast, container, false);
    }
}
