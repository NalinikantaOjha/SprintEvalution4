package com.example.sprint4evalution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class HomeScreenActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button button;
    private List<ResponseModel>responseModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initView();
        callApi();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.setAction("Intent.ACTION_SEND");
                intent.setType("plain/text");
                startActivity(intent);

            }
        });
    }

    private void initView() {
        recyclerView=findViewById(R.id.recyclerView);
        button=findViewById(R.id.b1);
    }
    private void callApi(){


    }
    private void SetRecycleView(){
        PostAdapter postAdapter =new PostAdapter(responseModels);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(postAdapter);
    }
}