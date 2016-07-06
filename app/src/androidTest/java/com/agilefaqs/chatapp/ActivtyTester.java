package com.agilefaqs.chatapp;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.confengine.chatapp.R;
/**
 * Created by umangjeet on 06/07/16.
 */


public class ActivtyTester extends ActivityInstrumentationTestCase2<MainActivity> {


    public ActivtyTester(Class name) {
        super(name);
    }


    Button send;
    MainActivity mainAct = getActivity();

    protected void setUp() throws Exception {
        send = (Button) getActivity().findViewById(R.id.sendButton);
        mainAct = getActivity();
        super.setUp();
    }

}