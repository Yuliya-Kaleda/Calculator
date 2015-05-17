package nyc.c4q.yuliyakaleda.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    LinearLayout portraitLayout;
    RelativeLayout landscapeLayout;
    TableLayout table;
    TextView display;

    Button bClear;
    Button bSum;
    Button bSubtraction;
    Button bDivision;
    Button bMultiplication;
    Button bDot;
    Button bOpenParen;
    Button bClosedParen;
    Button bSin;
    Button bCos;
    Button bTan;
    Button bLN;
    Button bLog;
    Button bOneDivideX;
    Button bAbs;
    Button bYToPowX;
    Button bPI;
    Button bE;
    Button bEToPowX;
    Button bXToPow2;
    Button bEqual;
    Button bPerCent;
    Button bCurious;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;

    int currentScreenColor;
    ArrayList<Button> buttons;
    String result;

    private static final String DISPLAY_RESULT_KEY = "displayResult";
    private static final String DISPLAY_COLOR_KEY = "colorChanges" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = new ArrayList<Button>();
        b1 = (Button) findViewById(R.id.button_1);
        b2 = (Button) findViewById(R.id.button_2);
        b3 = (Button) findViewById(R.id.button_3);
        b4 = (Button) findViewById(R.id.button_4);
        b5 = (Button) findViewById(R.id.button_5);
        b6 = (Button) findViewById(R.id.button_6);
        b7 = (Button) findViewById(R.id.button_7);
        b8 = (Button) findViewById(R.id.button_8);
        b9 = (Button) findViewById(R.id.button_9);
        b0 = (Button) findViewById(R.id.button_0);
        bDot = (Button) findViewById(R.id.button_dot);
        bSum = (Button) findViewById(R.id.sum);
        bSubtraction = (Button) findViewById(R.id.subtraction);
        bDivision = (Button) findViewById(R.id.division);
        bMultiplication = (Button) findViewById(R.id.multiplication);
        bOpenParen = (Button) findViewById(R.id.open_parenthesis);
        bClosedParen = (Button) findViewById(R.id.closed_parenthesis);
        bClear = (Button) findViewById(R.id.AC);
        bSin = (Button) findViewById(R.id.sin);
        bCos = (Button) findViewById(R.id.cos);
        bTan = (Button) findViewById(R.id.tan);
        bLN = (Button) findViewById(R.id.b_ln);
        bLog = (Button) findViewById(R.id.button_log);
        bOneDivideX = (Button) findViewById(R.id.button_1_divide_x);
        bAbs = (Button) findViewById(R.id.button_abs);
        bYToPowX = (Button) findViewById(R.id.button_y_pow_x);
        bPI = (Button) findViewById(R.id.button_PI);
        bE = (Button) findViewById(R.id.button_E);
        bEToPowX = (Button) findViewById(R.id.button_e_pow_x);
        bXToPow2 = (Button) findViewById(R.id.button_x_pow_2);
        bEqual = (Button) findViewById(R.id.b_equal);
        bPerCent = (Button) findViewById(R.id.button_per_cent);
        bCurious = (Button) findViewById(R.id.button_happy);

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(b0);
        buttons.add(bDot);
        buttons.add(bSum);
        buttons.add(bSubtraction);
        buttons.add(bDivision);
        buttons.add(bMultiplication);
        buttons.add(bOpenParen);
        buttons.add(bClosedParen);
        buttons.add(bEqual);
        buttons.add(bClear);

        display = (TextView) findViewById(R.id.enter_numbers);
        portraitLayout = (LinearLayout) findViewById(R.id.portrait);
        landscapeLayout = (RelativeLayout) findViewById(R.id.landscape);
        table = (TableLayout) findViewById(R.id.table);


        for (Button btn : buttons) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.button_1:
                            display.append(b1.getText());
                            break;
                        case R.id.button_2:
                            display.append(b2.getText());
                            break;
                        case R.id.button_3:
                            display.append(b3.getText());
                            break;
                        case R.id.button_4:
                            display.append(b4.getText());
                            break;
                        case R.id.button_5:
                            display.append(b5.getText());
                            break;
                        case R.id.button_6:
                            display.append(b6.getText());
                            break;
                        case R.id.button_7:
                            display.append(b7.getText());
                            break;
                        case R.id.button_8:
                            display.append(b8.getText());
                            break;
                        case R.id.button_9:
                            display.append(b9.getText());
                            break;
                        case R.id.button_0:
                            display.append(b0.getText());
                            break;
                        case R.id.button_dot:
                            display.append(bDot.getText());
                            break;
                        case R.id.sum:
                            display.append(bSum.getText());
                            break;
                        case R.id.subtraction:
                            display.append(bSubtraction.getText());
                            break;
                        case R.id.division:
                            display.append(bDivision.getText());
                            break;
                        case R.id.multiplication:
                            display.append(bMultiplication.getText());
                            break;
                        case R.id.open_parenthesis:
                            display.append(bOpenParen.getText());
                            break;
                        case R.id.closed_parenthesis:
                            display.append(bClosedParen.getText());
                            break;
                    }
                }
            });
        }

        bClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });

        if (bSin != null) {
            bSin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("sin");
                }
            });
        }

        if (bCos != null) {
            bCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("cos");
                }
            });
        }

        if (bTan != null) {
            bTan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("tan");
                }
            });
        }

        if (bLN != null) {
            bLN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("ln");
                }
            });
        }

        if (bLog != null) {
            bLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("log");
                }
            });
        }

        if (bOneDivideX != null) {
            bOneDivideX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("1/");
                }
            });
        }

        if (bAbs != null) {
            bAbs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("|");
                }
            });
        }

        if (bYToPowX != null) {
            bYToPowX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("^");
                }
            });
        }

        if (bPI != null) {
            bPI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("pi");
                }
            });
        }

        if (bE != null) {
            bE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("E");
                }
            });
        }

        if (bEToPowX != null) {
            bEToPowX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("e^");
                }
            });
        }

        if (bXToPow2 != null) {
            bXToPow2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append("^2");
                }
            });
        }

        if (bPerCent != null) {
            bPerCent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.append(bPerCent.getText());
                }
            });
        }


        if (bCurious != null) {
            bCurious.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // create layout for a toast
                    LayoutInflater inflater = getLayoutInflater();

                    View toastLayout = inflater.inflate(R.layout.toast_layout,
                            (ViewGroup) findViewById(R.id.id_toast_layout));

                    //generate a random joke
                    int jokeID = getRandomJoke();

                    // set an image
                    ImageView image = (ImageView) toastLayout.findViewById(R.id.image);
                    image.setImageResource(jokeID);

                    // display a toast
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(toastLayout);
                    toast.show();
                }
            });
        }


        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = display.getText().toString();
                result = Parser.parse(input);
                display.setText(result);
            }
        });


        if (savedInstanceState != null) {
            String displayResult = savedInstanceState.getString(DISPLAY_RESULT_KEY);
            currentScreenColor = savedInstanceState.getInt(DISPLAY_COLOR_KEY);

            display.setText(displayResult);
            getUserSelectionStyle(currentScreenColor);
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(DISPLAY_RESULT_KEY, display.getText().toString());
        outState.putInt(DISPLAY_COLOR_KEY, currentScreenColor);
    }

    //method to randomly show a joke through toast
    public Integer getRandomJoke() {
        ArrayList<Integer> jokes = new ArrayList<Integer>();
        jokes.add(R.drawable.joke1);
        jokes.add(R.drawable.joke2);
        jokes.add(R.drawable.joke3);
        jokes.add(R.drawable.joke4);
        jokes.add(R.drawable.joke6);
        jokes.add(R.drawable.joke7);
        jokes.add(R.drawable.joke8);
        jokes.add(R.drawable.joke9);
        jokes.add(R.drawable.joke0);

        Random ran = new Random();
        int Idx = ran.nextInt(8);
        return jokes.get(Idx);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // show menu when menu button is pressed
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        currentScreenColor = item.getItemId();
        getUserSelectionStyle(currentScreenColor);
        return true;
    }

    //method that sets a certain shade of color for all the layout elements
    public void getUserSelectionStyle(int itemId) {
        ArrayList<Button> colorButtons = new ArrayList<Button>();
        colorButtons.addAll(buttons);
        colorButtons.add(bSin);
        colorButtons.add(bCos);
        colorButtons.add(bTan);
        colorButtons.add(bLN);
        colorButtons.add(bLog);
        colorButtons.add(bOneDivideX);
        colorButtons.add(bAbs);
        colorButtons.add(bYToPowX);
        colorButtons.add(bPI);
        colorButtons.add(bE);
        colorButtons.add(bEToPowX);
        colorButtons.add(bXToPow2);
        colorButtons.add(bPerCent);
        colorButtons.add(bCurious);

        for (Button btn : colorButtons) {
            if (btn != null) {

                //green shades
                if (itemId == R.id.green) {
                    btn.setBackgroundResource(R.drawable.test);
                    display.setBackgroundResource(R.color.green);
                    if (portraitLayout != null) {
                        portraitLayout.setBackgroundResource(R.color.green);
                    } else {
                        table.setBackgroundResource(R.color.green);
                        landscapeLayout.setBackgroundResource(R.color.green);
                    }

                }

                //red shades
                else if (itemId == R.id.red) {
                    btn.setBackgroundResource(R.drawable.test1);
                    display.setBackgroundResource(R.color.red);
                    if (portraitLayout != null) {
                        portraitLayout.setBackgroundResource(R.color.red);
                    } else {
                        table.setBackgroundResource(R.color.red);
                        landscapeLayout.setBackgroundResource(R.color.red);
                    }
                }

                //orange shades
                else if (itemId == R.id.orange) {
                    btn.setBackgroundResource(R.drawable.test2);
                    display.setBackgroundResource(R.color.orange);
                    if (portraitLayout != null) {
                        portraitLayout.setBackgroundResource(R.color.orange);
                    } else {
                        table.setBackgroundResource(R.color.orange);
                        landscapeLayout.setBackgroundResource(R.color.orange);
                    }
                }

                //black shades
                else {
                    btn.setBackgroundResource(R.drawable.test3);
                    display.setBackgroundResource(R.color.grey);
                    if (portraitLayout != null) {
                        portraitLayout.setBackgroundResource(R.color.grey);
                    } else {
                        table.setBackgroundResource(R.color.grey);
                        landscapeLayout.setBackgroundResource(R.color.grey);
                    }
                }
            }
        }
    }
}


