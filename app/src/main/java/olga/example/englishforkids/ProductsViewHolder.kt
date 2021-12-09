package olga.example.englishforkids

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView) {

    private val productsNameTextView: TextView =
        itemView.findViewById(R.id.products_name_text_view)

    fun bind(name:String){
        productsNameTextView.text = name
    }
}
