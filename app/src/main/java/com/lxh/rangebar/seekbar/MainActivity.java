package com.lxh.rangebar.seekbar;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.lxh.rangebar.rangebar.RangeBar;
import com.lxh.rangebar.rangebar.RangeBarListener;


public class MainActivity extends AppCompatActivity {

    private RangeBar mRangeBar;
    private RangeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRangeBar = (RangeBar) findViewById(R.id.rangeBar);

        Resources resources = getResources();
        mAdapter = new RangeAdapter(resources, new int[]{
                R.drawable.sliderimg,
                R.drawable.sliderimg,
                R.drawable.sliderimg, R.drawable.sliderimg, R.drawable.sliderimg});

        mAdapter.setTextColor(new int[]{
                Color.RED,
                Color.RED,
                Color.RED,
                Color.RED,
                Color.RED,
        });
        mRangeBar.setAdapter(mAdapter);
        mRangeBar.setPosition(2);
        mRangeBar.setOnGbSlideBarListener(new RangeBarListener() {
            @Override
            public void onPositionSelected(int position) {
                Toast.makeText(MainActivity.this, "position==" + position + "---values=" + mAdapter.getText(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
