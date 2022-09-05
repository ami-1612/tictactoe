package com.rwn.tictactoy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;
    List<Integer> circle = new ArrayList<>();
    List<Integer> cross = new ArrayList<>();
    Button reset;
    int n1, n2, n3, n4, n5, n6, n7, n8, n9;
    int ope = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = n2 = n3 = n4 = n5 = n6 = n7 = n8 = n9 = 0;
        reset = findViewById(R.id.reset);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(1);
                        i1.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(1);
                        i1.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n1++;
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n2 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(2);
                        i2.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(2);
                        i2.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n2++;
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n3 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(3);
                        i3.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(3);
                        i3.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n3++;
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n4 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(4);
                        i4.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(4);
                        i4.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n4++;
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n5 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(5);
                        i5.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(5);
                        i5.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n5++;
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n6 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(6);
                        i6.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(6);
                        i6.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n6++;
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n7 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(7);
                        i7.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(7);
                        i7.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n7++;
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n8 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(8);
                        i8.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(8);
                        i8.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n8++;
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n9 == 0) {
                    if (ope % 2 == 0) {
                        circle.add(9);
                        i9.setImageResource(R.drawable.heart);
                        opecircle();
                    } else {
                        cross.add(8);
                        i9.setImageResource(R.drawable.cross);
                        chakecross();
                    }
                    ope++;
                }
                n9++;
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circle.clear();
                cross.clear();
                n1 = n2 = n3 = n4 = n5 = n6 = n7 = n8 = n9 = 0;

                i1.setImageResource(0);
                i2.setImageResource(0);
                i3.setImageResource(0);
                i4.setImageResource(0);
                i5.setImageResource(0);
                i6.setImageResource(0);
                i7.setImageResource(0);
                i8.setImageResource(0);
                i9.setImageResource(0);
            }
        });
    }
    private void opecircle() {
        for (int i = 0; i < circle.size(); i++) {
            for (int j = 0; j < circle.size(); j++) {
                for (int k = 0; k < circle.size(); k++) {

                    if (circle.get(i) == 1 && circle.get(j) == 2 && circle.get(k) == 3) {

                        wincorss();
                    }
                    if (circle.get(i) == 4 && circle.get(j) == 5 && circle.get(k) == 6) {

                        wincorss();
                    }
                    if (circle.get(i) == 7 && circle.get(j) == 8 && circle.get(k) == 9) {

                        wincorss();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 4 && circle.get(k) == 7) {

                        wincorss();
                    }
                    if (circle.get(i) == 2 && circle.get(j) == 5 && circle.get(k) == 8) {

                        wincorss();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 6 && circle.get(k) == 9) {

                        wincorss();
                    }
                    if (circle.get(i) == 1 && circle.get(j) == 5 && circle.get(k) == 9) {

                        wincorss();
                    }
                    if (circle.get(i) == 3 && circle.get(j) == 5 && circle.get(k) == 7) {

                        wincorss();
                    }
                }
            }
        }
    }
    private void chakecross() {
        for (int i = 0; i < cross.size(); i++) {
            for (int j = 0; j < cross.size(); j++) {
                for (int k = 0; k < cross.size(); k++) {
                    if (cross.get(i) == 1 && cross.get(j) == 2 && cross.get(k) == 3) {

                        wincorss();
                    }
                    if (cross.get(i) == 4 && cross.get(j) == 5 && cross.get(k) == 6) {

                        wincorss();
                    }
                    if (cross.get(i) == 7 && cross.get(j) == 8 && cross.get(k) == 9) {

                        wincorss();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 4 && cross.get(k) == 7) {

                        wincorss();
                    }
                    if (cross.get(i) == 2 && cross.get(j) == 5 && cross.get(k) == 8) {

                        wincorss();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 6 && cross.get(k) == 9) {

                        wincorss();
                    }
                    if (cross.get(i) == 1 && cross.get(j) == 5 && cross.get(k) == 9) {

                        wincorss();
                    }
                    if (cross.get(i) == 3 && cross.get(j) == 5 && cross.get(k) == 7) {

                        wincorss();
                    }
                }
            }
        }
    }
    void wincorss()
    {
        Toast.makeText(this, "you have winner", Toast.LENGTH_SHORT).show();
    }
}

