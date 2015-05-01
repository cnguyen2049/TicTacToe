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
import android.widget.EditText;

/**
 * Created by Alex on 4/17/2015.
 */
public class VersusActivity extends Activity implements View.OnClickListener {
    //default top icon is X
    public boolean isX = true;
    View v;
    View v1;
    View back_view;
    View start_view;
    String p1_name;
    // you need a default for Player 2 because by default, the state is focused on Player 1.
    String p2_name="Player 2";
    EditText p1_text;
    EditText p2_text;


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

        p1_text = (EditText) findViewById(R.id.player1);
        p2_text = (EditText) findViewById(R.id.player2);

        p1_text.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    p1_name = p1_text.getText().toString();
                }
            }

        });

        p2_text.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    p2_name = p2_text.getText().toString();
                }
            }
        });


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
        } else if (view.getId() == R.id.backBtn) {
            Intent intent = new Intent(this, PlayActivity.class);
            this.startActivity(intent);
        } else if (view.getId() == R.id.startBtn) {
            Intent intent = new Intent(this, StartActivity.class);
            p1_text.clearFocus();
            p2_text.clearFocus();
            intent.putExtra("isX", isX);
            intent.putExtra("P1Name", p1_name);

            this.startActivity(intent);
        }
    }


}
