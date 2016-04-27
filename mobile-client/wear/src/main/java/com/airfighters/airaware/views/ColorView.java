package com.airfighters.airaware.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.airfighters.airaware.R;

/**
 * Created by alex on 27.04.2016.
 */
public class ColorView extends View {
    private int width;
    private int height;

    private Paint mPaint;

    public ColorView(Context context) {
        super(context);
        init(context);
    }

    public ColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ColorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(ContextCompat.getColor(context, R.color.material_deep_teal_500));
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.width = w / 2;
        this.height = h / 2;

        super.onSizeChanged(w, h, oldw, oldh);
    }

        @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(width, height, width, mPaint);
        super.onDraw(canvas);
    }

    public void setBackgroundColor(int color) {
        mPaint.setColor(color);
        invalidate();
    }
}
