package com.example.sai.ndrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by preet on 28-11-16.
 */
public class DrawerItemAdapter extends ArrayAdapter<DataModel> {

    Context mContext;
    int layoutResourceId;
    DataModel data[] = null;

    public DrawerItemAdapter(Context mContext, int layoutResourceId, DataModel[] data) {
        super(mContext, layoutResourceId,data);
        this.mContext = mContext;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);

        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);
        DataModel folder = data[position];

        textViewName.setText(folder.name);

        return listItem;

    }
}
