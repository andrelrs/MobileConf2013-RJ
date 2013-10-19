package com.github.andrelrs.mobileconf2013.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.github.andrelrs.mobileconf2013.R;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;

	public ImageAdapter(Context mContext) {
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		return 30;
	}

	@Override
	public Object getItem(int position) {
		return new String("Filme legal número " + position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TextView textView = (TextView) LayoutInflater.from(mContext).inflate(
				R.layout.grid_item, parent, false);

		String item = (String) getItem(position);

		textView.setText(item);

		return textView;
	}

}
