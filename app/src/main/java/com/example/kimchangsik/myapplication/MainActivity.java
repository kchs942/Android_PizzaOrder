package com.example.kimchangsik.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2,text3;
    CheckBox check1;
    RadioButton radio1,radio2;
    ImageView image;
    Button result;
    TextView view1,view2,view3;
    TextView view4,view5,view6,view7,view8;
    RadioGroup group;
    LinearLayout l1,l2,l3,l4,l5,l6,l7;
    Image pi,so;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.editText);
        text2=(EditText)findViewById(R.id.editText2);
        text3=(EditText)findViewById(R.id.editText3);
        check1=(CheckBox)findViewById(R.id.checkBox);
        group=(RadioGroup)findViewById(R.id.radiogroup1);
        radio1=(RadioButton)findViewById(R.id.radioButton);
        radio2=(RadioButton)findViewById(R.id.radioButton2);
        image=(ImageView)findViewById(R.id.imageView);
        result=(Button)findViewById(R.id.button);
        view1=(EditText) findViewById(R.id.editText4);
        view2=(EditText)findViewById(R.id.editText5);
        view3=(TextView)findViewById(R.id.textView9);
        view4=(TextView)findViewById(R.id.textView);
        view5=(TextView)findViewById(R.id.textView2);
        view6=(TextView)findViewById(R.id.textView3);
        view7=(TextView)findViewById(R.id.textView4);
        view8=(TextView)findViewById(R.id.textView8);
        l1=(LinearLayout)findViewById(R.id.linear1);
        l2=(LinearLayout)findViewById(R.id.linear2);
        l3=(LinearLayout)findViewById(R.id.linear3);
        l4=(LinearLayout)findViewById(R.id.linear4);
        l5=(LinearLayout)findViewById(R.id.linear5);
        l6=(LinearLayout)findViewById(R.id.linear6);
        l7=(LinearLayout)findViewById(R.id.linear7);

      radio1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              image.setImageResource(R.drawable.pi);
          }
      });

        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.so);
            }
        });


       result.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               String pizza=text1.getText().toString();
               String spa=text2.getText().toString();
               String sal=text3.getText().toString();
               int su;
               double sum;

               su=Integer.parseInt(pizza)+Integer.parseInt(spa)+Integer.parseInt(sal);
               view1.setText(""+su);

               if(check1.isChecked()){

                   sum=((Integer.parseInt(pizza)*16000)+(Integer.parseInt(spa)*11000)+(Integer.parseInt(sal)*4000))*0.93;
                   view2.setText(String.format("%.1f",sum));
               }
               else {
                   sum=(Integer.parseInt(pizza)*16000)+(Integer.parseInt(spa)*11000)+(Integer.parseInt(sal)*4000);
                   view2.setText(String.format("%.1f",sum));
               }

               if(radio1.isChecked()){
                   view3.setText("피클을 선택하셨습니다");
               }
               else if(radio2.isChecked()){
                   view3.setText("소스를 선택하셨습니다");
               }
           }
       });
    }
}
