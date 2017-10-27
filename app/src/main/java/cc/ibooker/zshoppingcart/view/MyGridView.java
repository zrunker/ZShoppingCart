package cc.ibooker.zshoppingcart.view;

import android.widget.GridView;

/**
 * 自定义GridView
 * @author 邹峰立
 */
public class MyGridView extends GridView {
	public MyGridView(android.content.Context context, android.util.AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * 设置不滚动
	 */
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}