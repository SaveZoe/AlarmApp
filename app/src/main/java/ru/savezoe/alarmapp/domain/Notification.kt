package ru.savezoe.alarmapp.domain

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import androidx.core.app.NotificationCompat
import ru.savezoe.alarmapp.MainActivity
import ru.savezoe.alarmapp.R
import ru.savezoe.alarmapp.utils.NOTIFICATION_ID

fun NotificationManager.notification(context: Context) {

    val intent = Intent(context, MainActivity::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    val pendingIntent: PendingIntent = PendingIntent.getActivity(
            context, 0, intent, PendingIntent.FLAG_IMMUTABLE
    )

    val builder = NotificationCompat.Builder(context, NOTIFICATION_ID)
            .setSmallIcon(R.drawable.ic_baseline_access_alarm_24)
            .setContentTitle("5 минут")
            .setContentText("Прошло 5 минут")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .setAutoCancel(true)
            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
    notify(NOTIFICATION_ID.toInt(), builder.build())
}




