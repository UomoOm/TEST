package om.studies.om.test;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment {

    public static RightFragment newInstance() {
        return new RightFragment();
    }

    private TextView label;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_right, container, false);
        label = (TextView) root.findViewById(R.id.fr_label);
        return root;
    }

    public void setText(String str) {
        label.setText(str);
    }
}