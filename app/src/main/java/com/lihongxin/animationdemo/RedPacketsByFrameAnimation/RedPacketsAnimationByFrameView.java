package com.lihongxin.animationdemo.RedPacketsByFrameAnimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.lihongxin.animationdemo.R;


/**
 * Created by lihongxin on 2017/8/15.
 */

public class RedPacketsAnimationByFrameView extends LinearLayout {
    private ImageView imageView;
    private AnimationDrawable anim;
    private static  boolean flag=false;


    private void init() {
        LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.red_packets_frame_animation_view_layout,this);
        imageView=findViewById(R.id.imageView);
        anim=new AnimationDrawable();

    }
    public RedPacketsAnimationByFrameView(Context context) {
        super(context);
        init();
    }


    public void play_animation(){
        for (int i=10;i<=15;i++){
            int id=getResources().getIdentifier("a"+i,"drawable",getContext().getPackageName());
            Drawable drawable=getResources().getDrawable(id);
            anim.addFrame(drawable,100);//100ms
            anim.setOneShot(true);//true 不循环播放
        }
        imageView.setImageDrawable(anim);
        anim.stop();
        anim.start();

    }

    public RedPacketsAnimationByFrameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public RedPacketsAnimationByFrameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
}
