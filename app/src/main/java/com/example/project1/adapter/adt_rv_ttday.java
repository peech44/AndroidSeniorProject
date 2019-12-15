package com.example.project1.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.R;
import com.example.project1.reg_api_home.RegInfoHomeItems;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_ttday extends RecyclerView.Adapter<adt_rv_ttday.ViewHolder>{




    List<String> lst1 = new ArrayList<String>();
    List<String> lst2 = new ArrayList<String>();
    List<String> lst3 = new ArrayList<String>();
    List<String> lst4 = new ArrayList<String>();

    private onItemClickListener mListener;

    public interface onItemClickListener{

        void onItemClick(int position);
    }


    public void setonItemClickListener(onItemClickListener listener){

        mListener = listener;
    }


    public adt_rv_ttday(){


        /*lst1.add("    Monday    ");
        lst1.add("    Tuesday    ");
        lst1.add("    Wednesday    ");
        lst1.add("    Thursday    ");
        lst1.add("    Friday    ");
        lst1.add("    Saturday    ");
        lst1.add("    Sunday    ");*/

    }


    @Override
    public adt_rv_ttday.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_ttday, viewGroup, false);

        adt_rv_ttday.ViewHolder viewHolder = new adt_rv_ttday.ViewHolder(v, mListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){

        viewHolder.linearLayout.setBackgroundColor(0xFFaefaca);


        if((i+1)%7==1){

            //viewHolder.cardView.setCardBackgroundColor(0xFFFFD700);
            viewHolder.tvItems.setBackgroundColor(0xFFFFD700);
            viewHolder.tvItems.setText(lst1.get(i));
        }
        else if((i+1)%7==2){
            //viewHolder.cardView.setCardBackgroundColor(0xFFb19cd9);
            viewHolder.tvItems.setBackgroundColor(0xFFb19cd9);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else if((i+1)%7==3){
            //viewHolder.cardView.setCardBackgroundColor(0xFF90ee90);
            viewHolder.tvItems.setBackgroundColor(0xFF90ee90);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else if((i+1)%7==4){
            //viewHolder.cardView.setCardBackgroundColor(0xFFcc5500);
            viewHolder.tvItems.setBackgroundColor(0xFFcc5500);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else if((i+1)%7==5){
            //viewHolder.cardView.setCardBackgroundColor(0xFF87cefa);
            viewHolder.tvItems.setBackgroundColor(0xFF87cefa);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else if((i+1)%7==6){
            //viewHolder.cardView.setCardBackgroundColor(0xFF0978b8);
            viewHolder.tvItems.setBackgroundColor(0xFF0978b8);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else if((i+1)%7==0){
            //viewHolder.cardView.setCardBackgroundColor(0xFFe4000f);
            viewHolder.tvItems.setBackgroundColor(0xFFe4000f);
            viewHolder.tvItems.setText(lst1.get(i));

        }
        else{

        }





    }

    @Override
    public int getItemCount(){

        return lst1.size();

    }


    public void set_adt_rv_cir(List<String> temp, List<String> temp2, List<String> temp3, List<String> temp4){
        this.lst1 = temp;
        this.lst2 = temp2;
        this.lst3 = temp3;
        this.lst4 = temp4;

    }
    public void set_adt_rv_ttday(List<String> temp){
        this.lst1 = temp;


    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public CardView cardView;
        public LinearLayout linearLayout;



        public  ViewHolder(View view, final onItemClickListener listener){
            super(view);
            tvItems = (TextView) view.findViewById(R.id.textView36);
            //cardView = (CardView)view.findViewById(R.id.cardView1);
            linearLayout = (LinearLayout)view.findViewById(R.id.LL1);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }

                }
            });






        }
    }



}
