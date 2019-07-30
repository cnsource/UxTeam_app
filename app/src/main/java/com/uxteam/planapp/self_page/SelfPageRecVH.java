package com.uxteam.planapp.self_page;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.uxteam.planapp.R;

/**
 * UserAdtViewHolder说明：
 */
public class SelfPageRecVH extends RecyclerView.ViewHolder {
    public ImageView iv;
    public TextView infotext;
    public SelfPageRecVH(@NonNull View itemView) {
        super(itemView);
        iv= itemView.findViewById(R.id.user_item_icon);
        infotext= itemView.findViewById(R.id.user_item_text);
    }
}
