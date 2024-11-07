package com.example.benchmark

import android.provider.ContactsContract.Directory.PACKAGE_NAME
import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BaselineProfileGenerator {

    //:benchmark:pixel2api27BenchmarkAndroidTest --rerun-tasks -P android.testInstrumentationRunnerArguments.class=com.example.benchmark.BaselineProfileGenerator
    @get:Rule
    val rule = BaselineProfileRule()

    @Test
    fun startPlantListPlantDetail() {
        rule.collect(PACKAGE_NAME) {
            // start the app flow
            pressHome()
            startActivityAndWait()
        }
    }
}