package com.poly.lt4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.poly.lt4.model.Post;
import com.poly.lt4.model.VolleyActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        progressDialog =new ProgressDialog(this);
    }

    public void getData(View view) {
        progressDialog.show();
        PolyRetrofit.getInstanse().getPostOfCategory("18", "1", "2").enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                Log.e("data", response.body().size() + "");
                Log.e("code", response.code() + "");

                progressDialog.cancel();
                progressDialog.dismiss();
                if(response.code()==200){
                    startActivity(new Intent(getApplicationContext(), VolleyActivity.class));
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.e("error", t.getMessage() + "");
            }
        });
    }
}
