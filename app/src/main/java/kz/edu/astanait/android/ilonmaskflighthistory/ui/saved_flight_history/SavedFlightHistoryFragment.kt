package kz.edu.astanait.android.ilonmaskflighthistory.ui.saved_flight_history

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kz.edu.astanait.android.ilonmaskflighthistory.R

class SavedFlightHistoryFragment : Fragment() {

    companion object {
        fun newInstance() = SavedFlightHistoryFragment()
    }

    private lateinit var viewModel: SavedFlightHistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("DEBUG", "onCreateView: created")

        return inflater.inflate(R.layout.fragment_saved_flight_history, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SavedFlightHistoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}