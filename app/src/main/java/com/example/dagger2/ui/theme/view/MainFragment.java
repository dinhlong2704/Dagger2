package com.example.dagger2.ui.theme.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dagger2.databinding.FragmentMainBinding;
import com.example.dagger2.ui.theme.MainApplication;
import com.example.dagger2.ui.theme.component.ActivityComponent;
import com.example.dagger2.ui.theme.component.ApplicationComponent;
import com.example.dagger2.ui.theme.component.DaggerActivityComponent;
import com.example.dagger2.ui.theme.component.DaggerApplicationComponent;
import com.example.dagger2.ui.theme.component.DaggerFragmentComponent;
import com.example.dagger2.ui.theme.component.FragmentComponent;
import com.example.dagger2.ui.theme.model.Battery;
import com.example.dagger2.ui.theme.model.Camera;
import com.example.dagger2.ui.theme.model.Proccessor;


public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    FragmentComponent component;
    Proccessor proccessor1, proccessor2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        component = DaggerFragmentComponent.builder().setClockSpeed(100).setCore(4).build();
        proccessor1 = component.getProcessor();
        proccessor2 = component.getProcessor();
        ApplicationComponent component2 = ((MainApplication)getActivity().getApplicationContext()).getComponent();
        Camera camera1 = component2.getCamera();
        Camera camera2 = component2.getCamera();
        ActivityComponent component3 = ((MainActivity)getActivity()).getComponent();
        Battery battery1 = component3.getBattery();
        Battery battery2 = component3.getBattery();

        Log.i("dasdsfsdf", "=========MainFragment==========");
        Log.i("dasdsfsdf", " proccessor1 "+proccessor1);
        Log.i("dasdsfsdf", " proccessor2 "+proccessor2);
        Log.i("dasdsfsdf", " battery1 "+battery1);
        Log.i("dasdsfsdf", " battery2 "+battery2);
        Log.i("dasdsfsdf", " camera1 "+camera1);
        Log.i("dasdsfsdf", " camera2 "+camera2);
        return binding.getRoot();

    }

}