package com.nikameru.skinjsoneditor.ui.project;

import android.os.Bundle;
import android.text.InputType;

import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;

import com.nikameru.skinjsoneditor.R;
import com.nikameru.skinjsoneditor.databinding.FragmentProjectOptionsButtonBinding;

public class ProjectOptionsButtonFragment extends PreferenceFragmentCompat {

    private FragmentProjectOptionsButtonBinding binding;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.options_button_preferences, rootKey);

        EditTextPreference heightPreference = findPreference("modsButtonHeightPreference");
        EditTextPreference widthPreference = findPreference("modsButtonWidthPreference");

        if (heightPreference != null && widthPreference != null) {
            heightPreference.setOnBindEditTextListener(
                    editText -> editText.setInputType(InputType.TYPE_CLASS_NUMBER)
            );

            widthPreference.setOnBindEditTextListener(
                    editText -> editText.setInputType(InputType.TYPE_CLASS_NUMBER)
            );
        }
    }

    public static ProjectOptionsButtonFragment newInstance() {
        return new ProjectOptionsButtonFragment();
    }
}
