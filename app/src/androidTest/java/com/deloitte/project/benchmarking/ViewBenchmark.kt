package com.deloitte.project.benchmarking

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ViewBenchmark {
    @get:Rule
    val benchmarkRule = BenchmarkRule()

    @Test
    fun simpleViewInflate() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val inflater = LayoutInflater.from(context)
        val root = FrameLayout(context)

        benchmarkRule.run {
            inflater.inflate(R.layout.activity_main, root, false)
        }
    }

    @Test
    fun bitmapProcessing() = benchmarkRule.measureRepeated {
        /*val input: Bitmap = runWithTimingDisabled {
            constructTestBitmap()
        }
        processBitmap(input)*/
    }
}