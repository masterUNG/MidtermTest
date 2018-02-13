package thanapong.krirk.ac.th.midtermtest.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import thanapong.krirk.ac.th.midtermtest.R;

/**
 * Created by cyber01 on 2/12/2018.
 */

public class MainFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }
}
