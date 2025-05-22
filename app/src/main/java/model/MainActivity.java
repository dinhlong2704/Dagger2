package model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.databinding.MainActivityBinding;


import app.MainApplication;
import component.MobileComponent;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    //@Inject
    Mobile mobile1,mobile2,mobile3,mobile4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MobileComponent mobileComponent = ((MainApplication)getApplication()).getMobileComponent();
         mobile1 = mobileComponent.getMobile();
         mobile2 = mobileComponent.getMobile();
         mobile3 = mobileComponent.getMobile();
         mobile4 = mobileComponent.getMobile();

        mobile1.run();
        mobile2.run();

    }
}
