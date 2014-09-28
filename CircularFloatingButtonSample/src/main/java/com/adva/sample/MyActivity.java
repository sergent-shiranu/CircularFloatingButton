package com.adva.sample;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.adva.circularfloatingbutton.CircularFloatingButton;
import com.adva.sample.R;


public class MyActivity extends Activity {

    private CircularFloatingButton mCfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mCfb = (CircularFloatingButton) findViewById(R.id.cfbbutton);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(this,
                R.layout.list_item, getResources().getStringArray(R.array.planets_array)));
        mCfb.listenTo(listView);

        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
    }


    public void hideCFB(View view) {
        mCfb.hide(true);
        //getActionBar().hide();
    }

    public void showCFB(View view) {
        mCfb.hide(false);
        //getActionBar().show();
    }

    public void cfbClicked(View view) {
        Toast.makeText(this, getResources().getString(R.string.hello_world), Toast.LENGTH_LONG)
                .show();
    }

    public void colorToggle(View view) {
        switch (view.getId()) {
            case R.id.blueButton: {
                int holoBlue = getResources().getColor(android.R.color.holo_blue_light);
                mCfb.setColor(holoBlue);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoBlue));
                mCfb.setDrawable(getResources().getDrawable(R.drawable.ic_content_new));
                break;
            }
            case R.id.purpleButton: {
                int holoPurple = getResources().getColor(android.R.color.holo_purple);
                mCfb.setColor(holoPurple);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoPurple));
                mCfb.setDrawable(getResources().getDrawable(R.drawable.ic_av_play));
                break;
            }
            case R.id.greenButton: {
                int holoGreen = getResources().getColor(android.R.color.holo_green_light);
                mCfb.setColor(holoGreen);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoGreen));
                mCfb.setDrawable(getResources().getDrawable(R.drawable.ic_content_discard));
                break;
            }
            case R.id.orangeButton: {
                int holoOrange = getResources().getColor(android.R.color.holo_orange_light);
                mCfb.setColor(holoOrange);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoOrange));
                mCfb.setDrawable(getResources().getDrawable(R.drawable.ic_social_add_person));
                break;
            }
            case R.id.redButton: {
                int holoRed = getResources().getColor(android.R.color.holo_red_light);
                mCfb.setColor(holoRed);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoRed));
                mCfb.setDrawable(getResources().getDrawable(R.drawable.ic_navigation_accept));
                break;
            }
        }
    }
}
