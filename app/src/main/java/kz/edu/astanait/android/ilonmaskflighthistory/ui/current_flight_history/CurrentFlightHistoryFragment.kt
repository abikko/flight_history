package kz.edu.astanait.android.ilonmaskflighthistory.ui.current_flight_history

import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import kz.edu.astanait.android.ilonmaskflighthistory.R
import kz.edu.astanait.android.ilonmaskflighthistory.databinding.FragmentCurrentFlightHistoryBinding
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.ui.base_classes.BaseFragment

class CurrentFlightHistoryFragment :
    BaseFragment<FragmentCurrentFlightHistoryBinding, CurrentFlightHistoryViewModel>() {

    private val safeArgs: CurrentFlightHistoryFragmentArgs by navArgs()
    private lateinit var currentFlightHistory: FlightHistory

    companion object {
        fun newInstance() = CurrentFlightHistoryFragment()

        @BindingAdapter("app:imageUrl")
        @JvmStatic
        fun ImageLink(imageView: ImageView, url: String) {
            Picasso.get().load(url).into(imageView)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currentFlightHistory = Gson().fromJson(safeArgs.flightHistory, FlightHistory::class.java)
    }

    override fun initObservers() {
    }

    override fun initViews() {
        binding.flightHistory = currentFlightHistory
    }

    override fun setOnClickListeners() {

    }

    override fun getViewModelClass(): Class<CurrentFlightHistoryViewModel> =
        CurrentFlightHistoryViewModel::class.java

    override fun getLayoutId(): Int =
        R.layout.fragment_current_flight_history


}