package com.example.dagger2.ui.theme.view;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.dagger2.R;
import com.example.dagger2.databinding.MainActivityBinding;


import com.example.dagger2.ui.theme.MainApplication;
import com.example.dagger2.ui.theme.component.ActivityComponent;
import com.example.dagger2.ui.theme.component.ApplicationComponent;
import com.example.dagger2.ui.theme.component.DaggerActivityComponent;
import com.example.dagger2.ui.theme.component.DaggerApplicationComponent;
import com.example.dagger2.ui.theme.model.Battery;
import com.example.dagger2.ui.theme.model.Camera;
import com.example.dagger2.ui.theme.model.Mobile;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    //@Inject
    ActivityComponent component;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replace(new MainFragment());
      component = DaggerActivityComponent.builder().build();
         Battery battery1 = component.getBattery();
         Battery battery2 = component.getBattery();

        ApplicationComponent component2 = ((MainApplication)getApplicationContext()).getComponent();
        Camera camera1 = component2.getCamera();
        Camera camera2 = component2.getCamera();
        Log.i("dasdsfsdf", "=========Activity==========");
        Log.i("dasdsfsdf", " battery1 "+battery1);
        Log.i("dasdsfsdf", " battery2 "+battery2);
        Log.i("dasdsfsdf", " camera1 "+camera1);
        Log.i("dasdsfsdf", " camera2 "+camera2);
    }
    void replace(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }
    public ActivityComponent  getComponent() {
        return component;
    }
}
