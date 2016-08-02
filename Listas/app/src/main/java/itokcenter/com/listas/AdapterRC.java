package itokcenter.com.listas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gorro on 02/08/16.
 */
public class AdapterRC extends RecyclerView.Adapter<AdapterRC.RecyclerViewHolder> {


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imgV;
        TextView txtV;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            imgV = (ImageView) itemView.findViewById(R.id.imgItem);
            txtV = (TextView) itemView.findViewById(R.id.txtItem);
        }
    }

}
