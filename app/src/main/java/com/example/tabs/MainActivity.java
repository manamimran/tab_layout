package com.example.tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager view;
    Adapterclass adapterclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab= findViewById(R.id.tab);
        view= findViewById(R.id.view);

        tab.setupWithViewPager(view);

        Adapterclass adapterclass = new Adapterclass(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapterclass.addfragment(new Fragment1(),"chats");
        adapterclass.addfragment(new Fragment2(),"status");
        adapterclass.addfragment(new Fragment3(),"calls");

        view.setAdapter(adapterclass);

    }
}