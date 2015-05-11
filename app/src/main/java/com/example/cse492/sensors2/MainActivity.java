package com.example.cse492.sensors2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import java.util.List;
import android.app.Activity;


public class MainActivity extends Activity {

    private SensorManager sMgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sensorsData = (TextView)findViewById(R.id.textView1);

        sMgr = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> list = sMgr.getSensorList(Sensor.TYPE_ALL);

        StringBuilder data = new StringBuilder();
        for(Sensor sensor: list){
            data.append(sensor.getName() + "\n");
            data.append(sensor.getVendor() + "\n");
            data.append(sensor.getVersion() + "\n");

        }
        sensorsData.setText(data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}

//THIS IS THE ORIGINAL FILE HERE !!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

/*


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/