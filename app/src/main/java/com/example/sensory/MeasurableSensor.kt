package com.example.sensory

abstract class MeasurableSensor (
    protected val sensorType: Int
){
    protected var onSensorValueChange: ((List<Float>) -> Unit)? = null
    abstract val checkSensor: Boolean

    abstract fun startListening()
    abstract fun stopListening()
    fun setOnSensorValueChangeListener(listener: (List<Float>) -> Unit){
        onSensorValueChange = listener
    }
}