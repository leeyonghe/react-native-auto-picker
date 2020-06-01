package com.lee.date_picker.wheels;

import android.graphics.Paint;

import com.lee.date_picker.LocaleUtils;
import com.lee.date_picker.State;
import com.lee.date_picker.models.Mode;
import com.lee.date_picker.PickerView;

import java.util.ArrayList;
import java.util.Calendar;

import cn.carbswang.android.numberpickerview.library.NumberPickerView;

public class YearWheel extends Wheel
{
    private int defaultStartYear;
    private int defaultEndYear;

    public YearWheel(final NumberPickerView picker, final State id) {
        super(picker, id);
        this.defaultStartYear = 1900;
        this.defaultEndYear = 2100;
    }

    @Override
    public ArrayList<String> getValues() {
        ArrayList<String> values = new ArrayList<>();
        Calendar cal = Calendar.getInstance();

        final int startYear = getStartYear();
        final int endYear = getEndYear();
        int max = endYear - startYear;

        cal.set(Calendar.YEAR, startYear);

        for (int i = 0; i <= max; ++i) {
            values.add(getLocaleString(cal));
//            values.add(Integer.toString(cal.get(Calendar.YEAR)+i));
            cal.add(Calendar.YEAR, 1);
        }

        return values;
    }

    private int getEndYear() {
        if (state.getMaximumDate() == null) {
            return this.defaultEndYear;
        }
        return state.getMaximumDate().get(Calendar.YEAR);
    }

    private int getStartYear() {
        if (state.getMinimumDate() == null) {
            return this.defaultStartYear;
        }
        return state.getMinimumDate().get(Calendar.YEAR);
    }

    @Override
    public boolean visible() {
        return state.getMode() == Mode.date;
    }

    @Override
    public Paint.Align getTextAlign() {
        return Paint.Align.RIGHT;
    }

    @Override
    public String getFormatPattern() {
        return LocaleUtils.getPatternIncluding("y", state.getLocale());
    }

}

