package testproject.CriminalIntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ANK on 14.11.2014.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public Crime(){
        // Генерирование униккального идентификатора
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
