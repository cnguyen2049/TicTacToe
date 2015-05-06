package python490.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Alex on 4/16/2015.
 */
public class SecondActivity extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_howto);
        View v = findViewById(R.id.nextBtn);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.nextBtn) {
            Intent intent = new Intent(this, HowToActivity1.class);
            this.startActivity(intent);
        }

    }
}
