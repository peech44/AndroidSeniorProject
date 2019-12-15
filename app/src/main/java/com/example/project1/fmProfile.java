package com.example.project1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmProfile extends Fragment {

    //รับค่ามาตอนถูกสร้าง fm เท่านั้น
    // activity -> create fm

    //define key
    //public static final String key_Mis_st_id = "Mis_st_id";

    //define variable
    private String Mis_st_id="";
    private String Mis_st_prenameth="";
    private String Mis_st_nameth="";
    private String Mis_st_lnameth="";
    private String Mis_cmu_account="";
    private String Mis_faculty="";

    private  String Major_name_th="";
    private String Level_name_th="";
    private String Adviser_name="";
    private String Adviser_cmu_account="";


   /* public static fmProfile newInstance(String Mis_st_id){
        fmProfile profile = new fmProfile();
        Bundle bundle = new Bundle();
        bundle.putString(key_Mis_st_id, Mis_st_id);
        profile.setArguments(bundle);
        return profile;

    }*/






    public fmProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fm_profile, container, false);

        //oncreate receive info
        /////////

        if(getArguments() != null){

            Bundle bundle1 = getArguments();
            //Mis_st_id = bundle1.getString("key_Mis_st_id");
            Mis_st_id = bundle1.getString("key_Mis_st_id");

            //Mis_st_id = bundle1.getString("key_Mis_st_id");
            Mis_cmu_account = bundle1.getString("key_Mis_cmu_account");
            Mis_st_prenameth = bundle1.getString("key_Mis_st_prenameth");
            Mis_st_nameth = bundle1.getString("key_Mis_st_nameth");
            Mis_st_lnameth = bundle1.getString("key_Mis_st_lnameth");

            Mis_faculty = bundle1.getString("key_Mis_faculty");

            Major_name_th = bundle1.getString("key_Major_name_th");
            Level_name_th = bundle1.getString("key_Level_name_th");
            Adviser_name = bundle1.getString("key_Adviser_name");
            Adviser_cmu_account = bundle1.getString("key_Adviser_cmu_account");





        }


        ////////

        //Intent to weblink
/*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "AndroidApp://StudentAssist";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(Intent.createChooser(intent, "open deeplink"));

            }
        });*/

       //

        /*TextView textView5 = (TextView)view.findViewById(R.id.textView5);
        TextView textView6 = (TextView)view.findViewById(R.id.textView);
        TextView textView30 = (TextView)view.findViewById(R.id.textView30);
        TextView textView31 = (TextView)view.findViewById(R.id.textView31);
        TextView textView32 = (TextView)view.findViewById(R.id.textView32);
        TextView textView33 = (TextView)view.findViewById(R.id.textView3);

        textView5.setText(Mis_st_id);
        textView6.setText(Mis_cmu_account);
        textView30.setText(Mis_st_prenameth);
        textView31.setText(Mis_st_nameth);
        textView32.setText(Mis_st_lnameth);
        textView33.setText(Mis_faculty);*/

        TextView textView = (TextView)view.findViewById(R.id.textView);
        TextView textView2 = (TextView)view.findViewById(R.id.textView2);
        TextView textView3 = (TextView)view.findViewById(R.id.textView3);
        TextView textView4 = (TextView)view.findViewById(R.id.textView4);
        TextView textView5 = (TextView)view.findViewById(R.id.textView5);
        TextView textView6 = (TextView)view.findViewById(R.id.textView6);
        TextView textView7 = (TextView)view.findViewById(R.id.textView7);
        TextView textView8 = (TextView)view.findViewById(R.id.textView8);
        TextView textView9 = (TextView)view.findViewById(R.id.textView9);
        TextView textView10 = (TextView)view.findViewById(R.id.textView10);

        textView.setText(Mis_faculty);
        textView2.setText(Mis_st_id);
        textView3.setText(Mis_st_prenameth);
        textView4.setText(Mis_st_nameth);
        textView5.setText(Mis_st_lnameth);
        textView6.setText(Mis_cmu_account);
        textView7.setText(Level_name_th);
        textView8.setText(Major_name_th);
        textView9.setText(Adviser_name);
        textView10.setText(Adviser_cmu_account);



        return view;



    }

}
