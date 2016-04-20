package com.example.three.siqiyan.pager;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.three.siqiyan.base.BasePager;

/**
 * 政务
 * 
 * @author three
 * 
 */
public class ZhiboPager extends BasePager{

	public ZhiboPager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {
		btnMenu.setVisibility(View.GONE);// 隐藏菜单按钮
		tvTitle.setText("直播");
		setSlidingMenuEnable(false);// 打开侧边栏

		TextView text = new TextView(mActivity);
		text.setText("直播");
		text.setTextColor(Color.BLUE);
		text.setTextSize(25);
		text.setGravity(Gravity.CENTER);

		// 向FrameLayout中动态添加布局
		flContent.addView(text);
	}

}