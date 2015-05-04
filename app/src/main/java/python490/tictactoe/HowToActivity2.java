package python490.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex on 5/4/2015.
 */
public class HowToActivity2 extends Activity implements View.OnClickListener{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howto2);
        View v = findViewById(R.id.nextBtn);
        v.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.nextBtn) {
            Intent intent = new Intent(this, HowToActivity3.class);

            this.startActivity(intent);
        }
    }
}
