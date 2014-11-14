package testproject.CriminalIntent;

import java.util.UUID;

/**
 * Created by ANK on 14.11.2014.
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

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public Crime(){
        // Генерирование униккального идентификатора
        mId = UUID.randomUUID();
    }
}
