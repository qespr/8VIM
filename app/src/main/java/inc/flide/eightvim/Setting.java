package inc.flide.eightvim;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class Setting extends PreferenceActivity{

    public static final String CHANGE_ICON_SET_KEY = EightVimInputMethodService.getStaticApplicationContext()
            .getString(R.string.setting_change_icon_set_key);
    public static final String CHANGE_ICON_SET_VALUE_GOOGLE = EightVimInputMethodService.getStaticApplicationContext()
            .getString(R.string.setting_change_icon_set_value_google);
    public static final String CHANGE_ICON_SET_VALUE_EMOJIONE = EightVimInputMethodService.getStaticApplicationContext()
            .getString(R.string.setting_change_icon_set_value_emojione);
    public static final String CHANGE_ICON_SET_VALUE_DEFAULT = CHANGE_ICON_SET_VALUE_EMOJIONE;
    public static final String CHANGE_ICON_SET_VALUE_APPLE = EightVimInputMethodService.getStaticApplicationContext()
            .getString(R.string.setting_change_icon_set_value_apple);

    @Override
    public Intent getIntent() {
        final Intent modIntent = new Intent(super.getIntent());
        modIntent.putExtra(EXTRA_SHOW_FRAGMENT, Settings.class.getName());
        modIntent.putExtra(EXTRA_NO_HEADERS, true);
        return modIntent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title_activity_preferences8_vim);
    }
    @Override
    protected boolean isValidFragment(final String fragmentName) {
        return Settings.class.getName().equals(fragmentName);
    }

    public static class Settings extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.activity_preferences_8vim);
        }
    }

}