package com.agilefaqs.chatapp;


import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;

import com.confengine.chatapp.R;
/**
 * Created by umangjeet on 06/07/16.
 */


public class ActivtyTester extends ActivityInstrumentationTestCase2<MainActivity> {

    public ActivtyTester(String name) {
        super(MainActivity.class);
        setName(name);
    }

    Button send;
    MainActivity mainAct;

    protected void setUp() throws Exception {
        send = (Button) getActivity().findViewById(R.id.sendButton);
        mainAct = getActivity();
        super.setUp();
    }

    @SmallTest
    public void testSendBtnTest() {
        mainAct.runOnUiThread(uiRunner);
        assertTrue("send button unfrozen", send.isEnabled());
    }

    private Runnable uiRunner = new Runnable() {
        @Override
        public void run() {
            send.setText("hello how are... ");
        }
    };

}