package com.example.jj.flashcard;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by JJ on 3/29/2016.
 *
 *
 * extend the class
 * override oncreateview
 *
 *
 * import
 */
public class bottompicturefragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottompicturefragment, container, false);
        return view;
    }

}
