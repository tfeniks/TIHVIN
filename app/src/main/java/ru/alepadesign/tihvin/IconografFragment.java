package ru.alepadesign.tihvin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by OneXeor on 05.07.2016.
 */
public class IconografFragment extends Fragment {

    private GridView gvExample;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.iconograf, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


                gvExample = (GridView) getActivity().findViewById(R.id.gvExample);

        gvExample.setNumColumns(2);
        gvExample.setVerticalSpacing(20);
        gvExample.setHorizontalSpacing(20);

        gvExample.setAdapter(new Adapter(getActivity()));

    }
}
