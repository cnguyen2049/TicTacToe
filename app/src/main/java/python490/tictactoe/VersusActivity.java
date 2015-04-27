package python490.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Alex on 4/17/2015.
 */
public class VersusActivity extends Activity {

    ImageButton imageButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versus);

        //addListenerOnButton();
    }

//    private void addListenerOnButton() {
//        imageButton = (ImageButton) findViewById(R.id.xButton);
//
//        imageButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(VersusActivity.this,
//                        "xButton is clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


}
