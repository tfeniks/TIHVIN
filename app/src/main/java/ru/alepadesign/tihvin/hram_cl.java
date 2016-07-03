package ru.alepadesign.tihvin;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import java.util.Locale;

/**
 * Created by tFeniks on 03.07.2016.
 */
public class hram_cl extends Activity  {
    //WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
    //lp.dimAmount = 0.6f; // уровень затемнения от 1.0 до 0.0
    //dialog.getWindow().setAttributes(lp);


    private View.OnClickListener mCorkyListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.hram);
        // Button button = (Button)findViewById(R.id.Btn_button);
        // Register the onClick listener with the implementation above
        // button.setOnClickListener(mCorkyListener);
        // Set up the action bar.

    }


}
