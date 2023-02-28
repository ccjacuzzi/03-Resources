package com.ualr.a03_resources;

import android.content.Context;
import android.widget.TextView;

public class Utils {
    static void setTextColor(TextView text, boolean isRight, Context context){
        int color = isRight ? context.getResources().getColor(R.color.light_blue_A700) : context.getResources().getColor(R.color.colorAccent);
        text.setTextColor(color);
    }
}
