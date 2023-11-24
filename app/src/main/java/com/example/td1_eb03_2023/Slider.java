package com.example.td1_eb03_2023;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Slider extends View {
    // Valeur du customView
    private float mValue = 0;

    private boolean mDoubleClick = false;
    private boolean mDisableMove = false;


    // attributs de valeur
    private float mMin = 0;
    private float mMax = 100;

    //attributs de dimension (en pixels)
    private float mBarLength;
    private float mBarWidth;
    private float mCursorDiameter;

    // attributs de couleur
    private int mDisabledColor;
    private int mBarColor;
    private int mValueBarColor;
    private int mCursorColor;

    // attributs de pinceaux
    private Paint mCursorPaint;
    private Paint mValueBarPaint;
    private Paint mBarPaint;

    // attribut d'activation
    private boolean mEnabled = true;


    private final static float MIN_BAR_LENGTH = 160;
    private final static float MIN_CURSOR_DIAMETER = 30;


    // Dimensions par défaut
    private final static float DEFAULT_BAR_LENGTH = 160;
    private final static float DEFAULT_CURSOR_DIAMETER = 40;
    private final static float DEFAULT_BAR_WIDTH = 30;





    public Slider(Context context) {
        super(context);
        init(context, null);
    }



    public Slider(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
    }


}
