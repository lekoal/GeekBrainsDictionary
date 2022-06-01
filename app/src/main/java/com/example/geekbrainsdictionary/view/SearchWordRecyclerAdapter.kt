package com.example.geekbrainsdictionary.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.geekbrainsdictionary.R
import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO
import com.example.geekbrainsdictionary.data.web.entity.TranslationDTO

class SearchWordRecyclerAdapter :
    RecyclerView.Adapter<SearchWordRecyclerAdapter.ResultListViewHolder>() {
    private val data: MutableList<TranslationDTO> = mutableListOf()

    inner class ResultListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val resultText: TextView = itemView.findViewById(R.id.rv_search_result_item)

        fun setData(results: List<SearchResultDTO>) {
            results.forEach { searchResult ->
                searchResult.meanings.forEach { meaning ->
                    data.add(meaning.translation)
                }
            }

            notifyItemRangeChanged(0, data.lastIndex)

        }

        fun bind(item: TranslationDTO) {
            resultText.text = item.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_search_result_item, parent, false)
        return ResultListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResultListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = data.size

    private fun getItem(position: Int): TranslationDTO = data[position]

}