package kz.edu.astanait.android.ilonmaskflighthistory.ui.base_classes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    var showProgressBar: MutableLiveData<Boolean> = MutableLiveData()
    var toastText: MutableLiveData<String> = MutableLiveData()
}