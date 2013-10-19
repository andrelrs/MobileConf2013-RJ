package com.github.andrelrs.mobileconf2013.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.github.andrelrs.mobileconf2013.R;
import com.github.andrelrs.mobileconf2013.adapter.ImageAdapter;

public class GridViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_view);

		GridView grid = (GridView) findViewById(R.id.grid);
		grid.setAdapter(new ImageAdapter(this));
	}

}
