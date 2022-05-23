package developer.abdulahad.viewpagerforfragment.ViewPagerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import developer.abdulahad.viewpagerforfragment.R
import developer.abdulahad.viewpagerforfragment.databinding.FragmentItem1Binding
import developer.abdulahad.viewpagerforfragment.databinding.ItemView2Binding
import developer.abdulahad.viewpagerforfragment.models.User


class ItemFragment1 : Fragment() {
    lateinit var binding: FragmentItem1Binding
    lateinit var user: User
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItem1Binding.inflate(layoutInflater)

        Glide.with(binding.root.context).load(user.imageLink).into(binding.imageView)
        binding.tvItem1.text = user.name

        return binding.root
    }

    fun newInstance(user: User) : Fragment {
        val fragment = ItemFragment1()
        fragment.user = user
        return fragment
    }
 }