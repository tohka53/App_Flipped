package flipped.flipped;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Usuario on 09/04/2018.
 */

public class tabpersonas extends Fragment {
    private static final String TAG = "TabPersonas";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabpersonas,container,false);
                return view;

    }
}
