package kz.edu.astanait.android.ilonmaskflighthistory.ui.base_classes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment() {
    lateinit var binding: T
    lateinit var viewModel: V

    abstract fun initObservers()

    abstract fun initViews()

    abstract fun setOnClickListeners()

    abstract fun getViewModelClass(): Class<V>

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        initViewModel()
        initViews()
        initObservers()
        setOnClickListeners()
        binding.lifecycleOwner = this
        return binding.root
    }


    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(getViewModelClass())
        viewModel.showProgressBar.observe(viewLifecycleOwner, {
//            if(it){
//                getProgressBar().visibility = View.VISIBLE
//                getRootContainer().visibility = View.GONE
//            }else{
//                getProgressBar().visibility = View.GONE
//                getRootContainer().visibility = View.VISIBLE
//            }
        })
        viewModel.toastText.observe(viewLifecycleOwner, {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })
    }
}