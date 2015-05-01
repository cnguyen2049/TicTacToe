package python490.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Alex on 4/28/2015.
 */
public class StartActivity extends Activity implements View.OnClickListener {

    View v;
    View box1_view;
    View box2_view;
    View box3_view;
    View box4_view;
    View box5_view;
    View box6_view;
    View box7_view;
    View box8_view;
    View box9_view;
    TextView textView;
    String p1 = "";
    String p2 = "";

    boolean box1_clicked = false;
    boolean box2_clicked = false;
    boolean box3_clicked = false;
    boolean box4_clicked = false;
    boolean box5_clicked = false;
    boolean box6_clicked = false;
    boolean box7_clicked = false;
    boolean box8_clicked = false;
    boolean box9_clicked = false;
    String[][] board = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    // dummy default. will get correct boolean value from VersusActivity
    boolean isX = true;


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            isX = extras.getBoolean("isX");
            p1 = extras.getString("P1Name");
            p2 = extras.getString("P2Name");
        }

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(p1 + "'s turn.");


        v = findViewById(R.id.board);
        v.setOnClickListener(this);

        box1_view = findViewById(R.id.box1);
        box2_view = findViewById(R.id.box2);
        box3_view = findViewById(R.id.box3);
        box4_view = findViewById(R.id.box4);
        box5_view = findViewById(R.id.box5);
        box6_view = findViewById(R.id.box6);
        box7_view = findViewById(R.id.box7);
        box8_view = findViewById(R.id.box8);
        box9_view = findViewById(R.id.box9);

        box1_view.setOnClickListener(this);
        box2_view.setOnClickListener(this);
        box3_view.setOnClickListener(this);
        box4_view.setOnClickListener(this);
        box5_view.setOnClickListener(this);
        box6_view.setOnClickListener(this);
        box7_view.setOnClickListener(this);
        box8_view.setOnClickListener(this);
        box9_view.setOnClickListener(this);


    }

    // change text depending on whose turn it is.
    public void setTurn() {
        if (textView.getText().toString().equals(p1 + "'s turn.")) {
            textView.setText(p2 + "'s turn.");
        } else {
            textView.setText(p1 + "'s turn.");
        }
    }

    public void markSpace(String mark, int x, int y) {
        board[x][y] = mark;
    }

    public boolean getWinner() {
        // rows, columns, diagonals
        if ((board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])) || (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])) || (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2])) ||
                (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])) || (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])) || (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2])) ||
                (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) || (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))) {
            return true;
        }
        return false;
    }


    @Override
    public void onClick(View view) {

        boolean winner = getWinner();
        Log.v("winner ", "" + winner);
        if (view == box1_view && !box1_clicked) {
            box1_clicked = true;
            setTurn();
            box1_view.setAlpha(1);
            if (isX) {
                box1_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 0, 0);
                isX = false;
            } else {
                box1_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 0, 0);
                isX = true;
            }
        } else if (view == box2_view && !box2_clicked) {
            box2_clicked = true;
            setTurn();
            box2_view.setAlpha(1);
            if (isX) {
                box2_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 0, 1);
                isX = false;
            } else {
                box2_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 0, 1);
                isX = true;
            }
        } else if (view == box3_view && !box3_clicked) {
            box3_clicked = true;
            setTurn();
            box3_view.setAlpha(1);
            if (isX) {
                box3_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 0, 2);
                isX = false;
            } else {
                box3_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 0, 2);
                isX = true;
            }
        } else if (view == box4_view && !box4_clicked) {
            box4_clicked = true;
            setTurn();
            box4_view.setAlpha(1);
            if (isX) {
                box4_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 1, 0);
                isX = false;
            } else {
                box4_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 1, 0);
                isX = true;
            }
        } else if (view == box5_view && !box5_clicked) {
            box5_clicked = true;
            setTurn();
            box5_view.setAlpha(1);
            if (isX) {
                box5_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 1, 1);
                isX = false;
            } else {
                box5_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 1, 1);
                isX = true;
            }
        } else if (view == box6_view && !box6_clicked) {
            box6_clicked = true;
            setTurn();
            box6_view.setAlpha(1);
            if (isX) {
                box6_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 1, 2);
                isX = false;
            } else {
                box6_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 1, 2);
                isX = true;
            }
        } else if (view == box7_view && !box7_clicked) {
            box7_clicked = true;
            setTurn();
            box7_view.setAlpha(1);
            if (isX) {
                box7_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 2, 0);
                isX = false;
            } else {
                box7_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 2, 0);
                isX = true;
            }
        } else if (view == box8_view && !box8_clicked) {
            box8_clicked = true;
            setTurn();
            box8_view.setAlpha(1);
            if (isX) {
                box8_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 2, 1);
                isX = false;
            } else {
                box8_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 2, 1);
                isX = true;
            }
        } else if (view == box9_view && !box9_clicked) {
            box9_clicked = true;
            setTurn();
            box9_view.setAlpha(1);
            if (isX) {
                box9_view.setBackgroundResource(R.drawable.x);
                markSpace("X", 2, 2);
                isX = false;
            } else {
                box9_view.setBackgroundResource(R.drawable.o);
                markSpace("O", 2, 2);
                isX = true;
            }
        }


    }


}
