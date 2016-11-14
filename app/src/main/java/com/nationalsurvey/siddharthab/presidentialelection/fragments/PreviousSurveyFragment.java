package com.nationalsurvey.siddharthab.presidentialelection.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.nationalsurvey.siddharthab.presidentialelection.R;

/**
 * Fragment that displays the previous surveys the user answered.
 */
public class PreviousSurveyFragment extends Fragment {
    private static final String TAG = "CurrentSurveyFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(
                        R.layout.fragment_previous_surveys, container, false /* attachToRoot */);
        return rootView;
    }

    public static int getFragmentTitleId() {
        return R.string.previous_survey_fragment_title;
    }
}
