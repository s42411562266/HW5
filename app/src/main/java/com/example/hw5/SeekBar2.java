package com.example.hw5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.SeekBar;

public class SeekBar2 extends AppCompatActivity {
    private TextView tvText;
    private SeekBar sbSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        findViews();
    }

    private void findViews() {
        tvText = (TextView) findViewById(R.id.tvText);
        sbSize = (SeekBar) findViewById(R.id.sbSize);

        sbSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvText.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBar2.this, "start size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBar2.this, "stop size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
