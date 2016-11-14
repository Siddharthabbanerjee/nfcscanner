package com.nationalsurvey.siddharthab.presidentialelection.fragments;

import android.os.Bundle;
import android.os.StrictMode;
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
 * Fragment that displays the current survey that the user should answer.
 */
public class CurrentSurveyFragment extends Fragment {
    private static final String TAG = "CurrentSurveyFragment";

    private String selectedAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(
                        R.layout.fragment_current_survey, container, false /* attachToRoot */);
        TextView surveyQuestion = (TextView) rootView.findViewById(R.id.survey_question);
        surveyQuestion.setText(R.string.sample_question);

        RadioButton firstAnswer = (RadioButton) rootView.findViewById(R.id.first_answer);
        firstAnswer.setText(R.string.sample_first_answer);
        firstAnswer.setOnClickListener(getRadioButtonOnclickListener());

        RadioButton secondAnswer = (RadioButton) rootView.findViewById(R.id.second_answer);
        secondAnswer.setText(R.string.sample_second_answer);
        secondAnswer.setOnClickListener(getRadioButtonOnclickListener());

        Button submitButton = (Button) rootView.findViewById(R.id.submit_button);
        submitButton.setOnClickListener(getRadioButtonOnclickListener());
        return rootView;
    }

    public View.OnClickListener getRadioButtonOnclickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = ((Button) v).getText().toString();
                Toast.makeText(
                        getContext(), "selected:" + selectedAnswer , Toast.LENGTH_SHORT).show();
            }
        };
    }

    public static int getFragmentTitleId() {
        return R.string.current_survey_fragment_title;
    }
}
