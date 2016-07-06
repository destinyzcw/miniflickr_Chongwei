package zcw.miniflickr;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by zhuchongwei on 6/16/16.
 */
public class SuggestionProvider extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY = "zcw.miniflickr" + ".SuggestionProvider";

    public static final int MODE = DATABASE_MODE_QUERIES;

    public SuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}
