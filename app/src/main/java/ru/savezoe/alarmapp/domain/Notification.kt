package ru.savezoe.alarmapp.domain

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import ru.savezoe.alarmapp.R
import ru.savezoe.alarmapp.utils.NOTIFICATION_ID

fun NotificationManager.sendNotification(context: Context) {
    // создание уведомления
    val builder = NotificationCompat.Builder(
        context,
        "Alarm"
    )
        .setSmallIcon(R.drawable.ic_baseline_access_alarm_24)
        .setContentTitle("Alarm App")
        .setContentText("5 min")
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    notify(NOTIFICATION_ID.toInt(), builder.build())
}