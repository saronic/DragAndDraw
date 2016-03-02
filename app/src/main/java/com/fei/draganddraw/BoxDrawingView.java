package com.fei.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lee on 2016/3/2.
 */
public class BoxDrawingView extends View {
    private static final String TAG = "BoxDrawingView";

    public BoxDrawingView(Context context) {
        this(context, null);
    }

    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String action = "";
        PointF current = new PointF(event.getX(), event.getY());

        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                action = "DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "UP";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "CANCEL";
                break;
        }
        Log.d(TAG, action + " at x: " + current.x + ", y: " + current.y);
        return  true;
    }
}
