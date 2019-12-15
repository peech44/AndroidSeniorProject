package com.example.project1;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmDocument extends Fragment {


    private String testString;

    public fmDocument() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_document, container, false);

        View view = inflater.inflate(R.layout.fragment_fm_document, container, false);

        //get agrument
        if(getArguments() != null){

            Bundle bundle2 = getArguments();



            testString = bundle2.getString("testDoc");

        }
        else {


            Toast.makeText(getContext(),"Fail to send info",Toast.LENGTH_LONG).show();
        }
        Button button = (Button)view.findViewById(R.id.button);
        Button button2 = (Button)view.findViewById(R.id.button2);
        Button button3 = (Button)view.findViewById(R.id.button3);
        Button button4 = (Button)view.findViewById(R.id.button4);
        Button button5 = (Button)view.findViewById(R.id.button5);
        Button button6 = (Button)view.findViewById(R.id.button6);
        Button button7 = (Button)view.findViewById(R.id.button7);
        Button button8 = (Button)view.findViewById(R.id.button8);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng1"));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng2"));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng3"));
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng4"));
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng5"));
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng6"));
                startActivity(intent);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng14"));
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.eng.cmu.ac.th/reg/?Xlink=eng8"));
                startActivity(intent);
            }
        });






        return  view;
    }

}
