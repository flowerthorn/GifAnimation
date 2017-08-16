package com.lihongxin.animationdemo.RedPacketsByWebviewAnimation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lihongxin.animationdemo.R;


/**
 * Created by lihongxin on 2017/8/15.
 */

public class AnimationActivity2 extends Activity  {
    //private AnimateOfRedPacketsByWebviewView view;
    private WebView webView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);
        webView=findViewById(R.id.webview);
        webView.setVerticalScrollBarEnabled(false); //垂直滚动条不显示
        webView.setHorizontalScrollBarEnabled(false);//水平不显示
        WebSettings webSettings=webView.getSettings();
        webSettings.setDisplayZoomControls(false);//隐藏webview缩放按钮
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);//屏幕适配:设置webview推荐使用的窗口，设置为true
        webSettings.setLoadWithOverviewMode(true);//设置webview加载的页面的模式，也设置为true
        webSettings.setAllowFileAccess(true);
        webSettings.setSupportZoom(true);//是否支持缩放
        webSettings.setBuiltInZoomControls(true);//添加对js功能的支持
        webView.setWebViewClient(new WebViewClient());
        webView.setBackgroundColor(0);
        String gifPath = "file:///android_asset/animation3.gif";
        webView.loadUrl(gifPath);
        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
              switch (msg.what){
                  case 0:
                      webView.destroy();
                      AnimationActivity2.this.finish();
              }
            }
        };
        new Thread(){

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                Log.i("test","System.currentTimeMillis()1:"+System.currentTimeMillis());
                try {
                    this.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                Log.i("test","System.currentTimeMillis()2:"+System.currentTimeMillis());
                    if (endTime - startTime >4000){
                        //startTime = endTime;
                        Message message=new Message();
                        message.what=0;
                        handler.sendMessage(message);

                    }
            }
        } .start();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        webView.destroy();
        finish();
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_SCROLL:
                return true;
            case MotionEvent.ACTION_MOVE:
                return true;
            case MotionEvent.ACTION_POINTER_DOWN:
                return true;
            case MotionEvent.ACTION_MASK:
                return true;
            case MotionEvent.ACTION_DOWN:
                return true;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }


}
