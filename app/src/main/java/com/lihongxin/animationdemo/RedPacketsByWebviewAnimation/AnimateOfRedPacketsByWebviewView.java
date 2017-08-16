package com.lihongxin.animationdemo.RedPacketsByWebviewAnimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lihongxin.animationdemo.R;


/**
 * Created by lihongxin on 2017/8/15.
 */

public class AnimateOfRedPacketsByWebviewView extends LinearLayout {
    private WebView webView;
    private void init() {
        LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.red_packets_webview_animation_view_layout,this);
        webView=findViewById(R.id.webview);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);//屏幕适配
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBuiltInZoomControls(true);//添加对js功能的支持
        webView.setWebViewClient(new WebViewClient());
        webView.setBackgroundColor(0);


    }
    public AnimateOfRedPacketsByWebviewView(Context context) {
        super(context);
        init();
    }


    public AnimateOfRedPacketsByWebviewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public AnimateOfRedPacketsByWebviewView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void play(){
        String gifPath = "file:///android_asset/animation3.gif";
        webView.loadUrl(gifPath);
    }
}
