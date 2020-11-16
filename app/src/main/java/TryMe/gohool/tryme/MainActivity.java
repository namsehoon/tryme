package TryMe.gohool.tryme;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View window_view;
    private Button Btn;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.RED,Color.BLUE, Color.BLACK, Color.YELLOW};

        window_view = (View) findViewById(R.id.windowViewId);
        Btn = (Button) findViewById(R.id.btn);



        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int ran_num = random.nextInt(colors.length);

                window_view.setBackgroundColor(colors[ran_num]);
                Log.d("random", String.valueOf(ran_num));

            }
        });

    }
}
