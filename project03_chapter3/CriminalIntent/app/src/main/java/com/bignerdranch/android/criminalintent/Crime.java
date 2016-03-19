package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Hasan on 19.03.2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        mId = UUID.randomUUID();
    }
}
