package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kz.edu.astanait.android.ilonmaskflighthistory.databinding.ItemFlightHistoryBinding
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.FlightHistoryClickCallbacks
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.FlightHistoryClickHandler

class FlightHistoryPaginationAdapter(
    private val callbacks: FlightHistoryClickCallbacks,
    diffCallback: DiffUtil.ItemCallback<FlightHistory>
) :
    PagingDataAdapter<FlightHistory, FlightHistoryPaginationAdapter.ViewHolder>(diffCallback) {

    companion object {
        @BindingAdapter("bind:imageUrl")
        @JvmStatic
        fun loadImage(imageView: ImageView, v: String?) {
            Picasso.get().load(v).into(imageView)
        }

        @BindingAdapter("bind:linkUrl")
        @JvmStatic
        fun openLink(imageView: ImageView, link: String) {
            imageView.setOnClickListener {
                it.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
            }
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding: ItemFlightHistoryBinding = DataBindingUtil.bind(itemView)!!

        fun bind(currentItem: FlightHistory, callbacks: FlightHistoryClickCallbacks) {
            binding.flightHistory = currentItem
            binding.clickHandler = object : FlightHistoryClickHandler {
                override fun onFlightHistoryClicked(view: View) {
                    callbacks.onFlightHistoryClicked(currentItem)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemFlightHistoryBinding.inflate(LayoutInflater.from(parent.context!!), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem: FlightHistory = getItem(position)!!

        holder.bind(currentItem, callbacks)
    }
}