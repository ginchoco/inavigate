package com.example.tabi.ui.journey;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JourneyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JourneyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is journey fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}