package by.bstu.kvv.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendar =findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new onDateChangeListner() {


            public void onDateChangeCalendar(CalendarView view, int year, int month, int dayOfMonth) {

                String selectionDate = new StringBuilder().append(dayOfMonth).append(month).append(year).toString();

                TextView text = findViewById(R.id.textBox);
                text.setText(selectionDate);

            }
        });
    }


}