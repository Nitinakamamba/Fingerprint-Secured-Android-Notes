package com.example.androidnotes;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note implements Serializable {

    private long dateTime;
    private String title;
    private String content;

    public Note(long dateTime, String title, String content) {
        this.dateTime = dateTime;
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public long getDateTime() {
        return dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateTimeFormat(Context context)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", context.getResources().getConfiguration().locale);
         sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(dateTime));
    }
}
