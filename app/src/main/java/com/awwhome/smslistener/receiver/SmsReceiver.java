package com.awwhome.smslistener.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/3 0003.
 */

public class SmsReceiver extends BroadcastReceiver {

    private static final String TAG = "SmsReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: 哈哈哈哈哈，系统接收到短信了 ");

        // 1.获取发送短信的号码和内容
        Object[] pdus = (Object[]) intent.getExtras().get("pdus");

        for (Object pdu : pdus) {

            // 2.获取SmsMessage对象
            SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdu);

            // 3.获取发送短信的内容

            String body = smsMessage.getMessageBody();

            String name = smsMessage.getOriginatingAddress();

            Log.d(TAG, "onReceive: 获取到的短信内容为："+body+",发送人为："+name);


        }


    }
}
