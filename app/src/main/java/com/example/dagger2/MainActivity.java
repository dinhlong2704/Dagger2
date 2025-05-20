package com.example.dagger2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.databinding.MainActivityBinding;

import model.Battery;
import model.Mobile;
import model.Proccessor;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Battery battery = new Battery();
        Proccessor proccessor = new Proccessor();
        Mobile mobile = new Mobile(battery, proccessor);
    }
}
