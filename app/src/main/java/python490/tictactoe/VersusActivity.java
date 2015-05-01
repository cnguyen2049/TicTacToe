package python490.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alex on 4/17/2015.
 */
public class VersusActivity extends Activity implements View.OnClickListener{
    //default top icon is X
    public boolean isX = true;
    View v;
    View v1;
    View back_view;
    View start_view;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versus);

        v = findViewById(R.id.x_versus);
        v.setOnClickListener(this);

        v1 = findViewById(R.id.o_versus);
        v1.setOnClickListener(this);

        back_view = findViewById(R.id.backBtn);
        back_view.setOnClickListener(this);

        start_view = findViewById(R.id.startBtn);
        start_view.setOnClickListener(this);

    }

    public void onClick(View view) {
            // if player 1 button is clicked
            if (view.getId() == R.id.x_versus) {
                // if player 1's icon is X (by default it is X)
                if (isX) {
                    // change X to O when clicked
                    view.setBackgroundResource(R.drawable.o_button);
                    // change player 2 icon to X
                    v1.setBackgroundResource(R.drawable.x);
                    // player 1 button is no longer X
                    isX = false;
                // if player one button is O
                } else {
                    // change O to X
                    view.setBackgroundResource(R.drawable.x_button);
                    // change player 2 icon to O
                    v1.setBackgroundResource(R.drawable.o);
                    // player 1 button is X
                    isX = true;
                }
            }
            else if (view.getId() == R.id.backBtn) {
                Intent intent = new Intent(this, PlayActivity.class);
                this.startActivity(intent);
            }
            else if (view.getId() == R.id.startBtn) {
                Intent intent = new Intent(this, StartActivity.class);
                intent.putExtra("isX", isX);
                this.startActivity(intent);
            }
        }


}
