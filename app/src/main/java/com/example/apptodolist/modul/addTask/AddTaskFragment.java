package com.example.apptodolist.modul.addTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.apptodolist.R;
import com.example.apptodolist.base.BaseFragment;

public class AddTaskFragment extends BaseFragment<AddTaskAcitivity, AddTaskContract.Presenter> implements AddTaskContract.View {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.add_activity, container, false);
        mPresenter = new AddTaskPresenter(this);
        mPresenter.start();

        //fab = findViewById(R.id.floatingActionButton);
        setTitle("Add Task");
        return fragmentView;
    }
    public void setBtLoginClick(){
    }

    @Override
    public void setPresenter(AddTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public void redirectToDashboard() {
        Intent intent = new Intent(activity, AddActivity.class);
        startActivity(intent);
        activity.finish();
    }

}
