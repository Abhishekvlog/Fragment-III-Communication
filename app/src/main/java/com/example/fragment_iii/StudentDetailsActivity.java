package com.example.fragment_iii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class StudentDetailsActivity extends AppCompatActivity implements CommunicationListener {
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager= getSupportFragmentManager();
        launchStudentPersonalDetail();
    }

    private void launchStudentPersonalDetail() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.contaner,fragment,"personal").commit();
    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment personalDetailFragment = new StudentPerformanceDetailsFragment();
        personalDetailFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.contaner,personalDetailFragment,"personalDetailFragment").addToBackStack("").commit();
    }
}