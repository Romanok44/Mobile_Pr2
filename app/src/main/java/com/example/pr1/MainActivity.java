package com.example.pr1;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private void show_Toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        show_Toast("onSaveInstanceState");
        Log.d("onSaveInstanceState","onSaveInstanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.textView1);
        TextView buttonShow = findViewById(R.id.button);
        buttonShow.setOnClickListener(v -> textView.setText(String.format(Locale.getDefault(), "%s (%d)", Build.VERSION.RELEASE, Build.VERSION.SDK_INT)));
        show_Toast("Create now");
        Log.d("On create test","Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        show_Toast("Start now");
        Log.d("On start test","Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        show_Toast("Resume now");
        Log.d("On resume test","Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        show_Toast("Restart now");
        Log.d("On restart test","Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        show_Toast("Pause now");
        Log.d("On pause test","Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        show_Toast("Stop now");
        Log.d("On stop test","Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        show_Toast("Destroy now");
        Log.d("On destroy test","Destroy");
    }
}

