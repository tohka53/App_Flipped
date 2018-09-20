package flipped.flipped;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static flipped.flipped.R.*;

/**
 * Created by Usuario on 09/04/2018.
 */

public class tabtema extends Fragment {
    private static final String TAG = "TabTema";
ListView lst;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layout.tabtemas,container,false);
/*
     lst = (ListView) view.findViewById(id.listatemas);
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(tabtema.this, array.listado, layout.tabtemas);
      lst.setAdapter(adapter);
*/

        return view;


    }




}
