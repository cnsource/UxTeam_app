package com.uxteam.planapp.plan_page;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uxteam.planapp.R;

public class PlanPage extends Fragment {

    private PlanPagePresenter mViewModel;

    public static PlanPage newInstance() {
        return new PlanPage();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_plan_page, container, false);

        new PlanPagePresenter(this).load();
        return view;
    }


}
