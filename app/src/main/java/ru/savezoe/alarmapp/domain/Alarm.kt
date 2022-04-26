package ru.savezoe.alarmapp.domain

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import ru.savezoe.alarmapp.utils.FIVE_MINUTE
import ru.savezoe.alarmapp.utils.NOTIFICATION_ID
import java.util.*

class Alarm(context: Context) : ContextWrapper(context) {

    private val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
    private val currentTime = Calendar.getInstance().timeInMillis
    private val intent = Intent(context, AlarmReceiver::class.java)
    private val pendingIntent = PendingIntent.getBroadcast(
            context,
            NOTIFICATION_ID.toInt(),
            intent,
            PendingIntent.FLAG_IMMUTABLE
    )

    fun startTimer() {
        alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                currentTime + FIVE_MINUTE,
                pendingIntent
        )
    }

    fun cancelTimer() {
        alarmManager.cancel(pendingIntent)
    }
}



