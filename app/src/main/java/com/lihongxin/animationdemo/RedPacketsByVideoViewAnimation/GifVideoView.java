package com.lihongxin.animationdemo.RedPacketsByVideoViewAnimation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.VideoView;

/**
 * Created by lihongxin on 2017/8/16.
 */

public class GifVideoView extends VideoView{
    private int screenWidth;
    private int screenHeigh;

    public  void setMetrics(int width,int height){
        screenWidth=width;
        screenHeigh=height;

    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(screenWidth, screenHeigh);
    }

    public GifVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public GifVideoView(Context context, AttributeSet attrs) {

        super(context, attrs);
    }

    public GifVideoView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
