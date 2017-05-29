package ru.samsung.itschool.game18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
		MyDraw myDraw = (MyDraw)findViewById(R.id.view);
		seekBar.setOnSeekBarChangeListener(myDraw);}

		public void onClick(View view) {
			Intent intent = new Intent(MainActivity.this, AboutActivity.class);
			startActivity(intent);
		}

}
