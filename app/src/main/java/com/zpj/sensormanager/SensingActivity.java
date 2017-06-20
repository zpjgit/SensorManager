package com.zpj.sensormanager;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SensingActivity extends AppCompatActivity {

    private TextView tvSensors = null;
    private SensorManager sensorManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensinglayout);

        TextView tvSensors = (TextView) findViewById(R.id.tv_sensors);

        //获取传感器SensorManager对象
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : sensors) {
            tvSensors.append(sensor.getName() + "\n");
        }
    }
}
