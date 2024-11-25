package com.example.sensory
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@HiltViewModel
class MainViewModel @Inject constructor(
    private val lightSensor: MeasurableSensor
): ViewModel(){

    var isDark by mutableStateOf(false)
    init {
        lightSensor.startListening()
        lightSensor.setOnSensorValueChangeListener { values ->
            val lux = values[0]
            isDark = lux < 60f
        }
    }
}