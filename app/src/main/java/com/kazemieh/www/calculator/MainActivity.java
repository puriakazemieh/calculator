package com.kazemieh.www.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String temp1, o, o1 = "";
    String temp = "";
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button c = findViewById(R.id.c);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button p = findViewById(R.id.p);
        Button m = findViewById(R.id.m);
        Button z = findViewById(R.id.z);
        Button t = findViewById(R.id.t);
        Button tt = findViewById(R.id.tt);
        final TextView tv = findViewById(R.id.tv);


/*        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "0";
                tv.setText(temp);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "1";
                tv.setText(temp);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "2";
                tv.setText(temp);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "3";
                tv.setText(temp);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "4";
                tv.setText(temp);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "5";
                tv.setText(temp);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "6";
                tv.setText(temp);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "7";
                tv.setText(temp);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "8";
                tv.setText(temp);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "9";
                tv.setText(temp);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = "";
                tv.setText(temp);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "-";
                tv.setText(temp);


            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "+";
                tv.setText(temp);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "/";
                tv.setText(temp);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "*";
                tv.setText(temp);
            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                int p = 0;
                for (int i = temp.length()-1 ; i >= 0; i--) {
                    if (temp.charAt(i) == '/') {
                        p = i;
                        o1="/";
                        break;
                    }
                }

                o = temp.substring(0, p);
                temp1 = temp.substring(p+1);
                double i = Double.parseDouble(temp1);
                double ii = Double.parseDouble(o);
                double c = ii / i;
                temp = "" + c;

                tv.setText(temp);
            }
        });*/

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


          /*   temp = tv.getText().toString().trim();
                if (!temp.equalsIgnoreCase("0.0"))
                {
                 //   txtResult.append("0");

                    tv.setText(temp + "0");
                }*/
                if (temp.equals("0")){
                    tv.setText(temp);
                }else {
                    temp = temp + "0";
                    tv.setText(temp);
                }

                /*    ff("0");
                 */
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp.equals("0")){
                    tv.setText("1");
                    temp="1";
                }else {
                    temp = temp + "1";
                    tv.setText(temp);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "2";
                tv.setText(temp);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "3";
                tv.setText(temp);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "4";
                tv.setText(temp);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "5";
                tv.setText(temp);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "6";
                tv.setText(temp);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "7";
                tv.setText(temp);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "8";
                tv.setText(temp);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = temp + "9";
                tv.setText(temp);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = "";
                tv.setText(temp);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                fff.add(temp);
                temp1 = temp;
                temp = "";
                o = "-";
                tv.setText(temp);

            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                fff.add(temp);
                temp1 = temp;
                temp = "";
                o = "+";
                tv.setText(temp);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                fff.add(temp);
                temp1 = temp;
                temp = "";
                o = "/";
                tv.setText(temp);
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                fff.add(temp);
                temp1 = temp;
                temp = "";
                o = "*";
                tv.setText(temp);
            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

          /*      for (int i = 0; i <num ; i++) {
                    String s=fff.get(i);
                }
                tv.setText( fff+"");
*/
                int i = Integer.parseInt(temp1);
                int ii = Integer.parseInt(temp);
                if (o.equals("-")) {
                    int c = i - ii;
                    temp = "" + c;
                } else if (o.equals("+")) {
                    int c = i + ii;
                    temp = "" + c;
                } else if (o.equals("/")) {
                    int c = i / ii;
                    temp = "" + c;
                } else if (o.equals("*")) {
                    int c = i * ii;
                    temp = "" + c;
                }
                tv.setText(temp);
            }
        });


    }

    ArrayList<String > fff = new ArrayList<>();

    private List<String> ff(String f) {
        fff.add(f);
        return fff;
    }
}
