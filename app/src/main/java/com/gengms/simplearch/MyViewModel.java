package com.gengms.simplearch;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MyViewModel extends ViewModel
{
    private MutableLiveData<User> user;
    public LiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            loadUsers();
        }
        return user;
    }

    private void loadUsers() {
        ExecutorServiceManager.getInstance().execute(()->
            {
                try
                {
                    Thread.sleep(5000L);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                user.postValue(new User("12345", "gengmingshan", "110", 1, "2018-06-06 15:02:00"));
            });
    }
}