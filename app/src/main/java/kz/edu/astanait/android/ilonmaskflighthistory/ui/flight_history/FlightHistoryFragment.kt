package kz.edu.astanait.android.ilonmaskflighthistory.ui.flight_history

import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.ExperimentalPagingApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kz.edu.astanait.android.ilonmaskflighthistory.R
import kz.edu.astanait.android.ilonmaskflighthistory.databinding.FragmentFlightHistoryBinding
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.FlightHistoryClickCallbacks
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter.FlightHistoryComparator
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter.FlightHistoryPaginationAdapter
import kz.edu.astanait.android.ilonmaskflighthistory.ui.base_classes.BaseFragment

class FlightHistoryFragment : BaseFragment<FragmentFlightHistoryBinding, FlightHistoryViewModel>(),
    FlightHistoryClickCallbacks {

    private lateinit var rvFlightHistory: RecyclerView
    private lateinit var adapter: FlightHistoryPaginationAdapter

    companion object {
        fun newInstance() = FlightHistoryFragment()
    }

    @ExperimentalPagingApi
    override fun initObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.downloadFlightHistory().collect {
                adapter.submitData(viewLifecycleOwner.lifecycle, it)
            }
        }
        rvFlightHistory.scrollToPosition(0)
    }

    override fun initViews() {
        rvFlightHistory = binding.rvFlightHistory
        rvFlightHistory.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        adapter = FlightHistoryPaginationAdapter(this, FlightHistoryComparator)
        rvFlightHistory.adapter = adapter
        rvFlightHistory.itemAnimator = null
        rvFlightHistory.setHasFixedSize(true)
    }

    override fun setOnClickListeners() = Unit

    override fun getViewModelClass(): Class<FlightHistoryViewModel> =
        FlightHistoryViewModel::class.java

    override fun getLayoutId(): Int =
        R.layout.fragment_flight_history

    override fun onFlightHistoryClicked(flightHistory: FlightHistory) {
        val bundle = bundleOf("flightHistory" to Gson().toJson(flightHistory))
        findNavController().navigate(R.id.currentFlightHistoryFragment, bundle)
    }
}