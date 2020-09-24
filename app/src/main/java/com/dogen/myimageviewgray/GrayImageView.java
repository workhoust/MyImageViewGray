package com.dogen.myimageviewgray;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/**
 * Author : myl
 * Date   : 2020/9/2411:24
 * Company : http://www.szdogen.com/
 * <p>
 * 把努力当成一种习惯，而不是三分钟热度。
 * <p>
 * Desc   :  将图片变灰
 */
public class GrayImageView extends AppCompatImageView {

    private final Paint paint;

    public GrayImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(MatrixArrays.gray_matrix);
        paint.setColorFilter(colorMatrixColorFilter);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.saveLayer(null,paint,Canvas.ALL_SAVE_FLAG);
        super.draw(canvas);
        canvas.restore();
    }
}
