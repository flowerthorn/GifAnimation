package com.lihongxin.animationdemo.RedPacketsByFrameAnimation;

import android.app.Activity;
import android.os.Bundle;
import com.lihongxin.animationdemo.R;


/**
 * Created by lihongxin on 2017/8/15.
 */

public class AnimationActivity extends Activity {
    private RedPacketsAnimationByFrameView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        view = findViewById(R.id.animationView);
        view.play_animation();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
