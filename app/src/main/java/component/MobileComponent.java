package com.example.dagger2.component;

import dagger.Component;
import model.Mobile;

@Component
public interface MobileComponent {
    Mobile getMobile();
}
