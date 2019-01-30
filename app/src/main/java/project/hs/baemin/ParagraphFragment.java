package project.hs.baemin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

;

public class ParagraphFragment extends Fragment {
    public static final String ARG_SECTION_NUMBER = "section_number";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_paragraph, container, false);
        Bundle args = getArguments();

        //Random rnd = new Random();
        //int color = Color.argb(255, 150, 150, 150); //rnd.nextInt(256)
        //((LinearLayout) rootView.findViewById(R.id.backgroundLL)).setBackgroundColor(color);
        if(args.getInt(ARG_SECTION_NUMBER) == 0)
            ((LinearLayout) rootView.findViewById(R.id.backgroundLL)).setBackgroundResource(R.drawable.banner1);
        else if(args.getInt(ARG_SECTION_NUMBER) == 1)
            ((LinearLayout) rootView.findViewById(R.id.backgroundLL)).setBackgroundResource(R.drawable.banner2);
        else if(args.getInt(ARG_SECTION_NUMBER) == 2)
            ((LinearLayout) rootView.findViewById(R.id.backgroundLL)).setBackgroundResource(R.drawable.banner3);
        //((TextView) rootView.findViewById(R.id.textTV)).setText("배너 " + args.getInt(ARG_SECTION_NUMBER));
        return rootView;

    }

}

