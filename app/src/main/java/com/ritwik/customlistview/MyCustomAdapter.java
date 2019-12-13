package com.ritwik.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCustomAdapter extends ArrayAdapter<Custom> {

    private Context ctx;
    private int resource;
    private List<Custom> customList;

    public MyCustomAdapter(@NonNull Context context, int resource, @NonNull List<Custom> customList) {
        super(context, resource, customList);
        this.ctx = context;
        this.customList = customList;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(resource,null);
        TextView name = view.findViewById(R.id.nameView);
        TextView team = view.findViewById(R.id.teamView);
        ImageView imageView = view.findViewById(R.id.imageView);

        name.setText(customList.get(position).getName());
        team.setText(customList.get(position).getTeam());
        imageView.setImageDrawable(ctx.getResources().getDrawable(customList.get(position).getImg()));

        view.findViewById(R.id.delete).setOnClickListener(v->{
            customList.remove(customList.get(position));
        });
    return view;
    }
}
