package cat.bwie.com.cricleandtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admina on 2016/11/5.
 */
public class MyView extends View{


    private Paint paint=new Paint();
    private Paint tPaint=new Paint();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //只显示仅描边
        //paint.setStyle(Paint.Style.STROKE);
        //设置圆的颜色
        paint.setColor(Color.RED);
        //设置字体的大小
        tPaint.setTextSize(100);
        //设置字体的颜色
        tPaint.setColor(Color.GREEN);
        //画圆
        canvas.drawCircle(500,500,350,paint);
        //写字
        canvas.drawText("中国圆",350,350,tPaint);


    }


}
