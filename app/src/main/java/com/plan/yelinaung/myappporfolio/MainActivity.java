package com.plan.yelinaung.myappporfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  @Bind(R.id.streamer) Button streamerText;
  @Bind(R.id.scores) Button scores;
  @Bind(R.id.library) Button library;
  @Bind(R.id.bigger) Button bigger;
  @Bind(R.id.xyz) Button xyz;
  @Bind(R.id.capstone) Button capstone;
  @Bind(R.id.title) TextView title;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    title.setText(getResources().getString(R.string.title));
    streamerText.setText(getResources().getString(R.string.streamer));
    scores.setText(getResources().getString(R.string.scores));
    library.setText(getResources().getString(R.string.library));
    bigger.setText(getResources().getString(R.string.bigger));
    xyz.setText(getResources().getString(R.string.xyz));
    capstone.setText(getResources().getString(R.string.cap));

    streamerText.setOnClickListener(this);
    xyz.setOnClickListener(this);
    bigger.setOnClickListener(this);
    scores.setOnClickListener(this);
    capstone.setOnClickListener(this);
    library.setOnClickListener(this);
  }

  @Override public void onClick(View view) {
    switch (view.getId()) {
      case R.id.streamer:
        Toast.makeText(getApplicationContext(), streamerText.getText(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.bigger:
        Toast.makeText(getApplicationContext(), bigger.getText(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.capstone:
        Toast.makeText(getApplicationContext(), capstone.getText(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.xyz:
        Toast.makeText(getApplicationContext(), xyz.getText(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.library:
        Toast.makeText(getApplicationContext(), library.getText(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.scores:
        Toast.makeText(getApplicationContext(), scores.getText(), Toast.LENGTH_SHORT).show();
        break;
    }
  }
}
