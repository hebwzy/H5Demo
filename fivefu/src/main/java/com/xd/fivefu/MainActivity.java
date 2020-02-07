package com.xd.fivefu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xd.fivefu.utils.MockData;
import com.xd.fivefu.widget.GameLayout;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    GameLayout gameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        gameLayout = findViewById(R.id.gameLayout);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean success =  MockData.getInstance().addData();
                if (!success) {
                    Toast.makeText(MainActivity.this, "没有空位了", Toast.LENGTH_SHORT).show();
                }else{
                    gameLayout.requestLayoutCatView();
                }
            }
        });
    }
}
