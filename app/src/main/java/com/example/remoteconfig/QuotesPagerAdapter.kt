package com.example.remoteconfig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuotesPagerAdapter(
    private val quotes: List<Quote>
) : RecyclerView.Adapter<QuotesPagerAdapter.QuoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = // 어디서
        QuoteViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_quote, parent, false)
        )

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) { // 뭘
        holder.bind(quotes[position])
    }

    override fun getItemCount() = quotes.size // 얼만큼

    class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val quoteTextView: TextView = itemView.findViewById(R.id.quoteTextView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(quote:Quote){
            quoteTextView.text = quote.quote
            nameTextView.text = quote.name
        }
    }
}