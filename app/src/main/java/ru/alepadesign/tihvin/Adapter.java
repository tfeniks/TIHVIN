package ru.alepadesign.tihvin;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by OneXeor on 04.07.2016.
 */
public class Adapter extends BaseAdapter {

    private Context context;

    public Adapter(Context context) {
        this.context = context;

    }

    // references to our images
    int[] images = {R.drawable.eat, R.drawable.eat1, R.drawable.eat2, R.drawable.eat3};

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return getCount();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;

        if (convertView == null) {
            grid = new View(context);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.iconograf, parent, false);
        } else {
            grid = (View) convertView;
        }

        ImageView imageView = (ImageView) grid.findViewById(R.id.imageView);
        TextView textView = (TextView) grid.findViewById(R.id.textView);
        Display display = ((WindowManager)context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int w = display.getWidth()/2;
        int h = display.getHeight() / 4;
        Picasso.with(context).load(images[position]).resize(w,h).into(imageView);
        textView.setText("Еда " + String.valueOf(position+1));

        return grid;
    }



}
