package com.lee.date_picker.wheelFunctions;

import com.lee.date_picker.wheels.Wheel;

public class Refresh implements WheelFunction {

    @Override
    public void apply(Wheel wheel) {
        wheel.refresh();
    }
}


