package com.jaiky.test.loadinganimation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Author by Jaiky, Email jaikydota@163.com, Date on 9/22/2016.
 * PS: Not easy to write code, please indicate.
 */
public class ListAniImageView extends ImageView {

    private AnimationDrawable animationDrawable;

    public ListAniImageView(Context context) {
        super(context);
        inti();

    }

    public ListAniImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inti();
    }

    public ListAniImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inti();
    }

    public void inti() {
        animationDrawable = (AnimationDrawable) getDrawable();
        animationDrawable.start();
    }

    public void startAnimation() {
        animationDrawable.start();
    }

    public void stopAnimation() {
        animationDrawable.setVisible(true, true);
        animationDrawable.stop();
    }

    public void pauseAnimation() {
        animationDrawable.stop();
    }

}
