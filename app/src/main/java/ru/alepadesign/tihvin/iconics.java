package ru.alepadesign.tihvin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by tFeniks on 02.07.2016.
 */
public class Iconics extends Fragment {
    //WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
    //lp.dimAmount = 0.6f; // уровень затемнения от 1.0 до 0.0
    //dialog.getWindow().setAttributes(lp);

    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.iconic, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        imageView = (ImageView) getActivity().findViewById(R.id.imagefon);

        Picasso.with(getActivity()).load(R.drawable.tihvin_icon).resize(200,300).into(imageView);
    }
}

