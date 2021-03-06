package com.molimeitu.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/**
 * 项目名称：LianfengApp
 * 类描述：CircularImage
 * 创建人：lianfeng
 * 创建时间：2015/7/1 18:26
 * 修改人：lianfeng
 * 修改时间：2015/7/1 18:26
 * 修改备注：
 * 版本：V1.0
 */
public class RoundImageView extends MaskedImage {
    public RoundImageView(Context paramContext) {
        super(paramContext);
    }

    public RoundImageView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    public RoundImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
    }

    public Bitmap createMask() {
        int i = getWidth();
        int j = getHeight();
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        Bitmap localBitmap = Bitmap.createBitmap(i, j, localConfig);
        Canvas localCanvas = new Canvas(localBitmap);
        Paint localPaint = new Paint(1);
        localPaint.setColor(-16777216);
        float f1 = getWidth();
        float f2 = getHeight();
        RectF localRectF = new RectF(0.0F, 0.0F, f1, f2);
        localCanvas.drawOval(localRectF, localPaint);
        return localBitmap;
    }
}
