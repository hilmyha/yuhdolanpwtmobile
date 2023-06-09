package com.example.yuhdolanpwtmobile.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.Adapter.ArticleAdapter
import com.example.yuhdolanpwtmobile.Adapter.CategoryAdapter
import com.example.yuhdolanpwtmobile.Adapter.DestinasiAdapter
import com.example.yuhdolanpwtmobile.R
import com.example.yuhdolanpwtmobile.SinglePageActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var rvDestinasi: RecyclerView
    private lateinit var adapter: DestinasiAdapter

    private lateinit var rvCategory: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter

    private lateinit var rvArticle: RecyclerView
    private lateinit var articleAdapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvDestinasi = view.findViewById(R.id.rv_destination)
        adapter = DestinasiAdapter()

        rvCategory = view.findViewById(R.id.rv_category)
        categoryAdapter = CategoryAdapter()

        rvArticle = view.findViewById(R.id.rv_article)
        articleAdapter = ArticleAdapter()

        destinasiView()
        categoryView()
        articleView()
    }

    private fun destinasiView() {
        rvDestinasi.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        rvDestinasi.adapter = adapter
    }

    private fun categoryView() {
        rvCategory.layoutManager = GridLayoutManager(activity, 3)
        rvCategory.adapter = categoryAdapter
    }

    private fun articleView() {
        rvArticle.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        rvArticle.adapter = articleAdapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}