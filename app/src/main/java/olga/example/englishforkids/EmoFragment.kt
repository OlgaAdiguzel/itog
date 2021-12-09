package olga.example.englishforkids

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class EmoFragment : Fragment() {


    lateinit var happyButton: Button
    lateinit var angryButton: Button
    lateinit var calmButton: Button
    lateinit var hurtButton: Button

    private val emoImageList: List<Int> = listOf(
        R.drawable.happy,
        R.drawable.angry,
        R.drawable.calm,
        R.drawable.hurt,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_emo, container, false)

        happyButton= view.findViewById(R.id.happy_button)
        angryButton= view.findViewById(R.id.angry_button)
        calmButton= view.findViewById(R.id.calm_button)
        hurtButton= view.findViewById(R.id.hurt_button)

        return view
    }


}