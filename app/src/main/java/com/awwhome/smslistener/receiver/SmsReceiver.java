package com.awwhome.smslistener.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/3 0003.
 */

public class SmsReceiver extends BroadcastReceiver {

    private static final String TAG = "SmsReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: 哈哈哈哈哈，系统接收到短信了 ");

        // 1.获取发送的号码和内容

    }
}
