package com.help.helper.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.help.helper.R;

/**
 * Created by 小怪兽 on 2016/6/20.
 */
public class InfoFriendFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_info_friend,container,false);
        return view;
    }
}
