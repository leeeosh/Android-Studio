package org.techtown.make_progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;

    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    progressBar = findViewById(R.id.progressBar3);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼이 눌려 이 함수가 호출 된 경우 10씩 값을 더하도록 하겠다.
                value +=10;

                progressBar.setProgress(value);
                if (value >100){
                    value = 0;
                }
            }
        });

    }
}