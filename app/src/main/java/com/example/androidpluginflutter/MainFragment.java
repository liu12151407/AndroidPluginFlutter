package com.example.androidpluginflutter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.flutter.facade.Flutter;

/**
 * ***********************************************
 * 包路径：com.example.androidpluginflutter
 * 类描述：
 * 创建人：Liu Yinglong[PHONE：13281160095]
 * 创建时间：2019/4/23
 * 修改人：
 * 修改时间：2019/4/23
 * 修改备注：
 * ***********************************************
 */
public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        rootView.findViewById(R.id.tv_go_flutter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, Flutter.createFragment("/"))
                        .addToBackStack("flutter")
                        .commit();
            }
        });
        return rootView;
    }
}