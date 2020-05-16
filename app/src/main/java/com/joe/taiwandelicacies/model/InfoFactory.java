package com.joe.taiwandelicacies.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.joe.taiwandelicacies.viewmodel.InfoViewModel;

/**
 * author: Joe Cheng
 */
//Factory 負責產生ViewModel
public class InfoFactory implements ViewModelProvider.Factory {
    private final InfoRepository infoRepository;

    public InfoFactory(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(InfoViewModel.class))
        {
            return (T) new InfoViewModel(infoRepository);
        }
        return null;
    }
}
