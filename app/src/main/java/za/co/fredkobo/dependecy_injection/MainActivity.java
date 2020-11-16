package za.co.fredkobo.dependecy_injection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    Car carA;
    @Inject Car carB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carA = carComponent.getCar();
        carA.drive();

        carComponent.inject(this);
        carB.drive();
    }
}