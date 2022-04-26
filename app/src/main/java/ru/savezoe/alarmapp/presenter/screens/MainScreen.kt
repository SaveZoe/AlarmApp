package ru.savezoe.alarmapp.presenter.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.savezoe.alarmapp.domain.Alarm
import ru.savezoe.alarmapp.presenter.theme.AlarmAppTheme

@Composable
fun MainScreen() {

    val context = LocalContext.current

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(modifier = Modifier.padding(bottom = 20.dp)) {
                Text(text = "Уведомление сработает через 5 минут")
            }
            Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = {
                    Alarm(context).startTimer()
                }, modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Text(text = "Start")
                }
                Button(onClick = {
                    Alarm(context).cancelTimer()
                }, modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Text(text = "Stop")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPrev() {
    AlarmAppTheme {
        MainScreen()
    }
}