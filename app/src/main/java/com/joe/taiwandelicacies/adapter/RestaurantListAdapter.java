package com.joe.taiwandelicacies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joe.taiwandelicacies.R;
import com.joe.taiwandelicacies.model.RestaurantMerchantInfoBean;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder>{
    Context context;
    ArrayList<RestaurantMerchantInfoBean> alRestaurantBean;

    public RestaurantListAdapter(Context context, ArrayList<RestaurantMerchantInfoBean> alRestaurantBean) {
        this.context = context;
        this.alRestaurantBean = alRestaurantBean;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_info_item, null);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        holder.tvName.setText(alRestaurantBean.get(position).getName());
        holder.tvAddr.setText(alRestaurantBean.get(position).getAdd());
    }

    @Override
    public int getItemCount() {
        return alRestaurantBean.size();
    }

    class RestaurantViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvName, tvAddr;
        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvAddr = itemView.findViewById(R.id.tv_addr);
        }
    }

}
