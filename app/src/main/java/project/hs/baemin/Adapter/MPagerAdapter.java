package project.hs.baemin.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import project.hs.baemin.ParagraphFragment;

public class MPagerAdapter extends FragmentStatePagerAdapter {

    public static int ITEM_MAX_NUM = 3;
    public static int LOOPS_COUNT = 1;

    public MPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        int position = i % ITEM_MAX_NUM;
        Fragment fragment = new ParagraphFragment();
        Bundle args = new Bundle();
        args.putInt(ParagraphFragment.ARG_SECTION_NUMBER, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public float getPageWidth(int position) {
        return super.getPageWidth(position);
    }

    @Override
    public int getCount(){
        return 3;//ITEM_MAX_NUM*LOOPS_COUNT;
    }
}
