package com.example.a203310048_vitonvaribasa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a203310048_vitonvaribasa.R
import com.example.a203310048_vitonvaribasa.model.Affirmation

//membuat kelas adapter untuk RecyclerView di MainActivity yang nantinya akan menampilkan data object dari class affirmation
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Memberikan referensi ke tampilan untuk setiap item, Item data kompleks memerlukan lebih dari satu tampilan per item
    // dan pada setiap item data adalah bentuk dari objek Afirmasi.
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // Membuat tampilan baru yaitu viewgroup, viewtype beserta ItemViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //Mengganti tampilan konten sesuai dengan dataset positon itemviewholder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // Mengembalikan ukuran pada setiap data yang dipanggil dari layout
    override fun getItemCount() = dataset.size
}