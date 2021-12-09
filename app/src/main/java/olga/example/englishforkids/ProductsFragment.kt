package olga.example.englishforkids

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductsFragment : Fragment() {

    lateinit var productsRecyclerView: RecyclerView
    lateinit var site_button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_products, container, false)

        val productsNames:List<String> = listOf("Russian for Kids",
            "Turkish for kids", "German for kids")

        site_button = view.findViewById(R.id.site_button)

        productsRecyclerView = view.findViewById(R.id.products_recycler_view)
        productsRecyclerView.layoutManager=
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        productsRecyclerView.adapter=ProductsAdapter(productsNames)

        site_button.setOnClickListener {
            val link = Uri.parse("https://google.com/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }
}