package itokcenter.com.listas;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gorro on 02/08/16.
 */
public class AdapterRC extends RecyclerView.Adapter<AdapterRC.RecyclerViewHolder> {

    private List<ItemRc> itemRcs;
    private Context context;

    public AdapterRC(List<ItemRc> itemRcs, Context context) {
        this.itemRcs = itemRcs;
        this.context = context;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rc, null);
        viewHolder = new RecyclerViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        holder.imgV.setImageResource(itemRcs.get(position).getImg());
        holder.txtV.setText(itemRcs.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(context)
                        .setTitle("Nombre")
                        .setMessage("El nombre es" + itemRcs.get(position).getName())
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemRcs.size();
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
