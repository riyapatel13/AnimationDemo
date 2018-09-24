package com.example.a10016322.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)(findViewById(R.id.t1_id));
        textView2 = (TextView)(findViewById(R.id.t2_id));
        layout = (RelativeLayout)(findViewById(R.id.layout_id));

        //MOVE THINGS OVER
        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, -4, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
        //moves over 4 times its size
        translateAnimation.setDuration(3000);
        //3 seconds
        textView1.startAnimation(translateAnimation);

        //ZOOM IN ON THINGS
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 4.0f, 1.0f, 4.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        //100% of size to 400% of size
        //0.5f is the center of the image
        scaleAnimation.setDuration(5000);
        //5 seconds
        textView2.startAnimation(scaleAnimation);

        //CREATE TEXTVIEWS PROGRAMMATICALLY
        TextView textView3 = new TextView(this);
        textView3.setText("3");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //wrap content of textview
        params.addRule(RelativeLayout.ABOVE, R.id.t2_id);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        //where it's located - above t2 and center horizontal
        textView3.setPadding(0,0,0,50);
        //moves it up 50 pixels (bc it's on bottom)

        layout.addView(textView3, params);
        //add it to the layout

    }
}
