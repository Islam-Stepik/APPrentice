package com.example.myapplication.ui.Ausbildungsplan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

class AusbildungsplanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AusbildungsplanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}