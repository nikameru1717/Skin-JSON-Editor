package com.nikameru.skinjsoneditor.ui.project;

import android.os.Bundle;
import android.text.InputType;

import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;

import com.nikameru.skinjsoneditor.R;
import com.nikameru.skinjsoneditor.databinding.FragmentProjectBackButtonBinding;

public class ProjectBackButtonFragment extends PreferenceFragmentCompat {

    private FragmentProjectBackButtonBinding binding;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.back_button_preferences, rootKey);

        EditTextPreference heightPreference = findPreference("backButtonHeightPreference");
        EditTextPreference widthPreference = findPreference("backButtonWidthPreference");

        if (heightPreference != null && widthPreference != null) {
            heightPreference.setOnBindEditTextListener(
                    editText -> editText.setInputType(InputType.TYPE_CLASS_NUMBER)
            );

            widthPreference.setOnBindEditTextListener(
                    editText -> editText.setInputType(InputType.TYPE_CLASS_NUMBER)
            );
        }
    }

    public static ProjectBackButtonFragment newInstance() {
        return new ProjectBackButtonFragment();
    }
}