package jp.threecolors.sample.samplemvvm

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: SampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SampleFragment.newInstance())
                .commitNow()
        }
        viewModel = ViewModelProviders.of(this).get(SampleViewModel::class.java)

        // 本来はViewModelで初期化を行うべきだが、今回はActivityとFragmentで値の共有ができているというのを示すためにここで行っている。
        viewModel.result.value = "0"
    }
}



