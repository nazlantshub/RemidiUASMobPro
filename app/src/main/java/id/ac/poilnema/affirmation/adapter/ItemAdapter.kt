package id.ac.poilnema.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

    // Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.

class ItemAdapter {
    private val context: Context,
    private val dataset: List<Affirmation>
} : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Each data item is just an Affirmation object.
    class ItemviewHolder(private val view: View) : RecyclerView.ViewHolder(view)
    (private val textView: TextView = view.findViewById(R.id.item_title))
}