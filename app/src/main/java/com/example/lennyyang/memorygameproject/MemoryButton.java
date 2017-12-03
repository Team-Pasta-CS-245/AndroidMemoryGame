package com.example.lennyyang.memorygameproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.GridLayout;

/**
 * Created by lennyyang on 11/30/17.
 */

//Button
public class MemoryButton extends AppCompatButton {

    protected int row;
    protected int column;
    protected int frontDrawableId;

    protected boolean isFlipped = false;
    protected boolean isMatched = false;

    protected Drawable front;
    protected Drawable back;

    @SuppressLint("RestrictedApi")
    public MemoryButton(Context context, int r, int c, int frontImageDrawableId ){
        super(context);

        row = r;
        column = c;
        frontDrawableId = frontImageDrawableId;

        front = AppCompatDrawableManager.get().getDrawable(context, frontImageDrawableId);
        back = AppCompatDrawableManager.get().getDrawable(context, R.drawable.button_question);

        setBackgroundDrawable(back);

        GridLayout.LayoutParams tempParams = new GridLayout.LayoutParams(GridLayout.spec(r), GridLayout.spec(c));

        tempParams.width = (int) getResources().getDisplayMetrics().density * 50;
        tempParams.height = (int) getResources().getDisplayMetrics().density * 50;

        setLayoutParams(tempParams);

//        Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public int getFrontDrawableId() {
        return frontDrawableId;
    }

    public void flip(){
        if(isMatched){
            return;

        }

        if(isFlipped){
            setBackgroundDrawable(back);
            isFlipped = false;
        }
        else{
            setBackgroundDrawable(front);
            isFlipped = true;
        }
    }
}
