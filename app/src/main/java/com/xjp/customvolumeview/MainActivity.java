package com.xjp.customvolumeview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button buttonAdd;
    private Button buttonDelete;
    private VolumeViewLayout volumeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(this);
        volumeView = (VolumeViewLayout) findViewById(R.id.volumeView);
        volumeView.setIcon(R.drawable.icon);
        volumeView.setTitle("音乐音量");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonAdd:
                volumeView.volumeUp();
                break;
            case R.id.buttonDelete:
                volumeView.volumeDown();
                break;
        }
    }
}
