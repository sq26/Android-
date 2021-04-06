package com.sq26.experience.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.sq26.experience.R
import com.sq26.experience.databinding.ActivityStatusBarBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@AndroidEntryPoint
class StatusBarActivity : AppCompatActivity() {
    private val statusBarViewModel: StatusBarViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityStatusBarBinding>(this, R.layout.activity_status_bar)
            .apply {
                lifecycleOwner = this@StatusBarActivity
                viewModel = statusBarViewModel
                setOnClick {
//                    if (window?.insetsController==null){
//                        Log.i("没有window")
//                    }else{
//                        Log.i("有window")
//                    }
                }
            }
//        window?.insetsController?.hide(WindowInsets.Type.statusBars())
//        if (window?.insetsController==null){
//            Log.i("没有window")
//        }else{
//            Log.i("有window")
//        }

//        View decorView = getWindow().getDecorView();

//        Integer uiOptions = 0;
//        if (checkbox1.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_LOW_PROFILE;
//        }
//        if (checkbox2.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
//        }
//        if (checkbox3.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_FULLSCREEN;
//        }
//        if (checkbox4.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
//        }
//        if (checkbox5.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
//        }
//        if (checkbox6.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//        }
//        if (checkbox7.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_IMMERSIVE;
//        }
//        if (checkbox8.isChecked()) {
//            uiOptions = uiOptions | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
//        }
//        decorView.setSystemUiVisibility(uiOptions);
    }
}

@HiltViewModel
class StatusBarViewModel @Inject constructor(
) : ViewModel() {


}