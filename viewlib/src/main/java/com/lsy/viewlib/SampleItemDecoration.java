package com.lsy.viewlib;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created on 2018/2/8.
 * 功能描述：可设定各个方向的边距
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public class SampleItemDecoration extends RecyclerView.ItemDecoration {

    private int left = 0, top = 5, right = 0, bottom = 1;

    /**
     * @param outRect 边界
     * @param view    recyclerView ItemView
     * @param parent  recyclerView
     * @param state   recycler 内部数据管理
     */
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        //设定底部边距为1px
        outRect.set(left, left, right, bottom);
    }

    /**
     * 设定边距
     */
    public void setData(int leftInt, int topInt, int rightInt, int bottomInt) {
        this.left = leftInt;
        this.top = topInt;
        this.right = rightInt;
        this.bottom = bottomInt;
    }

    /**
     * 重写对边方法，当边距一致时即判定为同一个，便于removeItemDecoration方法删除。
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SampleItemDecoration) {
            SampleItemDecoration obgtemp = (SampleItemDecoration) obj;
            return SampleItemDecoration.this.left == obgtemp.left && SampleItemDecoration.this.top == obgtemp.top
                    && SampleItemDecoration.this.right == obgtemp.right && SampleItemDecoration.this.bottom == obgtemp.bottom;
        }
        return super.equals(obj);
    }
}

