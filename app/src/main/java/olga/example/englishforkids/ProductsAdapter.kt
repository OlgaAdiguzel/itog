package olga.example.englishforkids

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter(private val productsNames: List<String>) :
    RecyclerView.Adapter<ProductsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.products_list_item,parent, false)
        return ProductsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
       val name=productsNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return productsNames.size
    }
}