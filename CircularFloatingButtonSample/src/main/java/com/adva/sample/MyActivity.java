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

    private CircularFloatingButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mFab = (CircularFloatingButton) findViewById(R.id.fabbutton);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(this,
                R.layout.list_item, getResources().getStringArray(R.array.planets_array)));
        mFab.listenTo(listView);

        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
    }


    public void hideFab(View view) {
        mFab.hide(true);
        //getActionBar().hide();
    }

    public void showFab(View view) {
        mFab.hide(false);
        //getActionBar().show();
    }

    public void fabClicked(View view) {
        Toast.makeText(this, getResources().getString(R.string.hello_world), Toast.LENGTH_LONG)
                .show();
    }

    public void colorToggle(View view) {
        switch (view.getId()) {
            case R.id.blueButton: {
                int holoBlue = getResources().getColor(android.R.color.holo_blue_light);
                mFab.setColor(holoBlue);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoBlue));
                mFab.setDrawable(getResources().getDrawable(R.drawable.ic_content_new));
                break;
            }
            case R.id.purpleButton: {
                int holoPurple = getResources().getColor(android.R.color.holo_purple);
                mFab.setColor(holoPurple);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoPurple));
                mFab.setDrawable(getResources().getDrawable(R.drawable.ic_av_play));
                break;
            }
            case R.id.greenButton: {
                int holoGreen = getResources().getColor(android.R.color.holo_green_light);
                mFab.setColor(holoGreen);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoGreen));
                mFab.setDrawable(getResources().getDrawable(R.drawable.ic_content_discard));
                break;
            }
            case R.id.orangeButton: {
                int holoOrange = getResources().getColor(android.R.color.holo_orange_light);
                mFab.setColor(holoOrange);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoOrange));
                mFab.setDrawable(getResources().getDrawable(R.drawable.ic_social_add_person));
                break;
            }
            case R.id.redButton: {
                int holoRed = getResources().getColor(android.R.color.holo_red_light);
                mFab.setColor(holoRed);
                getActionBar().setBackgroundDrawable(new ColorDrawable(holoRed));
                mFab.setDrawable(getResources().getDrawable(R.drawable.ic_navigation_accept));
                break;
            }
        }
    }
}
