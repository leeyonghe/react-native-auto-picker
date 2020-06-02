package com.lee.date_picker.wheelFunctions;

import com.lee.date_picker.wheels.Wheel;

public class UpdateVisibility implements WheelFunction {

    @Override
    public void apply(Wheel wheel) {
       wheel.updateVisibility();
    }
}


