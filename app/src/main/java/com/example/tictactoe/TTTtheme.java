package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class TTTtheme extends AppCompatActivity implements View.OnClickListener {

int i=0;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    int player1[][]=new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttttheme);
        img1=(ImageView)findViewById(R.id.imageView4);
        img2=(ImageView)findViewById(R.id.imageView6);
        img3=(ImageView)findViewById(R.id.imageView3);
        img4=(ImageView)findViewById(R.id.imageView7);
        img5=(ImageView)findViewById(R.id.imageView8);
        img6=(ImageView)findViewById(R.id.imageView15);
        img7=(ImageView)findViewById(R.id.imageView9);
        img8=(ImageView)findViewById(R.id.imageView10);
        img9=(ImageView)findViewById(R.id.imageView11);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
i++;
        switch (v.getId()){
            case R.id.imageView4:
                if(i%2!=0){
                   img1.setImageResource(R.drawable.eraser);
                    img1.setEnabled(false);
                    player1[0][0]= 10;
                }
                else{
                    img1.setImageResource(R.drawable.sharpner);
                    img1.setEnabled(false);
                    player1[0][0]= 1;

                }
                break;
            case R.id.imageView6:
                if(i%2!=0){
                    img2.setImageResource(R.drawable.eraser);
                    img2.setEnabled(false);
                    player1[0][1]= 10;

                }
                else{
                    img2.setImageResource(R.drawable.sharpner);
                    img2.setEnabled(false);
                    player1[0][1]= 1;

                }
                break;
            case R.id.imageView3:
                if(i%2!=0){
                    img3.setImageResource(R.drawable.eraser);
                    img3.setEnabled(false);
                    player1[0][2]= 10;

                }
                else{
                    img3.setImageResource(R.drawable.sharpner);
                    img3.setEnabled(false);
                    player1[0][2]= 1;

                }
                break;
            case R.id.imageView7:
                if(i%2!=0){
                    img4.setImageResource(R.drawable.eraser);
                    img4.setEnabled(false);
                    player1[1][0]= 10;

                }
                else {
                    img4.setImageResource(R.drawable.sharpner);
                    img4.setEnabled(false);
                    player1[1][0]= 1;

                }
                break;
            case R.id.imageView8:
                if(i%2!=0){
                    img5.setImageResource(R.drawable.eraser);
                    img5.setEnabled(false);
                    player1[1][1]= 10;

                }
                else{
                    img5.setImageResource(R.drawable.sharpner);
                    img5.setEnabled(false);
                    player1[1][1]= 1;

                }
                break;
            case R.id.imageView15:
                if(i%2!=0){
                    img6.setImageResource(R.drawable.eraser);
                    img6.setEnabled(false);
                    player1[1][2]= 10;

                }
                else{
                    img6.setImageResource(R.drawable.sharpner);
                    img6.setEnabled(false);
                    player1[1][2]= 1;

                }
                break;
            case R.id.imageView9:
                if(i%2!=0){
                    img7.setImageResource(R.drawable.eraser);
                    img7.setEnabled(false);
                    player1[2][0]= 10;

                }
                else{
                    img7.setImageResource(R.drawable.sharpner);
                    img7.setEnabled(false);
                    player1[2][0]= 1;

                }
                break;
            case R.id.imageView10:
                if(i%2!=0){
                    img8.setImageResource(R.drawable.eraser);
                    img8.setEnabled(false);
                    player1[2][1]= 10;

                }
                else{
                    img8.setImageResource(R.drawable.sharpner);
                    img8.setEnabled(false);
                    player1[2][1]= 1;

                }
                break;
            case R.id.imageView11:
                if(i%2!=0){
                    img9.setImageResource(R.drawable.eraser);
                    img9.setEnabled(false);
                    player1[2][2]= 10;

                }
                else{
                    img9.setImageResource(R.drawable.sharpner);
                    img9.setEnabled(false);
                    player1[2][2]= 1;

                }
                break;
        }
for(int j=0;j<3;j++){
    int p1=0,p2=0,p3=0,p4=0;
    for(int k=0;k<3;k++){
        if(player1[j][k]==10){
            p1++;
        }
         if(player1[j][k]==1)
        {
            p2++;
        }
         if (player1[k][j]==10)
            p3++;
        if(player1[k][j]==1)
            p4++;
    }
    RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl);
    LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
    TextView winner=(TextView)findViewById(  R.id.winner);
    if(p1==3||p3==3){
        Toast.makeText(this,"player 1 is winner",Toast.LENGTH_SHORT).show();
//rl.setVisibility(View.GONE);
        ll.setVisibility(View.VISIBLE);
      winner.setText("Player 1 \n  WON \n  the \n  GAME");
        }
if(p2==3||p4==3){
        Toast.makeText(this,"player 2 is winner",Toast.LENGTH_SHORT).show();
        ll.setVisibility(View.VISIBLE);
        winner.setText("Player 2 \n  WON \n  the \n  GAME");
        }
if((player1[0][2]==10&&player1[1][1]==10&&player1[2][0]==10)||(player1[0][0]==10&&player1[1][1]==10&&player1[2][2]==10)){
        Toast.makeText(this,"player 1 is winner",Toast.LENGTH_SHORT).show();
        ll.setVisibility(View.VISIBLE);
        winner.setText("Player 1 \n  WON \n  the \n  GAME");
    }if((player1[0][2]==1&&player1[1][1]==1&&player1[2][0]==1)||(player1[0][0]==1&&player1[1][1]==1&&player1[2][2]==1)){
        Toast.makeText(this,"player 2 is winner",Toast.LENGTH_SHORT).show();
        ll.setVisibility(View.VISIBLE);
        winner.setText("Player 2 \n  WON \n  the \n  GAME");
       }
}
    }
    public void reload(View view){

        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);

    }
}
