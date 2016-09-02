package com.lxh.rangebar.rangebar;

import android.graphics.drawable.StateListDrawable;

public interface RangeBarAdapter {

    int getCount();
    String getText(int position);
    StateListDrawable getItem(int position);
    int getTextColor(int position);
}
