package com.assign1.brianlu.mooditfromorbit;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.robotium.solo.Solo;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Neil on 2017/4/2.
 */

public class SignUpActivityTest extends ActivityInstrumentationTestCase2<SignUpActivity> {

    private Solo solo;
    private String testName;


    public SignUpActivityTest(){ super(SignUpActivity.class);}

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }


}
