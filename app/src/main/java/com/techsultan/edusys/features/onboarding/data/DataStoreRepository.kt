package com.techsultan.edusys.features.onboarding.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.catch
import java.io.IOException
import kotlinx.coroutines.flow.Flow


val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "on_boarding_pref")

class DataStoreRepository(context : Context) {

    private object PreferenceKey {

        val onBoardingKey = booleanPreferencesKey(name = "on_boarding_completed")
    }

    private val dataStore = context.dataStore

    suspend fun saveBoardingState(completed: Boolean) {

        dataStore.edit { preferences ->

            preferences[PreferenceKey.onBoardingKey] = completed
        }
    }

    /*fun readingOnBoardingState(): Flow<Boolean> {
        return dataStore.data.catch { exception ->

            if (exception is IOException)
        }

    }*/

}