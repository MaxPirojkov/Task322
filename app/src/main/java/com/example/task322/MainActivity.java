package com.example.task322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.security.acl.Group;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView screen = findViewById(R.id.textViewNumb);
        final Button n0 = findViewById(R.id.btn_zero);
        final Button n1 = findViewById(R.id.btn_one);
        final Button n2 = findViewById(R.id.btn_two);
        final Button n3 = findViewById(R.id.btn_three);
        final Button n4 = findViewById(R.id.btn_four);
        final Button n5 = findViewById(R.id.btn_five);
        final Button n6 = findViewById(R.id.btn_six);
        final Button n7 = findViewById(R.id.btn_seven);
        final Button n8 = findViewById(R.id.btn_eight);
        final Button n9 = findViewById(R.id.btn_nine);
        final Button dot = findViewById(R.id.btn_dot);
        final Button equals = findViewById(R.id.btn_equally);
        final Button addit = findViewById(R.id.btnPlus);
        final Button minus = findViewById(R.id.btnMinus);
        final Button multip = findViewById(R.id.btnMultip);
        final Button division = findViewById(R.id.btn_division);
        final Button plusMinus = findViewById(R.id.btn_plus_minus);
        final Button percent = findViewById(R.id.btn_persent);
        final Button clear = findViewById(R.id.btn_reset);
        final Button changeMode = findViewById(R.id.changeMode);

        final Button changeMode1 = findViewById(R.id.changeMode1);
        final Button n01 = findViewById(R.id.btn_zero1);
        final Button n11 = findViewById(R.id.btn_one1);
        final Button n21 = findViewById(R.id.btn_two1);
        final Button n31 = findViewById(R.id.btn_three1);
        final Button n41 = findViewById(R.id.btn_four1);
        final Button n51 = findViewById(R.id.btn_five1);
        final Button n61 = findViewById(R.id.btn_six1);
        final Button n71 = findViewById(R.id.btn_seven1);
        final Button n81 = findViewById(R.id.btn_eight1);
        final Button n91 = findViewById(R.id.btn_nine1);
        final Button dot1 = findViewById(R.id.btn_dot1);
        final Button equals1 = findViewById(R.id.btn_equally1);
        final Button addit1 = findViewById(R.id.btnPlus1);
        final Button minus1 = findViewById(R.id.btnMinus1);
        final Button multip1 = findViewById(R.id.btnMultip1);
        final Button division1 = findViewById(R.id.btn_division1);
        final Button plusMinus1 = findViewById(R.id.btn_plus_minus1);
        final Button percent1 = findViewById(R.id.btn_persent1);
        final Button mc = findViewById(R.id.btn_MC);
        final Button mmin = findViewById(R.id.btn_MMin);
        final Button mplus = findViewById(R.id.btn_MPlus);
        final Button mr = findViewById(R.id.btn_MR);
        final Button ms = findViewById(R.id.btn_MS);
        final Button clear1 = findViewById(R.id.btn_reset1);


        changeMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n0.setVisibility(View.GONE);
                n1.setVisibility(View.GONE);
                n2.setVisibility(View.GONE);
                n3.setVisibility(View.GONE);
                n4.setVisibility(View.GONE);
                n5.setVisibility(View.GONE);
                n6.setVisibility(View.GONE);
                n7.setVisibility(View.GONE);
                n8.setVisibility(View.GONE);
                n9.setVisibility(View.GONE);
                dot.setVisibility(View.GONE);
                equals.setVisibility(View.GONE);
                addit.setVisibility(View.GONE);
                minus.setVisibility(View.GONE);
                multip.setVisibility(View.GONE);
                division.setVisibility(View.GONE);
                plusMinus.setVisibility(View.GONE);
                percent.setVisibility(View.GONE);
                clear.setVisibility(View.GONE);
                changeMode.setVisibility(View.GONE);

                changeMode1.setVisibility(View.VISIBLE);
                n01.setVisibility(View.VISIBLE);
                n11.setVisibility(View.VISIBLE);
                n21.setVisibility(View.VISIBLE);
                n31.setVisibility(View.VISIBLE);
                n41.setVisibility(View.VISIBLE);
                n51.setVisibility(View.VISIBLE);
                n61.setVisibility(View.VISIBLE);
                n71.setVisibility(View.VISIBLE);
                n81.setVisibility(View.VISIBLE);
                n91.setVisibility(View.VISIBLE);
                dot1.setVisibility(View.VISIBLE);
                equals1.setVisibility(View.VISIBLE);
                addit1.setVisibility(View.VISIBLE);
                minus1.setVisibility(View.VISIBLE);
                multip1.setVisibility(View.VISIBLE);
                division1.setVisibility(View.VISIBLE);
                plusMinus1.setVisibility(View.VISIBLE);
                percent1.setVisibility(View.VISIBLE);
                clear1.setVisibility(View.VISIBLE);
                mc.setVisibility(View.VISIBLE);
                mmin.setVisibility(View.VISIBLE);
                mplus.setVisibility(View.VISIBLE);
                mr.setVisibility(View.VISIBLE);
                ms.setVisibility(View.VISIBLE);
            }
        });


        changeMode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n0.setVisibility(View.VISIBLE);
                n1.setVisibility(View.VISIBLE);
                n2.setVisibility(View.VISIBLE);
                n3.setVisibility(View.VISIBLE);
                n4.setVisibility(View.VISIBLE);
                n5.setVisibility(View.VISIBLE);
                n6.setVisibility(View.VISIBLE);
                n7.setVisibility(View.VISIBLE);
                n8.setVisibility(View.VISIBLE);
                n9.setVisibility(View.VISIBLE);
                dot.setVisibility(View.VISIBLE);
                equals.setVisibility(View.VISIBLE);
                addit.setVisibility(View.VISIBLE);
                minus.setVisibility(View.VISIBLE);
                multip.setVisibility(View.VISIBLE);
                division.setVisibility(View.VISIBLE);
                plusMinus.setVisibility(View.VISIBLE);
                percent.setVisibility(View.VISIBLE);
                clear.setVisibility(View.VISIBLE);
                changeMode.setVisibility(View.VISIBLE);

                changeMode1.setVisibility(View.GONE);
                n01.setVisibility(View.GONE);
                n11.setVisibility(View.GONE);
                n21.setVisibility(View.GONE);
                n31.setVisibility(View.GONE);
                n41.setVisibility(View.GONE);
                n51.setVisibility(View.GONE);
                n61.setVisibility(View.GONE);
                n71.setVisibility(View.GONE);
                n81.setVisibility(View.GONE);
                n91.setVisibility(View.GONE);
                dot1.setVisibility(View.GONE);
                equals1.setVisibility(View.GONE);
                addit1.setVisibility(View.GONE);
                minus1.setVisibility(View.GONE);
                multip1.setVisibility(View.GONE);
                division1.setVisibility(View.GONE);
                plusMinus1.setVisibility(View.GONE);
                percent1.setVisibility(View.GONE);
                clear1.setVisibility(View.GONE);
                mc.setVisibility(View.GONE);
                mmin.setVisibility(View.GONE);
                mplus.setVisibility(View.GONE);
                mr.setVisibility(View.GONE);
                ms.setVisibility(View.GONE);
            }
        });


    }
}
