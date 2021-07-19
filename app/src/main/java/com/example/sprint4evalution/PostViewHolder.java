package com.example.sprint4evalution;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private TextView Date;
    private TextView posetive;
    private TextView Negative;
    private TextView Hospitalized;
    private TextView Ventilater;
    private TextView Dath;
    private TextView DateChaked;


    public PostViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        Date=itemView.findViewById(R.id.tvDate);
        posetive=itemView.findViewById(R.id.tvPossetive);
        Negative=itemView.findViewById(R.id.tvNegetive);
        Hospitalized=itemView.findViewById(R.id.tvHospitalized);
        Ventilater=itemView.findViewById(R.id.tvVentilater);
        Dath=itemView.findViewById(R.id.tvDath);
        DateChaked=itemView.findViewById(R.id.tvDateChaked);

    }
    public void data(ResponseModel responseModel){
        Date.setText(responseModel.getDate());
        posetive.setText(responseModel.getPositive());
        Negative.setText(responseModel.getNegative());
        Hospitalized.setText(responseModel.getHospitalized());
        Ventilater.setText(responseModel.getOnVentilatorCurrently());
        Dath.setText(responseModel.getDeath());
        DateChaked.setText(responseModel.getDateChecked());

    }
}
