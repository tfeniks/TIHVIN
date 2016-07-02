package ru.alepadesign.tihvin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by tFeniks on 02.07.2016.
 */
public class iconics extends Activity {
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
        setContentView(R.layout.iconic);
       // Button button = (Button)findViewById(R.id.Btn_button);
        // Register the onClick listener with the implementation above
       // button.setOnClickListener(mCorkyListener);
    }
}

