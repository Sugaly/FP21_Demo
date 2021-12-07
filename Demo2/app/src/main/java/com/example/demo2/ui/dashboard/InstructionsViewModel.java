package com.example.demo2.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InstructionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InstructionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is instructions fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}