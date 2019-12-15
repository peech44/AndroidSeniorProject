package com.example.project1.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class adt_rv_calculate extends RecyclerView.Adapter<adt_rv_calculate.ViewHolder> {

    ArrayList<String> lst1 = new ArrayList<String>();
    ArrayList<String> lst2 = new ArrayList<String>();
    ArrayList<String> lst3 = new ArrayList<String>();
    ArrayList<String> lst4 = new ArrayList<String>();


    LinkedList<String> selectgrade = new LinkedList<String>();
    LinkedList<String> selectcrelec = new LinkedList<String>();
    LinkedList<String> selectcrelab = new LinkedList<String>();





    public LinkedList<String> getSelectgrade() {
        return selectgrade;
    }

    public void setSelectgrade(LinkedList<String> selectgrade) {
        this.selectgrade = selectgrade;
    }

    public LinkedList<String> getSelectcrelec() {
        return selectcrelec;
    }

    public void setSelectcrelec(LinkedList<String> selectcrelec) {
        this.selectcrelec = selectcrelec;
    }

    public LinkedList<String> getSelectcrelab() {
        return selectcrelab;
    }

    public void setSelectcrelab(LinkedList<String> selectcrelab) {
        this.selectcrelab = selectcrelab;
    }

    @Override
    public adt_rv_calculate.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_calculate, viewGroup, false);

        adt_rv_calculate.ViewHolder viewHolder = new adt_rv_calculate.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i){


        if((i+1)%2==0){
            viewHolder.cardView1.setCardBackgroundColor(0xFFFFC04D);

        }
        else {
            viewHolder.cardView1.setCardBackgroundColor(0xFFFFC04D);
        }

        viewHolder.tvItems.setText(lst1.get(i));
        viewHolder.tvItems2.setText(lst2.get(i));
        viewHolder.tvItems3.setText(lst3.get(i));
        viewHolder.tvItems4.setText(lst4.get(i));





    }


    @Override
    public int getItemCount(){

        return lst1.size();
    }


    public void adt_rv_calculate(ArrayList<String> temp, ArrayList<String> temp2, ArrayList<String> temp3, ArrayList<String> temp4){
        this.lst1 = temp;
        this.lst2 = temp2;
        this.lst3 = temp3;
        this.lst4 = temp4;

    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;
        public TextView tvItems4;
        public CardView cardView1;

        public TextView tvItems9;
        public TextView tvItems10;

        public Spinner spinner;



        public  ViewHolder(View view){
            super(view);
            tvItems = (TextView)view.findViewById(R.id.textView1);
            tvItems2 = (TextView)view.findViewById(R.id.textView2);
            tvItems3 = (TextView)view.findViewById(R.id.textView3);
            tvItems4 = (TextView)view.findViewById(R.id.textView4);
            cardView1 = (CardView)view.findViewById(R.id.cardview1);

            tvItems9 = (TextView)view.findViewById(R.id.textView9);
            tvItems10 = (TextView)view.findViewById(R.id.textView10);



            Spinner spinner = (Spinner)view.findViewById(R.id.spinner);

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),R.array.grade, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(R.layout.spinner_item);
            //adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    int i = getAdapterPosition();
                    String text = parent.getItemAtPosition(position).toString();

                    //Toast.makeText(view.getContext(), "select "+text+"\nposition "+position+"\nposition2 "+i,Toast.LENGTH_LONG ).show();

                    //Toast.makeText(view.getContext(), "select "+text+"\ncreditlec "+lst3.get(position-1)+"\ncreditlab "+lst4.get(position-1), Toast.LENGTH_LONG).show();


                    //if <7
                    if(selectgrade.size() < getItemCount()){
                        selectgrade.add(text);

                    }
                    //if 7
                    else{
                        selectgrade.set(i, text);


                    }


                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {


                }
            });







        }
    }


}
