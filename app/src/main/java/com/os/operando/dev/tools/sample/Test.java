package com.os.operando.dev.tools.sample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * generate android-parcelable-intellij-plugin
 * https://github.com/mcharmas/android-parcelable-intellij-plugin
 */
public class Test implements Parcelable {

    private String test;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.test);
    }

    public Test() {
    }

    protected Test(Parcel in) {
        this.test = in.readString();
    }

    public static final Parcelable.Creator<Test> CREATOR = new Parcelable.Creator<Test>() {
        public Test createFromParcel(Parcel source) {
            return new Test(source);
        }

        public Test[] newArray(int size) {
            return new Test[size];
        }
    };
}
