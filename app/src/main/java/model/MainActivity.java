package model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.databinding.MainActivityBinding;

import component.DaggerMobileComponent;
import component.MobileComponent;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.getMobile();
        mobile.run();
    }
}
