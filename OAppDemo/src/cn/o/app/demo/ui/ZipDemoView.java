package cn.o.app.demo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import cn.o.app.OUtil;
import cn.o.app.annotation.res.FindViewById;
import cn.o.app.annotation.res.SetContentView;
import cn.o.app.demo.R;
import cn.o.app.ui.StateView;

@SetContentView(R.layout.view_zip)
public class ZipDemoView extends StateView {

	@FindViewById(R.id.log)
	protected TextView mLog;

	public ZipDemoView(Context context) {
		super(context);
	}

	public ZipDemoView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ZipDemoView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onCreate() {
		super.onCreate();

		StringBuilder sb = new StringBuilder();
		sb.append(OUtil.getAssetZipString(getContext(), "hello.zip", "title/title.txt"));
		sb.append("\n");
		sb.append(OUtil.getAssetZipString(getContext(), "hello.zip", "message/message.txt"));
		sb.append("\n");
		sb.append(OUtil.getAssetZipString(getContext(), "hello.zip", "hello.txt"));
		sb.append("\n");
		mLog.setText(sb);
	}

}