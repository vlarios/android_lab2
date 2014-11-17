package com.example.vlarios.android_lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by vlarios on 11/17/2014.
 */
public class ListItemAdapter extends BaseAdapter {

    private Context mContext = null;
    private ArrayList <ListItem> mArrayList = null;
    private LayoutInflater mLayoutInflater = null;

    public ListItemAdapter (Context context, ArrayList <ListItem> arrayList) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mArrayList = arrayList;
    }

    @Override
    public Object getItem(int position) {

        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int getCount (){
        return mArrayList.size();
    }

    static class Holder {
        ImageView imageUser;
        TextView txtHeader;
        TextView txtsubHeader;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        View view = convertView;
        //Check if view is null
        if (view == null){
            holder = new Holder ();
            view = mLayoutInflater.inflate(R.layout.list_item,null);
            holder.imageUser = (ImageView)view.findViewById(R.id.img_user);
            holder.txtHeader = (TextView)view.findViewById(R.id.text_header);
            holder.txtsubHeader = (TextView)view.findViewById(R.id.text_sub_header);
            view.setTag(holder);
        }
        else{
            holder=(Holder)view.getTag();

        }
        holder.imageUser.setImageDrawable(mArrayList.get(position).getImageUser());
        holder.txtHeader.setText(mArrayList.get(position).getHeader());
        holder.txtsubHeader.setText(mArrayList.get(position).getSubHeader());

        return view;
    }

}
