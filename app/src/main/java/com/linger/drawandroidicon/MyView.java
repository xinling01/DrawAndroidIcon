package com.linger.drawandroidicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*绘制机器人*/
        Paint paint=new Paint();
        paint.setAntiAlias(true);//采用抗锯齿功能
        paint.setColor(0xFFA4C739);//设置画笔为绿色
        //绘制机器人头
        RectF rectF=new RectF(20,20,200,200);//定义外轮廓矩形
        rectF.offset(180,40);
        canvas.drawArc(rectF,-10,-160,false,paint);//绘制弧

        //绘制眼睛
        paint.setColor(0xFFFFFFFF);//设置画笔为白色
        canvas.drawCircle(330,106,8,paint);//绘制圆
        canvas.drawCircle(250,106,8,paint);//绘制圆
        //绘制天线
        paint.setColor(0xFFA4C739);//设置画笔为绿色
        paint.setStrokeWidth(4);//设置笔触的宽度
        canvas.drawLine(220,30,250,70,paint);//绘制线
        canvas.drawLine(360,30,330,70,paint);//绘制线
        //绘制矩形
        canvas.drawRect(200,150,380,300,paint);//绘制矩形
        RectF rectF_body=new RectF(200,280,380,320);
        canvas.drawRoundRect(rectF_body,20,20,paint);//绘制圆角矩形
        //绘制胳膊
        RectF rectF_arm=new RectF(150,150,190,280);
        canvas.drawRoundRect(rectF_arm,20,20,paint);//绘制圆角矩形
        rectF_arm.offset(240,0);
        canvas.drawRoundRect(rectF_arm,20,20,paint);//绘制圆角矩形
        //绘制腿
        RectF rectF_leg=new RectF(230,300,270,400);
        canvas.drawRoundRect(rectF_leg,20,20,paint);//绘制圆角矩形
        rectF_leg.offset(80,0);
        canvas.drawRoundRect(rectF_leg,20,20,paint);//绘制圆角矩形

    }
}
