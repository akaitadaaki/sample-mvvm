package jp.threecolors.sample.samplemvvm

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel;

class SampleViewModel : ViewModel() {
    val result: MutableLiveData<String> = MutableLiveData();
    var base: String = "1"

    fun add() {
        val value = result.value!!.toInt() + base.toInt()
        result.postValue(value.toString())
    }

    fun sub() {
        val value = result.value!!.toInt() - base.toInt()
        result.postValue(value.toString())
    }

}



