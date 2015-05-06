package python490.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex on 4/17/2015.
 */
public class PlayActivity extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_play);
        View v = findViewById(R.id.versusBtn);
        v.setOnClickListener(this);
        View v1 = findViewById(R.id.computerBtn);
        v1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.versusBtn) {
            Intent intent = new Intent(this, VersusActivity.class);
            this.startActivity(intent);
        }
        else if (view.getId() == R.id.computerBtn) {
            Intent intent = new Intent(this, ComputerActivity.class);
            this.startActivity(intent);
        }
    }
}
