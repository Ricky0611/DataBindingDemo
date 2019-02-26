package com.example.emywx.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.emywx.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter presenter = new MainActivityPresenter(this, getApplicationContext());
        User user = new User("Rikki", "123456");
        binding.setUser(user);
        binding.setPresenter(presenter);
    }

    @Override
    public void showData(User user) {
        String displayText = user.getUserName() + " " + user.getPassword();
        Toast.makeText(this, displayText, Toast.LENGTH_SHORT).show();
    }
}
