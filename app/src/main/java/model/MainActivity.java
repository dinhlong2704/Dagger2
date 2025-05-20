package model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.databinding.MainActivityBinding;

import javax.inject.Inject;

import component.DaggerMobileComponent;
import component.MobileComponent;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        //mobileComponent.getMobile();
        mobileComponent.inject(this);
        //Mobile mobile = mobileComponent.getMobile();
        //mobile.run();
        mobile.run();
    }
}
