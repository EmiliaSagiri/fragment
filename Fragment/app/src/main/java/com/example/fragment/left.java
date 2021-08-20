package com.example.fragment;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import pl.droidsonroids.gif.GifImageView;

public class left extends Fragment {
    private GifImageView mGifImv1;
    private Button btn_show;
    private ObjectAnimator objectAnimator;
    private float rotateDu = 0;
    private Drawable drawable;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left,container,false);
        btn_show = view.findViewById(R.id.gifImv1);
        objectAnimator = ObjectAnimator.ofFloat(btn_show, "rotation", rotateDu, 360);
        objectAnimator.setDuration(2000);
        objectAnimator.setRepeatCount(Animation.INFINITE);
        /*objectAnimator.setRepeatCount(10);*///设置动画重复次数
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);//动画重复模式
        objectAnimator.start();
        return  view;
    }
}
