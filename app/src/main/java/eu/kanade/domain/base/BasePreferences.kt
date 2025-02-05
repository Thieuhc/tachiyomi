package eu.kanade.domain.base

import android.content.Context
import eu.kanade.tachiyomi.util.system.isPreviewBuildType
import eu.kanade.tachiyomi.util.system.isReleaseBuildType
import tachiyomi.core.preference.PreferenceStore

class BasePreferences(
    val context: Context,
    private val preferenceStore: PreferenceStore,
) {

    fun confirmExit() = preferenceStore.getBoolean("pref_confirm_exit", false)

    fun downloadedOnly() = preferenceStore.getBoolean("pref_downloaded_only", false)

    fun incognitoMode() = preferenceStore.getBoolean("incognito_mode", false)

    fun automaticExtUpdates() = preferenceStore.getBoolean("automatic_ext_updates", true)

    fun extensionInstaller() = ExtensionInstallerPreference(context, preferenceStore)

    fun acraEnabled() = preferenceStore.getBoolean("acra.enable", isPreviewBuildType || isReleaseBuildType)
}
