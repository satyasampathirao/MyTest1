package com.satman.satya.mylibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by satya on 08-04-2018.
 */

public class CircleView extends View {

    private  float dim;
    private  String shape;

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    private void init(Context context , AttributeSet attrs){
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CircleView,0,0);

        try {
            dim = typedArray.getDimension(R.styleable.CircleView_dim,20f);
            shape = typedArray.getString(R.styleable.CircleView_shape);

        }finally {
            typedArray.recycle();
        }

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(dim,dim,dim,new Paint());
    }
}
